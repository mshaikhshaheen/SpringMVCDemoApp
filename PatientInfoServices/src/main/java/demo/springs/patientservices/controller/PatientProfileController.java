package demo.springs.patientservices.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import demo.springs.patientservices.model.PatientDetails;
import demo.springs.patientservices.service.DataServices;


@Controller
public class PatientProfileController {
	
	 @Autowired  
	 DataServices dataServices;  
	  
	 static final Logger logger = Logger.getLogger(RestController.class);  
	  	
//    String message = "Welcome to your 1st Maven Spring project !";  
//    @RequestMapping("/getPatientProfile")  
//	    public ModelAndView showPatientProfile() {  
//	        System.out.println("from controller");  
//	        return new ModelAndView("hello", "message", message);  
//	    }  

	@RequestMapping(value = "/getPatientProfile/{id}", method = RequestMethod.GET)  
    public @ResponseBody  
    PatientDetails getEmployee(@PathVariable("id") long id) {  
	PatientDetails patient = null;  
     try {  
    	 patient = dataServices.getEntityById(id);  
     
     } catch (Exception e) {  
      e.printStackTrace();  
     }  
     return patient;  
    }  
}
