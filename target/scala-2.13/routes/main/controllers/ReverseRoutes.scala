// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:3
package controllers {

  // @LINE:3
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def players(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "players")
    }
  
    // @LINE:4
    def tournaments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tournaments")
    }
  
    // @LINE:7
    def panel(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "panel")
    }
  
    // @LINE:3
    def home(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:5
    def teams(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "teams")
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}