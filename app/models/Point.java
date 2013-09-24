package models;


import java.util.List;

import play.data.validation.Constraints.MinLength;
import play.data.validation.Constraints.Required;

public class Point {

	public interface All {}

    @Required(groups = {All.class})
    @MinLength(value = 4, groups = {All.class})
	public String latlon;

    
    public List<SearchResult> results;
    
	public Point() {
	}
		
	public Point(String latlon) {
		super();
		this.latlon = latlon;
	}
	
    
}
