package converterassigment

class ResultsController {
    
static responseFormats = ['json','xml']
    
    def index() { 
    
        
        def dataresults = Result.findAllByUserID(session["id"])
        
        respond dataresults
    
    }
    
    
   
    
    
 
}
