// @SOURCE:/Users/dandoug/playground/forms/conf/routes
// @HASH:06319b751b57075ddbd6c90d4627d11e157aa195
// @DATE:Tue Sep 24 22:50:20 PDT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:27
class ReverseAssets {
    

// @LINE:27
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseSignUp {
    

// @LINE:10
def edit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/fakeuser")
}
                                                

// @LINE:9
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:11
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
class ReverseSearch {
    

// @LINE:14
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                                                

// @LINE:15
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "search")
}
                                                
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
class ReverseContacts {
    

// @LINE:19
def edit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contacts/fakecontact")
}
                                                

// @LINE:18
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contacts")
}
                                                

// @LINE:20
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "contacts")
}
                                                
    
}
                          

// @LINE:24
// @LINE:23
class ReverseWizard {
    

// @LINE:23
def step(step:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "wizard/" + implicitly[PathBindable[Int]].unbind("step", step))
}
                                                

// @LINE:24
def submit(step:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "wizard/" + implicitly[PathBindable[Int]].unbind("step", step))
}
                                                
    
}
                          
}
                  


// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:27
class ReverseAssets {
    

// @LINE:27
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseSignUp {
    

// @LINE:10
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.edit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/fakeuser"})
      }
   """
)
                        

// @LINE:9
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:11
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
class ReverseSearch {
    

// @LINE:14
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:15
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        
    
}
              

// @LINE:20
// @LINE:19
// @LINE:18
class ReverseContacts {
    

// @LINE:19
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Contacts.edit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts/fakecontact"})
      }
   """
)
                        

// @LINE:18
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Contacts.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
      }
   """
)
                        

// @LINE:20
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Contacts.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
      }
   """
)
                        
    
}
              

// @LINE:24
// @LINE:23
class ReverseWizard {
    

// @LINE:23
def step : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Wizard.step",
   """
      function(step) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wizard/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("step", step)})
      }
   """
)
                        

// @LINE:24
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Wizard.submit",
   """
      function(step) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "wizard/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("step", step)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:27
class ReverseAssets {
    

// @LINE:27
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseSignUp {
    

// @LINE:10
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.edit(), HandlerDef(this, "controllers.SignUp", "edit", Seq(), "GET", """""", _prefix + """users/fakeuser""")
)
                      

// @LINE:9
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Seq(), "GET", """ Signup""", _prefix + """signup""")
)
                      

// @LINE:11
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.submit(), HandlerDef(this, "controllers.SignUp", "submit", Seq(), "POST", """""", _prefix + """signup""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
class ReverseSearch {
    

// @LINE:14
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.blank(), HandlerDef(this, "controllers.Search", "blank", Seq(), "GET", """ Search""", _prefix + """search""")
)
                      

// @LINE:15
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.submit(), HandlerDef(this, "controllers.Search", "submit", Seq(), "POST", """""", _prefix + """search""")
)
                      
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
class ReverseContacts {
    

// @LINE:19
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Contacts.edit(), HandlerDef(this, "controllers.Contacts", "edit", Seq(), "GET", """""", _prefix + """contacts/fakecontact""")
)
                      

// @LINE:18
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Contacts.blank(), HandlerDef(this, "controllers.Contacts", "blank", Seq(), "GET", """ Contact""", _prefix + """contacts""")
)
                      

// @LINE:20
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Contacts.submit(), HandlerDef(this, "controllers.Contacts", "submit", Seq(), "POST", """""", _prefix + """contacts""")
)
                      
    
}
                          

// @LINE:24
// @LINE:23
class ReverseWizard {
    

// @LINE:23
def step(step:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Wizard.step(step), HandlerDef(this, "controllers.Wizard", "step", Seq(classOf[Int]), "GET", """ Wizard""", _prefix + """wizard/$step<[^/]+>""")
)
                      

// @LINE:24
def submit(step:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Wizard.submit(step), HandlerDef(this, "controllers.Wizard", "submit", Seq(classOf[Int]), "POST", """""", _prefix + """wizard/$step<[^/]+>""")
)
                      
    
}
                          
}
        
    