package demo.springs.patientservices.dao;

import demo.springs.patientservices.model.PatientDetails;

public interface DataDao {
	public PatientDetails getEntityById(long id) throws Exception;
}
