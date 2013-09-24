// @SOURCE:/Users/dandoug/playground/forms/conf/routes
// @HASH:06319b751b57075ddbd6c90d4627d11e157aa195
// @DATE:Tue Sep 24 01:02:30 PDT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_SignUp_blank1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:10
private[this] lazy val controllers_SignUp_edit2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/fakeuser"))))
        

// @LINE:11
private[this] lazy val controllers_SignUp_submit3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:14
private[this] lazy val controllers_Search_blank4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:15
private[this] lazy val controllers_Search_submit5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:18
private[this] lazy val controllers_Contacts_blank6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contacts"))))
        

// @LINE:19
private[this] lazy val controllers_Contacts_edit7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contacts/fakecontact"))))
        

// @LINE:20
private[this] lazy val controllers_Contacts_submit8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contacts"))))
        

// @LINE:23
private[this] lazy val controllers_Wizard_step9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wizard/"),DynamicPart("step", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_Wizard_submit10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wizard/"),DynamicPart("step", """[^/]+""",true))))
        

// @LINE:27
private[this] lazy val controllers_Assets_at11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignUp.blank()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/fakeuser""","""controllers.SignUp.edit()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignUp.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Search.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Search.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contacts""","""controllers.Contacts.blank()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contacts/fakecontact""","""controllers.Contacts.edit()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contacts""","""controllers.Contacts.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wizard/$step<[^/]+>""","""controllers.Wizard.step(step:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wizard/$step<[^/]+>""","""controllers.Wizard.submit(step:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_SignUp_blank1(params) => {
   call { 
        invokeHandler(controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Nil,"GET", """ Signup""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:10
case controllers_SignUp_edit2(params) => {
   call { 
        invokeHandler(controllers.SignUp.edit(), HandlerDef(this, "controllers.SignUp", "edit", Nil,"GET", """""", Routes.prefix + """users/fakeuser"""))
   }
}
        

// @LINE:11
case controllers_SignUp_submit3(params) => {
   call { 
        invokeHandler(controllers.SignUp.submit(), HandlerDef(this, "controllers.SignUp", "submit", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:14
case controllers_Search_blank4(params) => {
   call { 
        invokeHandler(controllers.Search.blank(), HandlerDef(this, "controllers.Search", "blank", Nil,"GET", """ Search""", Routes.prefix + """search"""))
   }
}
        

// @LINE:15
case controllers_Search_submit5(params) => {
   call { 
        invokeHandler(controllers.Search.submit(), HandlerDef(this, "controllers.Search", "submit", Nil,"POST", """""", Routes.prefix + """search"""))
   }
}
        

// @LINE:18
case controllers_Contacts_blank6(params) => {
   call { 
        invokeHandler(controllers.Contacts.blank(), HandlerDef(this, "controllers.Contacts", "blank", Nil,"GET", """ Contact""", Routes.prefix + """contacts"""))
   }
}
        

// @LINE:19
case controllers_Contacts_edit7(params) => {
   call { 
        invokeHandler(controllers.Contacts.edit(), HandlerDef(this, "controllers.Contacts", "edit", Nil,"GET", """""", Routes.prefix + """contacts/fakecontact"""))
   }
}
        

// @LINE:20
case controllers_Contacts_submit8(params) => {
   call { 
        invokeHandler(controllers.Contacts.submit(), HandlerDef(this, "controllers.Contacts", "submit", Nil,"POST", """""", Routes.prefix + """contacts"""))
   }
}
        

// @LINE:23
case controllers_Wizard_step9(params) => {
   call(params.fromPath[Int]("step", None)) { (step) =>
        invokeHandler(controllers.Wizard.step(step), HandlerDef(this, "controllers.Wizard", "step", Seq(classOf[Int]),"GET", """ Wizard""", Routes.prefix + """wizard/$step<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_Wizard_submit10(params) => {
   call(params.fromPath[Int]("step", None)) { (step) =>
        invokeHandler(controllers.Wizard.submit(step), HandlerDef(this, "controllers.Wizard", "submit", Seq(classOf[Int]),"POST", """""", Routes.prefix + """wizard/$step<[^/]+>"""))
   }
}
        

// @LINE:27
case controllers_Assets_at11(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     