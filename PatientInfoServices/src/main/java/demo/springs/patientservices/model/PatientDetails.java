package demo.springs.patientservices.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity  
@Table(name = "patientdetails")  
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})  
public class PatientDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	
	 @Id  
	 @GeneratedValue  
	 @Column(name = "id")  
	 private long id;   
	 @Column(name = "first_name")  
	 String firstName;
	 @Column(name = "last_name")  
	 String lastName;
	 @Column(name = "user_name")  
	 String username;
	 @Column(name = "birth_date")  
	 String birthDate;
	 @Column(name = "gender")  
	 String gender;
	 @Column(name = "mobile_number")  
	 String mobileNumber;
	 @Column(name = "current_addr")  
	 String currentAddress;
	 @Column(name = "perm_addr")  
	 String permanentAddress;
	 @Column(name = "location")  
	 String location;
		
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
