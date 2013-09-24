
package views.html.wizard

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
object form2 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signupForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
    Sign Up 2/2
""")))};
Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "wizard")/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""
    
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.Wizard.submit(2))/*12.51*/ {_display_(Seq[Any](format.raw/*12.53*/("""  

	<input type="hidden" name="username" value=""""),_display_(Seq[Any](/*14.47*/signupForm("username")/*14.69*/.value)),format.raw/*14.75*/("""">
	<input type="hidden" name="email" value=""""),_display_(Seq[Any](/*15.44*/signupForm("email")/*15.63*/.value)),format.raw/*15.69*/("""">
	<input type="hidden" name="password" value=""""),_display_(Seq[Any](/*16.47*/signupForm("password")/*16.69*/.value)),format.raw/*16.75*/("""">
	<fieldset>
        
        <legend>Contact information</legend>
        
        """),_display_(Seq[Any](/*21.10*/select(
            signupForm("profile.country"), 
            options = options(Countries.list),
            '_default -> "--- Choose a country ---",
            '_label -> "Country",
            '_error -> signupForm("profile.country").error.map(_.withMessage("Please select your country"))
        ))),format.raw/*27.10*/("""
        
        """),_display_(Seq[Any](/*29.10*/textarea(
            signupForm("profile.address"), 
            '_label -> "Address", 'cols -> 50
        ))),format.raw/*32.10*/("""
        
        """),_display_(Seq[Any](/*34.10*/inputText(
            signupForm("profile.age"), 
            '_label -> "Age", 'class -> "mini",
            '_showConstraints -> false
        ))),format.raw/*38.10*/("""
          
    </fieldset>
    
    <fieldset>
        
        """),_display_(Seq[Any](/*44.10*/checkbox(
            signupForm("accept"), 
            '_label -> None, '_text -> "You agree to the terms and conditions",
            '_showConstraints -> false
        ))),format.raw/*48.10*/("""
        
    </fieldset>
    
    <div class="actions">
        <input type="submit" name="action" class="btn primary" value="Sign Up!">
        <input type="submit" name="action" class="btn" value="Previous">
    </div>
  """)))})),format.raw/*56.4*/("""
""")))})))}
    }
    
    def render(signupForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 24 01:02:34 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/wizard/form2.scala.html
                    HASH: 0ef525779911abc1e10bac6eff988e9f32cf13e3
                    MATRIX: 785->1|936->80|948->85|1032->89|1089->25|1117->78|1144->107|1182->110|1218->137|1258->139|1304->150|1319->156|1367->195|1407->197|1493->247|1524->269|1552->275|1634->321|1662->340|1690->346|1775->395|1806->417|1834->423|1957->510|2282->813|2337->832|2468->941|2523->960|2692->1107|2794->1173|2989->1346|3245->1571
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|52->21|58->27|60->29|63->32|65->34|69->38|75->44|79->48|87->56
                    -- GENERATED --
                */
            