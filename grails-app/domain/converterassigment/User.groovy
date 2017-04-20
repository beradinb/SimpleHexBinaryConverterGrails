package converterassigment

class User {

    String username
    String password
    
    static constraints = {
        username(unique:true)
        password(password:true)
    }
}
