
package views.html.search

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Point],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(searchForm: Form[Point]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
    Find a Starbucks 
""")))};
Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "search")/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""
    
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.Search.submit)/*12.48*/ {_display_(Seq[Any](format.raw/*12.50*/("""
    
    	<script>
			var x=document.getElementById("latlon");
			function getLocation()
  			"""),format.raw/*17.6*/("""{"""),format.raw/*17.7*/("""
				x=document.getElementById("latlon");
  				if (navigator.geolocation)
    			"""),format.raw/*20.8*/("""{"""),format.raw/*20.9*/("""
    				navigator.geolocation.getCurrentPosition(showPosition);
    			"""),format.raw/*22.8*/("""}"""),format.raw/*22.9*/("""
  				else"""),format.raw/*23.11*/("""{"""),format.raw/*23.12*/("""
  					x.value="Geolocation is not supported by this browser.";"""),format.raw/*24.64*/("""}"""),format.raw/*24.65*/("""
  			"""),format.raw/*25.6*/("""}"""),format.raw/*25.7*/("""
			function showPosition(position)
  			"""),format.raw/*27.6*/("""{"""),format.raw/*27.7*/("""
  				x.value="" + position.coords.latitude +","+position.coords.longitude;
  			"""),format.raw/*29.6*/("""}"""),format.raw/*29.7*/("""
		</script>
        
        <fieldset>
            <legend>Starting point for search</legend>
            
            """),_display_(Seq[Any](/*35.14*/inputText(
                searchForm("latlon"), 
                '_label -> "Lat,Lon like 37.2163,-121.97496", 
                '_help -> "or enter address then Geocode",
                '_error -> searchForm.globalError
            ))),format.raw/*40.14*/("""
        </fieldset>
        
        
        
        <div class="actions">
            <input type="submit" class="btn primary" value="Search">
            <a class="btn" onclick="clearform()">Clear</a><br><br>
            <a class="btn" onclick="getLocation()">Current Location</a>
            <a class="btn" onclick="geocodeAddress()">Geocode</a>
        </div>
        
    """)))})),format.raw/*52.6*/("""
    
""")))})))}
    }
    
    def render(searchForm:Form[Point]): play.api.templates.HtmlFormat.Appendable = apply(searchForm)
    
    def f:((Form[Point]) => play.api.templates.HtmlFormat.Appendable) = (searchForm) => apply(searchForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 09:24:23 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/search/form.scala.html
                    HASH: ef3a8a8f8561fd8b55d34605fc0e917ea0541379
                    MATRIX: 785->1|937->81|949->86|1033->90|1096->26|1124->79|1151->114|1189->117|1225->144|1265->146|1311->157|1326->163|1371->199|1411->201|1533->296|1561->297|1670->379|1698->380|1797->452|1825->453|1864->464|1893->465|1985->529|2014->530|2047->536|2075->537|2143->578|2171->579|2280->661|2308->662|2466->784|2723->1019|3135->1400
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|43->12|48->17|48->17|51->20|51->20|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|58->27|58->27|60->29|60->29|66->35|71->40|83->52
                    -- GENERATED --
                */
            