
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
object summary extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Point,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(point: Point):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html("Starbucks search results"), nav = "search")/*3.56*/ {_display_(Seq[Any](format.raw/*3.58*/("""
        
    <h6>Starting location</h6>
    
    <p>
        """),_display_(Seq[Any](/*8.10*/point/*8.15*/.latlon)),format.raw/*8.22*/("""
    </p>
    
           """),_display_(Seq[Any](/*11.13*/if(point.results!= null && point.results.size > 0)/*11.63*/ {_display_(Seq[Any](format.raw/*11.65*/("""
            
            <h6>Results</h6>
            
            <ul>
                """),_display_(Seq[Any](/*16.18*/point/*16.23*/.results.map/*16.35*/ { result =>_display_(Seq[Any](format.raw/*16.47*/("""
                    <li><b>"""),_display_(Seq[Any](/*17.29*/result/*17.35*/.name)),format.raw/*17.40*/("""</b>
                    	<ul>
                    		<li>"""),_display_(Seq[Any](/*19.28*/result/*19.34*/.street)),format.raw/*19.41*/(""", """),_display_(Seq[Any](/*19.44*/result/*19.50*/.city)),format.raw/*19.55*/(""", """),_display_(Seq[Any](/*19.58*/result/*19.64*/.state)),format.raw/*19.70*/(""", """),_display_(Seq[Any](/*19.73*/result/*19.79*/.zip)),format.raw/*19.83*/("""</li>
                    		"""),_display_(Seq[Any](/*20.24*/if(result.phone != null && result.phone.length > 0)/*20.75*/ {_display_(Seq[Any](format.raw/*20.77*/("""
                    		<li>"""),_display_(Seq[Any](/*21.28*/result/*21.34*/.phone)),format.raw/*21.40*/("""</li>
                    		""")))})),format.raw/*22.24*/("""
                    		<li>"""),_display_(Seq[Any](/*23.28*/("%.2f".format(result.distance)))),format.raw/*23.60*/(""" miles away</li>
                    	</ul>
                    </li>
                """)))})),format.raw/*26.18*/("""
            </ul>
            
        """)))})),format.raw/*29.10*/("""
        """),_display_(Seq[Any](/*30.10*/if(point.results== null || point.results.size <= 0)/*30.61*/ {_display_(Seq[Any](format.raw/*30.63*/("""
        	<h6>No Starbucks within 5 miles of that location.</h6>
        """)))})),format.raw/*32.10*/("""
        
        <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*35.31*/routes/*35.37*/.Search.blank)),format.raw/*35.50*/("""">Search again</a>
       </p>
    
""")))})))}
    }
    
    def render(point:Point): play.api.templates.HtmlFormat.Appendable = apply(point)
    
    def f:((Point) => play.api.templates.HtmlFormat.Appendable) = (point) => apply(point)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 24 22:41:28 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/search/summary.scala.html
                    HASH: 22ae45ab8c20e2ed458db2d54b18d0751d67b3f0
                    MATRIX: 782->1|890->15|927->18|989->72|1028->74|1126->137|1139->142|1167->149|1230->176|1289->226|1329->228|1455->318|1469->323|1490->335|1540->347|1605->376|1620->382|1647->387|1741->445|1756->451|1785->458|1824->461|1839->467|1866->472|1905->475|1920->481|1948->487|1987->490|2002->496|2028->500|2093->529|2153->580|2193->582|2257->610|2272->616|2300->622|2361->651|2425->679|2479->711|2598->798|2671->839|2717->849|2777->900|2817->902|2923->976|3011->1028|3026->1034|3061->1047
                    LINES: 26->1|29->1|31->3|31->3|31->3|36->8|36->8|36->8|39->11|39->11|39->11|44->16|44->16|44->16|44->16|45->17|45->17|45->17|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|51->23|51->23|54->26|57->29|58->30|58->30|58->30|60->32|63->35|63->35|63->35
                    -- GENERATED --
                */
            