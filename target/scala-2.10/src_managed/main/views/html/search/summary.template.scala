
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

"""),_display_(Seq[Any](/*3.2*/main(Html("Search results"), nav = "search")/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""
    
    <h2>Starbucks:</h2>
    
    <h6>Starting location</h6>
    
    <p>
        """),_display_(Seq[Any](/*10.10*/point/*10.15*/.latlon)),format.raw/*10.22*/("""
    </p>
    
           """),_display_(Seq[Any](/*13.13*/if(point.results!= null && point.results.size > 0)/*13.63*/ {_display_(Seq[Any](format.raw/*13.65*/("""
            
            <h6>Results</h6>
            
            <ul>
                """),_display_(Seq[Any](/*18.18*/point/*18.23*/.results.map/*18.35*/ { result =>_display_(Seq[Any](format.raw/*18.47*/("""
                    <li><b>"""),_display_(Seq[Any](/*19.29*/result/*19.35*/.name)),format.raw/*19.40*/("""</b>
                    	<ul>
                    		<li>"""),_display_(Seq[Any](/*21.28*/result/*21.34*/.street)),format.raw/*21.41*/(""", """),_display_(Seq[Any](/*21.44*/result/*21.50*/.city)),format.raw/*21.55*/(""", """),_display_(Seq[Any](/*21.58*/result/*21.64*/.state)),format.raw/*21.70*/(""", """),_display_(Seq[Any](/*21.73*/result/*21.79*/.zip)),format.raw/*21.83*/("""</li>
                    		<li>"""),_display_(Seq[Any](/*22.28*/result/*22.34*/.phone)),format.raw/*22.40*/("""</li>
                    		<li>"""),_display_(Seq[Any](/*23.28*/result/*23.34*/.distance)),format.raw/*23.43*/(""" miles away</li>
                    	</ul>
                    </li>
                """)))})),format.raw/*26.18*/("""
            </ul>
            
        """)))})),format.raw/*29.10*/("""
    
""")))})))}
    }
    
    def render(point:Point): play.api.templates.HtmlFormat.Appendable = apply(point)
    
    def f:((Point) => play.api.templates.HtmlFormat.Appendable) = (point) => apply(point)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 24 01:02:34 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/search/summary.scala.html
                    HASH: ae5c25bb2749980d2682e978e29c21f071346fae
                    MATRIX: 782->1|890->15|927->18|979->62|1018->64|1142->152|1156->157|1185->164|1248->191|1307->241|1347->243|1473->333|1487->338|1508->350|1558->362|1623->391|1638->397|1665->402|1759->460|1774->466|1803->473|1842->476|1857->482|1884->487|1923->490|1938->496|1966->502|2005->505|2020->511|2046->515|2115->548|2130->554|2158->560|2227->593|2242->599|2273->608|2392->695|2465->736
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|41->13|41->13|41->13|46->18|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|49->21|49->21|49->21|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|54->26|57->29
                    -- GENERATED --
                */
            