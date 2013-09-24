
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
object summary extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html("Account created!"), nav = "wizard")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
    
    <h2>Your account:</h2>
    
    <h6>Username</h6>
    
    <p>
        """),_display_(Seq[Any](/*10.10*/user/*10.14*/.username)),format.raw/*10.23*/("""
    </p>
    
    <h6>Email</h6>
    
    <p>
        """),_display_(Seq[Any](/*16.10*/user/*16.14*/.email)),format.raw/*16.20*/("""
    </p>
    
    <h6>Password</h6>
    
    <p>
        """),_display_(Seq[Any](/*22.10*/user/*22.14*/.password)),format.raw/*22.23*/("""
    </p>
    
    <h2>Additional informations:</h2>
    
    <h6>Country</h6>
    
    <p>
        """),_display_(Seq[Any](/*30.10*/user/*30.14*/.profile.country)),format.raw/*30.30*/("""
    </p>
    
    <h6>Address</h6>
    
    <p>
        """),_display_(Seq[Any](/*36.10*/if(user.profile.address == null || user.profile.address == "")/*36.72*/ {_display_(Seq[Any](format.raw/*36.74*/("""
            <em>Not specified</em>
        """)))}/*38.11*/else/*38.16*/{_display_(Seq[Any](format.raw/*38.17*/("""
            """),_display_(Seq[Any](/*39.14*/user/*39.18*/.profile.address)),format.raw/*39.34*/("""
        """)))})),format.raw/*40.10*/("""
    </p>
    
    <h6>Age</h6>
    
    <p>
        """),_display_(Seq[Any](/*46.10*/if(user.profile.age == null)/*46.38*/ {_display_(Seq[Any](format.raw/*46.40*/("""
            <em>Not specified</em>
        """)))}/*48.11*/else/*48.16*/{_display_(Seq[Any](format.raw/*48.17*/("""
            """),_display_(Seq[Any](/*49.14*/user/*49.18*/.profile.age)),format.raw/*49.30*/("""
        """)))})),format.raw/*50.10*/("""
    </p>
    
""")))})))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 23 23:31:55 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/wizard/summary.scala.html
                    HASH: 6bc5e05e2510606fc3a81dbf5785ca1f49bf044f
                    MATRIX: 781->1|887->13|924->16|978->62|1017->64|1135->146|1148->150|1179->159|1271->215|1284->219|1312->225|1407->284|1420->288|1451->297|1588->398|1601->402|1639->418|1733->476|1804->538|1844->540|1908->586|1921->591|1960->592|2010->606|2023->610|2061->626|2103->636|2193->690|2230->718|2270->720|2334->766|2347->771|2386->772|2436->786|2449->790|2483->802|2525->812
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|44->16|44->16|44->16|50->22|50->22|50->22|58->30|58->30|58->30|64->36|64->36|64->36|66->38|66->38|66->38|67->39|67->39|67->39|68->40|74->46|74->46|74->46|76->48|76->48|76->48|77->49|77->49|77->49|78->50
                    -- GENERATED --
                */
            