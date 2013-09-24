package models;

public class SearchResult {

	public String zip; 			// 95030
	public double distance; 	// 1.0233537601008358
	public String phone; 		// (408) 395-6912
	public String location; 	// 37.230478,-121.980268
	public String street; 		// 442 N. Santa Cruz Avenue
	public String name; 		// Starbucks Los Gatos - Santa Cruz and Hwy 9
	public String state; 		// CA
	public String city; 		// Los Gatos

	
	// Plug in points using  String.format(QUERY,lat,lon,lat,lon,lat,lon)
	public static final String QUERY = 
		"{"+
		  "\"sort\": ["+
		    "{"+
		      "\"_geo_distance\": {"+
		        "\"location\": {"+
		          "\"lat\": %f,"+
		          "\"lon\": %f"+
		        "},"+
		        "\"order\": \"asc\","+
		        "\"unit\": \"mi\""+
		      "}"+
		    "}"+
		  "],"+
		  "\"from\": 0,"+
		  "\"size\": 5,"+
		  "\"query\": {"+
		    "\"filtered\": {"+
		     "\"query\": {"+
		        "\"field\": {"+
		          "\"cat\": \"sb\""+
		        "}"+
		      "},"+
		      "\"filter\": {"+
		        "\"geo_distance\": {"+
		          "\"distance\": \"5mi\","+
		          "\"location\": {"+
		            "\"lat\": %f,"+
		            "\"lon\": %f"+
		          "}"+
		        "}"+
		      "}"+
		    "}"+
		  "},"+
		  "\"fields\": ["+
		    "\"location\","+
		    "\"name\","+
		    "\"street\","+
		    "\"city\","+
		    "\"state\","+
		    "\"zip\","+
		    "\"phone\""+
		  "],"+
		  "\"script_fields\": {"+
		    "\"distance\": {"+
		      "\"parms\": {"+
		        "\"lat\": %f,"+
		        "\"lon\": %f"+
		      "},"+
		      "\"script\": \"doc['location'].arcDistanceInKm(lat,lon)*0.621371192237\""+
		    "}"+
		  "}"+
		"}";
	
}
