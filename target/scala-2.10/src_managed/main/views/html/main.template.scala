
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Form samples</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        
        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*18.45*/routes/*18.51*/.Application.index())),format.raw/*18.71*/("""">Forms</a>
                    <ul class="nav">
                        <li class=""""),_display_(Seq[Any](/*20.37*/("active".when(nav == "signup")))),format.raw/*20.69*/("""">
                            <a href=""""),_display_(Seq[Any](/*21.39*/routes/*21.45*/.SignUp.blank())),format.raw/*21.60*/("""">Sign up</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*23.37*/("active".when(nav == "search")))),format.raw/*23.69*/("""">
                            <a href=""""),_display_(Seq[Any](/*24.39*/routes/*24.45*/.Search.blank())),format.raw/*24.60*/("""">Find Starbucks</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*26.37*/("active".when(nav == "contact")))),format.raw/*26.70*/("""">
                            <a href=""""),_display_(Seq[Any](/*27.39*/routes/*27.45*/.Contacts.blank())),format.raw/*27.62*/("""">Contacts</a>
                        </li>
						<li class=""""),_display_(Seq[Any](/*29.19*/("active".when(nav == "wizard")))),format.raw/*29.51*/("""">
	                        <a href=""""),_display_(Seq[Any](/*30.36*/routes/*30.42*/.Wizard.step(1))),format.raw/*30.57*/("""">Wizard</a>
	                    </li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">
                
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*42.26*/title)),format.raw/*42.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*47.26*/content)),format.raw/*47.33*/("""
                    </div>
                </div>
                
            </div>

            <footer>
                <p>
                    <a href="http://www.playframework.com">www.playframework.com</a>
                </p>
            </footer>

        </div>
        
    </body>
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 23 23:31:54 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/main.scala.html
                    HASH: d667aa1b46d99d24b6126fa5a80d2f83ed55e8cd
                    MATRIX: 783->1|923->47|1084->173|1098->179|1158->218|1249->274|1263->280|1318->314|1415->375|1430->381|1484->413|1545->438|1560->444|1627->489|1874->700|1889->706|1931->726|2052->811|2106->843|2183->884|2198->890|2235->905|2351->985|2405->1017|2482->1058|2497->1064|2534->1079|2657->1166|2712->1199|2789->1240|2804->1246|2843->1263|2942->1326|2996->1358|3070->1396|3085->1402|3122->1417|3433->1692|3460->1697|3626->1827|3655->1834
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|46->18|46->18|46->18|48->20|48->20|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|54->26|54->26|55->27|55->27|55->27|57->29|57->29|58->30|58->30|58->30|70->42|70->42|75->47|75->47
                    -- GENERATED --
                */
            