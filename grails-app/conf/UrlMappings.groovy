class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "/Converter/binary/$id"(resources:'binary')
        "/Converter/hex/$id"(resources:'hex')
        
        "/User/registration"(resources:'User')
        "/$controller/$action?"{
            controller = $controller
            action = $action
        }
	}
}
