package controllers;

import static play.data.Form.form;
import models.Point;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.search.form;

public class Application extends Controller {
  
	final static Form<Point> searchForm = form(Point.class, Point.All.class);
	
    public static Result index() {
        return ok(form.render(searchForm));
    }
  
}