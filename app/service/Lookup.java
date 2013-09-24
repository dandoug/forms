package service;

import static models.SearchResult.QUERY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import models.SearchResult;
import play.libs.F.Function;
import play.libs.F.Promise;
import play.libs.WS;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Lookup {
	
	private static final String searchUrl = "http://elastic-dandoug.rhcloud.com/_search";
	
	private static ObjectMapper mapper = new ObjectMapper();

	public static List<SearchResult> findStarbucks(double lat, double lon) {
		
		String query =  String.format(QUERY,lat,lon,lat,lon,lat,lon);
		
		Promise<List<SearchResult>> result = WS.url(searchUrl).post(query).map(
	            new Function<WS.Response, List<SearchResult>>() {
	                public List<SearchResult> apply(WS.Response response) {
	                	JsonNode hits = response.asJson().findPath("hits").path("hits");
	                	// hits hsould be an array of hits
	                	if (hits.isArray()) {
	                		ArrayNode arr = (ArrayNode)hits;
	                		List<SearchResult> results = new ArrayList<>(arr.size());
	                		for (int i = 0; i<arr.size(); i++) {
	                			JsonNode n = arr.get(i).path("fields");
	                			SearchResult r = null;
								try {
									r = mapper.treeToValue(n, SearchResult.class);
								} catch (JsonProcessingException e) {
									e.printStackTrace();
								}
								if (r != null) {
									results.add(r);
								}
	                		}
	                		return results;
	                	} else {
	                		return Collections.emptyList();
	                	}
	                }
	            }
	    );
		
		
		
		return result.get(5, TimeUnit.SECONDS);  // get mad if we we don't get a response in 5 seconds
	}
}
