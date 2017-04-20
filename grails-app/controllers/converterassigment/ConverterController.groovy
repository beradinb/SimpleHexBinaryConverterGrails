package converterassigment

import java.text.DateFormat
import java.text.SimpleDateFormat

class ConverterController {

    def index() { }
    
    def hello= {
        render "hello"
    }
    
    def binary(String number) {
        
        String nInput = params.number
        
        try {
            if (nInput.isInteger())
            {
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy")
                DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss")
                
                Date currentDate = new Date()
                String date = dateFormat.format(currentDate)
                String time = timeFormat.format(currentDate)
                
                
                int val = Integer.parseInt(nInput)
                String rValue = Integer.toBinaryString(val)
                def r = new Result ()
                r.userID = session["id"]
                r.conResult = rValue
                r.ConvertService = "binary"
                r.SubmittedNum = val
                r.date = date
                r.time = time
                r.save()
                render rValue
            }
            else
            {
                throw new NumberFormatException()
            }
        } catch (NumberFormatException e)
        {
            response.sendError(400, "This conversion cannot be done. Only use numbers.")
        }
        
        
    }
    
    def hex(String number) {
        
        String nInput = params.number
        
        try {
            if (nInput.isInteger())
            {
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy")
                DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss")
                
                Date currentDate = new Date()
                String date = dateFormat.format(currentDate)
                String time = timeFormat.format(currentDate)
                
                int val = Integer.parseInt(nInput)
                String rValue = Integer.toHexString(val)
                def r = new Result ()
                r.userID = session["id"]
                r.conResult = rValue
                r.ConvertService = "hex"
                r.SubmittedNum = val
                r.date = date
                r.time = time
                r.save()
                render rValue
            }
            else
            {
                throw new NumberFormatException()
            }
        } catch (NumberFormatException e)
        {
            response.sendError(400, "This conversion cannot be done. Only use numbers.")
        }
            
            
    }
    
    def binarytest(String number) {
        
        try {
            if (number.isInteger())
            {
                int val = Integer.parseInt(number)
                String rValue = Integer.toBinaryString(val)
                render rValue
            }
            else
            {
                throw new NumberFormatException()
            }
        } catch (NumberFormatException e)
        {
            //response.sendError(400, "This conversion cannot be done. Only use numbers.")
            render 'error 400'
        }  
    }
    
    def hextest(String number) {
        
        try {
            if (number.isInteger())
            {
                int val = Integer.parseInt(number)
                String rValue = Integer.toHexString(val)
                render rValue
            }
            else
            {
                throw new NumberFormatException()
            }
        } catch (NumberFormatException e)
        {
            //response.sendError(400, "This conversion cannot be done. Only use numbers.")
            render 'error 400'
        } 
    }
}
