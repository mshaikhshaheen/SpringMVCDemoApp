package demo.springs.patientservices.service;

import demo.springs.patientservices.model.PatientDetails;

public interface DataServices {
	 public PatientDetails getEntityById(long id) throws Exception;  
}
