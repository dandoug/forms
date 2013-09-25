
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
object form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Contact],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(contactForm: Form[Contact]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
    Add a new contact <small><a href=""""),_display_(Seq[Any](/*7.40*/routes/*7.46*/.Contacts.edit)),format.raw/*7.60*/("""">Or edit an existing contact</a></small>
""")))};def /*10.2*/phoneField/*10.12*/(field: Field, className: String = "phone"):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.59*/("""
    """),_display_(Seq[Any](/*11.6*/input(field, '_label -> "Phone numbers", '_class -> className)/*11.68*/ { (id, name, value, _) =>_display_(Seq[Any](format.raw/*11.94*/("""
        <input type="text" name=""""),_display_(Seq[Any](/*12.35*/name)),format.raw/*12.39*/("""" value=""""),_display_(Seq[Any](/*12.49*/value)),format.raw/*12.54*/(""""> 
        <a class="removePhone btn danger">Remove</a>
    """)))})),format.raw/*14.6*/("""
""")))};def /*17.2*/informationGroup/*17.18*/(field: Field, className: String = "profile"):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.67*/("""
    <div class="twipsies well """),_display_(Seq[Any](/*18.32*/className)),format.raw/*18.41*/("""">
        
        <a class="removeProfile btn danger pull-right">Remove this profile</a>

        """),_display_(Seq[Any](/*22.10*/inputText(
            field("label"), 
            '_label -> "Label"
        ))),format.raw/*25.10*/("""

        """),_display_(Seq[Any](/*27.10*/inputText(
            field("email"), 
            '_label -> "Email"
        ))),format.raw/*30.10*/("""
        
        <div class="phones">

            """),_display_(Seq[Any](/*34.14*/repeat(field("phones"), min = 0)/*34.46*/ { phone =>_display_(Seq[Any](format.raw/*34.57*/("""
                
                """),_display_(Seq[Any](/*36.18*/phoneField(phone("number")))),format.raw/*36.45*/("""
    
            """)))})),format.raw/*38.14*/("""
            
            """),format.raw/*42.17*/("""
            """),_display_(Seq[Any](/*43.14*/phoneField(
                field("phones[x].number"),
                className = "phone_template"
            ))),format.raw/*46.14*/("""
            
            <div class="clearfix">
                <div class="input">
                    <a class="addPhone btn success">Add a phone number</a>
                </div>
            </div>
        
        </div>

    </div>
""")))};
Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),format.raw/*15.2*/("""

"""),format.raw/*57.2*/("""

"""),_display_(Seq[Any](/*59.2*/main(title, nav = "contact")/*59.30*/ {_display_(Seq[Any](format.raw/*59.32*/("""
    
    """),_display_(Seq[Any](/*61.6*/if(contactForm.hasErrors)/*61.31*/ {_display_(Seq[Any](format.raw/*61.33*/("""
        <div class="alert-message error">
            <p><strong>Oops</strong> Please fix all errors</p>
        </div>
    """)))})),format.raw/*65.6*/("""
    
    """),_display_(Seq[Any](/*67.6*/helper/*67.12*/.form(action = routes.Contacts.submit, 'id -> "form")/*67.65*/ {_display_(Seq[Any](format.raw/*67.67*/("""
        
        <fieldset>
            <legend>General information</legend>
            
            """),_display_(Seq[Any](/*72.14*/inputText(
                contactForm("firstname"), 
                '_label -> "First name"
            ))),format.raw/*75.14*/("""
            
            """),_display_(Seq[Any](/*77.14*/inputText(
                contactForm("lastname"), 
                '_label -> "Last name"
            ))),format.raw/*80.14*/("""
            
            """),_display_(Seq[Any](/*82.14*/inputText(
                contactForm("company"), 
                '_label -> "Company"
            ))),format.raw/*85.14*/("""
            
        </fieldset>
        
        <fieldset>
            <legend>Profiles</legend>
            
            <div id="profiles">
            
                """),_display_(Seq[Any](/*94.18*/repeat(contactForm("informations"))/*94.53*/ { information =>_display_(Seq[Any](format.raw/*94.70*/("""
                
                    """),_display_(Seq[Any](/*96.22*/informationGroup(information))),format.raw/*96.51*/("""
                
                """)))})),format.raw/*98.18*/("""
                
                """),format.raw/*102.21*/("""
                """),_display_(Seq[Any](/*103.18*/informationGroup(
                    contactForm("informations[x]"),
                    className = "profile_template"
                ))),format.raw/*106.18*/("""
                
                <div class="manage">
                    <a class="addProfile btn success">Add another profile</a>
                </div>
            
            </div>
            
        </fieldset>
        
        <div class="actions">
            <input type="submit" class="btn primary" value="Insert">
            <a href=""""),_display_(Seq[Any](/*118.23*/routes/*118.29*/.Application.index)),format.raw/*118.47*/("""" class="btn">Cancel</a>
        </div>
        
    """)))})),format.raw/*121.6*/("""
    
    <script type="text/javascript" charset="utf-8">
        
        $('.removeProfile').live('click', function(e) """),format.raw/*125.55*/("""{"""),format.raw/*125.56*/("""
            $(this).parents('.profile').remove()
            renumber()
        """),format.raw/*128.9*/("""}"""),format.raw/*128.10*/(""")
        
        $('.removePhone').live('click', function(e) """),format.raw/*130.53*/("""{"""),format.raw/*130.54*/("""
            var phones = $(this).parents('.phones')
            $(this).parents('.phone').remove()
            renumber(phones)
        """),format.raw/*134.9*/("""}"""),format.raw/*134.10*/(""")
        
        $('.addPhone').live('click', function(e) """),format.raw/*136.50*/("""{"""),format.raw/*136.51*/("""
            var phones = $(this).parents('.phones')
            var template = $('.phone_template', phones)
            template.before('<div class="clearfix phone">' + template.html() + '</div>')
            renumber(phones)
        """),format.raw/*141.9*/("""}"""),format.raw/*141.10*/(""")
        
        $('.addProfile').live('click', function(e) """),format.raw/*143.52*/("""{"""),format.raw/*143.53*/("""
            var template = $('.profile_template')
            template.before('<div class="twipsies well profile">' + template.html() + '</div>')
            renumber()
        """),format.raw/*147.9*/("""}"""),format.raw/*147.10*/(""")
        
        $('#form').submit(function() """),format.raw/*149.38*/("""{"""),format.raw/*149.39*/("""
            $('.phone_template').remove()
            $('.profile_template').remove()
        """),format.raw/*152.9*/("""}"""),format.raw/*152.10*/(""")
        
        // -- renumber fields
        
        // Rename fields to have a coherent payload like:
        //
        // informations[0].label
        // informations[0].email
        // informations[0].phones[0]
        // informations[0].phones[1]
        // ...
        //
        // This is probably not the easiest way to do it. A jQuery plugin would help.
        
        var renumber = function(phones) """),format.raw/*166.41*/("""{"""),format.raw/*166.42*/("""
            $('.profile').each(function(i) """),format.raw/*167.44*/("""{"""),format.raw/*167.45*/("""
                $('input', this).each(function() """),format.raw/*168.50*/("""{"""),format.raw/*168.51*/("""
                    $(this).attr('name', $(this).attr('name').replace(/informations\[.+?\]/g, 'informations[' + i + ']'))
                """),format.raw/*170.17*/("""}"""),format.raw/*170.18*/(""")
                $('.phone input', this).each(function(i) """),format.raw/*171.58*/("""{"""),format.raw/*171.59*/("""
                    $(this).attr('name', $(this).attr('name').replace(/phones\[.+\]/g, 'phones[' + i + ']'))
                """),format.raw/*173.17*/("""}"""),format.raw/*173.18*/(""")
            """),format.raw/*174.13*/("""}"""),format.raw/*174.14*/(""")
        """),format.raw/*175.9*/("""}"""),format.raw/*175.10*/("""
        
    </script>
    
""")))})))}
    }
    
    def render(contactForm:Form[Contact]): play.api.templates.HtmlFormat.Appendable = apply(contactForm)
    
    def f:((Form[Contact]) => play.api.templates.HtmlFormat.Appendable) = (contactForm) => apply(contactForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 24 22:50:23 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/contact/form.scala.html
                    HASH: 27c8c9839d6b4653eac8b9570101d1a69891679e
                    MATRIX: 788->1|943->84|955->89|1039->93|1114->133|1128->139|1163->153|1229->199|1248->209|1376->256|1417->262|1488->324|1552->350|1623->385|1649->389|1695->399|1722->404|1815->466|1840->471|1865->487|1995->536|2063->568|2094->577|2231->678|2333->758|2380->769|2482->849|2571->902|2612->934|2661->945|2732->980|2781->1007|2832->1026|2886->1163|2936->1177|3071->1290|3349->29|3377->82|3404->196|3433->468|3462->1529|3500->1532|3537->1560|3577->1562|3623->1573|3657->1598|3697->1600|3854->1726|3900->1737|3915->1743|3977->1796|4017->1798|4157->1902|4286->2009|4349->2036|4476->2141|4539->2168|4663->2270|4874->2445|4918->2480|4973->2497|5048->2536|5099->2565|5166->2600|5229->2753|5284->2771|5445->2909|5833->3260|5849->3266|5890->3284|5976->3338|6126->3459|6156->3460|6265->3541|6295->3542|6387->3605|6417->3606|6582->3743|6612->3744|6701->3804|6731->3805|6994->4040|7024->4041|7115->4103|7145->4104|7351->4282|7381->4283|7458->4331|7488->4332|7611->4427|7641->4428|8090->4848|8120->4849|8193->4893|8223->4894|8302->4944|8332->4945|8500->5084|8530->5085|8618->5144|8648->5145|8803->5271|8833->5272|8876->5286|8906->5287|8944->5297|8974->5298
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|34->7|35->10|35->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|39->12|41->14|42->17|42->17|44->17|45->18|45->18|49->22|52->25|54->27|57->30|61->34|61->34|61->34|63->36|63->36|65->38|67->42|68->43|71->46|83->1|85->5|86->8|88->15|90->57|92->59|92->59|92->59|94->61|94->61|94->61|98->65|100->67|100->67|100->67|100->67|105->72|108->75|110->77|113->80|115->82|118->85|127->94|127->94|127->94|129->96|129->96|131->98|133->102|134->103|137->106|149->118|149->118|149->118|152->121|156->125|156->125|159->128|159->128|161->130|161->130|165->134|165->134|167->136|167->136|172->141|172->141|174->143|174->143|178->147|178->147|180->149|180->149|183->152|183->152|197->166|197->166|198->167|198->167|199->168|199->168|201->170|201->170|202->171|202->171|204->173|204->173|205->174|205->174|206->175|206->175
                    -- GENERATED --
                */
            