package demo.springs.patientdetails.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.springs.patientdetails.model.Profile;

@Controller
public class ProfileController {

	String baseURL = "http://localhost:8080/PatientInfoServices/";
	private ModelAndView model;

	@RequestMapping(value="/profile",method=RequestMethod.GET)
	public ModelAndView getPateintDetails(@RequestParam("id")String patientId){
		String response = makeGetRequest(baseURL+"getPatientProfile/"+patientId);
		Profile profileObj = null;
		model = null;
		try {
			ObjectMapper tempMapper = new ObjectMapper();
			profileObj = tempMapper.readValue(response, Profile.class);
			System.out.println(profileObj.getFirstName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Map<String,Object> modelMap = new LinkedHashMap<String, Object>();
		modelMap.put("patient", profileObj);
//		
//		modelMap.put("patientID", patientId);
//		modelMap.put("patientName", profileObj.getFirstName()+" "+profileObj.getLastName());
//		modelMap.put("patientLoc", profileObj.getLocation());
//		model.addAllObjects(modelMap);
		
//		model.addAllObjects(modelMap );
        model = new ModelAndView("profile","profile",modelMap);
		return model;
	}
	
	public String makeGetRequest(String url){		
		HttpURLConnection con = null;
		String inputLine, response="";

		try {
			URL obj = new URL(url);
			con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");

			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));

			while ((inputLine = in.readLine()) != null) {
				response += inputLine;
			}

			in.close();

		}  
		catch(FileNotFoundException e){
			response="No data found";
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
}
