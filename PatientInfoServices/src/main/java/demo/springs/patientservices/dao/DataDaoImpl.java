package demo.springs.patientservices.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import demo.springs.patientservices.model.PatientDetails;

public class DataDaoImpl implements DataDao{
	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	
	public PatientDetails getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		PatientDetails patient = (PatientDetails) session.load(PatientDetails.class,new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return patient;
	}

}
