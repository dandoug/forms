
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
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--  link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*9.115*/("""" -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*10.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/main.css"))),format.raw/*11.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*12.59*/routes/*12.65*/.Assets.at("images/favicon.png"))),format.raw/*12.97*/("""">
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*13.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/geocode.js"))),format.raw/*14.65*/("""" type="text/javascript"></script>
    </head>
    <body>
        
        <!--  div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*21.45*/routes/*21.51*/.Application.index())),format.raw/*21.71*/("""">Forms</a>
                    <ul class="nav">
                        
                        <li class=""""),_display_(Seq[Any](/*24.37*/("active".when(nav == "search")))),format.raw/*24.69*/("""">
                            <a href=""""),_display_(Seq[Any](/*25.39*/routes/*25.45*/.Search.blank())),format.raw/*25.60*/("""">Find Starbucks</a>
                        </li>
                     
                    </ul>
                </div>
            </div>
        </div -->

        <div class="container">

            <div class="content">
                
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*38.26*/title)),format.raw/*38.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*43.26*/content)),format.raw/*43.33*/("""
                    </div>
                </div>
                
            </div>

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
                    DATE: Wed Sep 25 09:24:22 PDT 2013
                    SOURCE: /Users/dandoug/playground/forms/app/views/main.scala.html
                    HASH: e24c61a67d52cef6f93cb13f5428478fa442fba0
                    MATRIX: 783->1|923->47|1011->100|1037->105|1218->251|1232->257|1304->307|1399->366|1414->372|1475->411|1567->467|1582->473|1638->507|1735->568|1750->574|1804->606|1865->631|1880->637|1947->682|2040->739|2055->745|2113->781|2365->997|2380->1003|2422->1023|2568->1133|2622->1165|2699->1206|2714->1212|2751->1227|3098->1538|3125->1543|3291->1673|3320->1680
                    LINES: 26->1|29->1|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|49->21|49->21|49->21|52->24|52->24|53->25|53->25|53->25|66->38|66->38|71->43|71->43
                    -- GENERATED --
                */
            