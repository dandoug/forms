package controllers;

import java.util.List;

import play.mvc.*;
import play.data.*;
import service.Lookup;
import static play.data.Form.*;
import views.html.search.*;
import models.*;

public class Search extends Controller {
    
    /**
     * Defines a form wrapping the Point class.
     */ 
    final static Form<Point> searchForm = form(Point.class, Point.All.class);
  
    /**
     * Display a blank form.
     */ 
    public static Result blank() {
        return ok(form.render(searchForm));
    }
  
  
    /**
     * Handle the form submission.
     */
    public static Result submit() {
        Form<Point> filledForm = searchForm.bindFromRequest();
        
        // Check format of lat,lon
        List<SearchResult> locs = null;
        if(!filledForm.field("latlon").valueOr("").isEmpty()) {
            String latlon = filledForm.field("latlon").value();
            double lat, lon;
            try {
            	String[] parts = latlon.split(",");
            	lat = Double.parseDouble(parts[0]);
            	lon = Double.parseDouble(parts[1]);
            	
            	locs = Lookup.findStarbucks(lat, lon);
            	
            } catch (Exception e) {
            	e.printStackTrace();
            	filledForm.reject("latlon", "Bad input format");
            }
        }        
        
        if(filledForm.hasErrors()) {
            return badRequest(form.render(filledForm));
        } else {
        	Point entered = filledForm.get();
        	entered.results = locs;
            return ok(summary.render(entered));
        }
        
        
    }
  
}