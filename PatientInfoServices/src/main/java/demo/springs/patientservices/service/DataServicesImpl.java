package demo.springs.patientservices.service;

import org.springframework.beans.factory.annotation.Autowired;

import demo.springs.patientservices.dao.DataDao;
import demo.springs.patientservices.model.PatientDetails;

public class DataServicesImpl implements DataServices{

	@Autowired  
	 DataDao dataDao; 
	
	public PatientDetails getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);  
	 }

}
