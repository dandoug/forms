
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
        <a href="https://maps.google.com/maps?q="""),_display_(Seq[Any](/*8.50*/point/*8.55*/.latlon)),format.raw/*8.62*/("""" target="_blank">"""),_display_(Seq[Any](/*8.81*/point/*8.86*/.latlon)),format.raw/*8.93*/("""</a>
    </p>
    
           """),_display_(Seq[Any](/*11.13*/if(point.results!= null && point.results.size > 0)/*11.63*/ {_display_(Seq[Any](format.raw/*11.65*/("""
            
            <h6>Results</h6>
            
            <ul>
                """),_display_(Seq[Any](/*16.18*/point/*16.23*/.results.map/*16.35*/ { result =>_display_(Seq[Any](format.raw/*16.47*/("""
                    <li><b>"""),_display_(Seq[Any](/*17.29*/result/*17.35*/.name)),format.raw/*17.40*/("""</b>
                    	<ul>
                    		<li><a href="https://maps.google.com/maps?saddr="""),_display_(Seq[Any](/*19.72*/point/*19.77*/.latlon)),format.raw/*19.84*/("""&daddr="""),_display_(Seq[Any](/*19.92*/result/*19.98*/.location)),format.raw/*19.107*/("""" target="_blank">"""),_display_(Seq[Any](/*19.126*/result/*19.132*/.street)),format.raw/*19.139*/(""", """),_display_(Seq[Any](/*19.142*/result/*19.148*/.city)),format.raw/*19.153*/(""", """),_display_(Seq[Any](/*19.156*/result/*19.162*/.state)),format.raw/*19.168*/(""", """),_display_(Seq[Any](/*19.171*/result/*19.177*/.zip)),format.raw/*19.181*/("""</a></li>
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
                    DATE: Wed Sep 25 09:24:23 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/search/summary.scala.html
                    HASH: a2669d6d779f87e34a62853f071f76106bb7c62e
                    MATRIX: 782->1|890->15|927->18|989->72|1028->74|1166->177|1179->182|1207->189|1261->208|1274->213|1302->220|1369->251|1428->301|1468->303|1594->393|1608->398|1629->410|1679->422|1744->451|1759->457|1786->462|1924->564|1938->569|1967->576|2011->584|2026->590|2058->599|2114->618|2130->624|2160->631|2200->634|2216->640|2244->645|2284->648|2300->654|2329->660|2369->663|2385->669|2412->673|2481->706|2541->757|2581->759|2645->787|2660->793|2688->799|2749->828|2813->856|2867->888|2986->975|3059->1016|3105->1026|3165->1077|3205->1079|3311->1153|3399->1205|3414->1211|3449->1224
                    LINES: 26->1|29->1|31->3|31->3|31->3|36->8|36->8|36->8|36->8|36->8|36->8|39->11|39->11|39->11|44->16|44->16|44->16|44->16|45->17|45->17|45->17|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|51->23|51->23|54->26|57->29|58->30|58->30|58->30|60->32|63->35|63->35|63->35
                    -- GENERATED --
                */
            