package converterassigment

import javax.persistence.Converter

class UserController {

   
    def registration = {
        render(view:"registration")
        //        def user = new User(params)
        //        user.save()
        // new user posts his registration details
        
    }
    
    def register = {
        if (request.method == 'POST') {
            // create domain object and assign parameters using data binding
            def u = new User(params)
            if (! u.save()) {
                // validation failed, render registration page again
                
                return [user:u]
            } else {
                // validate/save ok, store user in session, redirect to homepage
                session.user = u
                session["id"] = u.id
                redirect(controller:'converter')
            }
        } else if (session.user) {
            // don't allow registration while user is logged in
            redirect(controller:'converter')
        }
    }
    
   
    def authenticate()  {
      

        def user = User.findByUsernameAndPassword(params.username, params.password)
        if(user){
            session.user = user
            session["id"] = user.id
            flash.message = "Hello ${user.username}!"
            redirect(controller:'converter')      
        }else{
            flash.message = "Sorry, ${params.username}. Please try again."
            redirect(action:"logout")
        }
    }
   
    def logout() {
        flash.message = "Goodbye ${session.user.username}"
        session.user = null
        //redirect(controller:"entry", action:"list")      
    }  
}
