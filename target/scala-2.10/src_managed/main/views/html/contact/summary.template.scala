
package views.html.contact

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
object summary extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Contact,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(contact: Contact):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/(""" 

"""),_display_(Seq[Any](/*3.2*/main(Html("Contact created!"), nav = "contact")/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/("""
    
    <h2>"""),_display_(Seq[Any](/*5.10*/contact/*5.17*/.firstname)),format.raw/*5.27*/(""" """),_display_(Seq[Any](/*5.29*/contact/*5.36*/.lastname)),format.raw/*5.45*/("""</h2>
    
    <h6>Company</h6>
    
    <p>
        """),_display_(Seq[Any](/*10.10*/if(contact.company == null || contact.company == "")/*10.62*/ {_display_(Seq[Any](format.raw/*10.64*/("""
            <em>Not specified</em>
        """)))}/*12.11*/else/*12.16*/{_display_(Seq[Any](format.raw/*12.17*/("""
            """),_display_(Seq[Any](/*13.14*/contact/*13.21*/.company)),format.raw/*13.29*/("""
        """)))})),format.raw/*14.10*/("""
    </p>
    
    """),_display_(Seq[Any](/*17.6*/contact/*17.13*/.informations.map/*17.30*/ { information =>_display_(Seq[Any](format.raw/*17.47*/("""
        
        <h3>"""),_display_(Seq[Any](/*19.14*/information/*19.25*/.label)),format.raw/*19.31*/(""":</h3>
        
        <h6>Email</h6>

        <p>
            """),_display_(Seq[Any](/*24.14*/if(information.email == null || information.email == "")/*24.70*/ {_display_(Seq[Any](format.raw/*24.72*/("""
                <em>Not specified</em>
            """)))}/*26.15*/else/*26.20*/{_display_(Seq[Any](format.raw/*26.21*/("""
                """),_display_(Seq[Any](/*27.18*/information/*27.29*/.email)),format.raw/*27.35*/("""
            """)))})),format.raw/*28.14*/("""
        </p>
        
        """),_display_(Seq[Any](/*31.10*/if(information.phones!= null && information.phones.size > 0)/*31.70*/ {_display_(Seq[Any](format.raw/*31.72*/("""
            
            <h6>Phones</h6>
            
            <ul>
                """),_display_(Seq[Any](/*36.18*/information/*36.29*/.phones.map/*36.40*/ { phone =>_display_(Seq[Any](format.raw/*36.51*/("""
                    <li>"""),_display_(Seq[Any](/*37.26*/phone/*37.31*/.number)),format.raw/*37.38*/("""</li>
                """)))})),format.raw/*38.18*/("""
            </ul>
            
        """)))})),format.raw/*41.10*/("""
        
    """)))})),format.raw/*43.6*/("""
    
""")))})))}
    }
    
    def render(contact:Contact): play.api.templates.HtmlFormat.Appendable = apply(contact)
    
    def f:((Contact) => play.api.templates.HtmlFormat.Appendable) = (contact) => apply(contact)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 24 01:02:33 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/contact/summary.scala.html
                    HASH: cd0fbc2e7ecec55c9e2026f02e14cab70c4ed124
                    MATRIX: 785->1|897->19|935->23|990->70|1029->72|1079->87|1094->94|1125->104|1162->106|1177->113|1207->122|1297->176|1358->228|1398->230|1462->276|1475->281|1514->282|1564->296|1580->303|1610->311|1652->321|1707->341|1723->348|1749->365|1804->382|1863->405|1883->416|1911->422|2012->487|2077->543|2117->545|2189->599|2202->604|2241->605|2295->623|2315->634|2343->640|2389->654|2457->686|2526->746|2566->748|2691->837|2711->848|2731->859|2780->870|2842->896|2856->901|2885->908|2940->931|3013->972|3059->987
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|33->5|33->5|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|45->17|45->17|45->17|45->17|47->19|47->19|47->19|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|56->28|59->31|59->31|59->31|64->36|64->36|64->36|64->36|65->37|65->37|65->37|66->38|69->41|71->43
                    -- GENERATED --
                */
            