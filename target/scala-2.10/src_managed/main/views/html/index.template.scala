
package views.html

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Html("Playground"))/*1.26*/ {_display_(Seq[Any](format.raw/*1.28*/("""
    

    <h2>Search </h2>
    
    <p>
        Search for Starbucks near a point.
    </p>
    
    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*11.31*/routes/*11.37*/.Search.blank)),format.raw/*11.50*/("""">Find Starbucks »</a>
    </p>
    
    
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 24 22:33:46 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/index.scala.html
                    HASH: a8d7e70d6e2131e8752ff67994da93cbc2ac26bf
                    MATRIX: 864->1|896->25|935->27|1107->163|1122->169|1157->182
                    LINES: 29->1|29->1|29->1|39->11|39->11|39->11
                    -- GENERATED --
                */
            