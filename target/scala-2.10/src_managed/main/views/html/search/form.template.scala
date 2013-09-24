
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
        
        <fieldset>
            <legend>Point Information</legend>
            
            """),_display_(Seq[Any](/*17.14*/inputText(
                searchForm("latlon"), 
                '_label -> "Lat,Lon", 
                '_help -> "Please enter lat,lon. For example 37.2163,-121.97496",
                '_error -> searchForm.globalError
            ))),format.raw/*22.14*/("""
        </fieldset>
        
        
        
        <div class="actions">
            <input type="submit" class="btn primary" value="Search">
            <a href=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Application.index)),format.raw/*29.47*/("""" class="btn">Cancel</a>
        </div>
        
    """)))})),format.raw/*32.6*/("""
    
""")))})))}
    }
    
    def render(searchForm:Form[Point]): play.api.templates.HtmlFormat.Appendable = apply(searchForm)
    
    def f:((Form[Point]) => play.api.templates.HtmlFormat.Appendable) = (searchForm) => apply(searchForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 24 00:00:43 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/search/form.scala.html
                    HASH: a9cea164b28545433451fd2444afcb56030d7b09
                    MATRIX: 785->1|937->81|949->86|1033->90|1096->26|1124->79|1151->114|1189->117|1225->144|1265->146|1311->157|1326->163|1371->199|1411->201|1549->303|1805->537|2010->706|2025->712|2065->730|2150->784
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|43->12|48->17|53->22|60->29|60->29|60->29|63->32
                    -- GENERATED --
                */
            