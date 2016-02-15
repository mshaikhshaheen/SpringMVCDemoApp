package demo.springs.patientdetails.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demo.springs.patientdetails.delegate.LoginDelegate;
import demo.springs.patientdetails.viewBean.LoginBean;

@Controller
public class LoginController {
	
	@Autowired
	private LoginDelegate loginDelegate;

//	String message = "User logged in successfully";
	
	@RequestMapping(value="/ServiceLoginAuth",method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("signin");
		LoginBean loginBean = new LoginBean();
		model.addObject("loginBean", loginBean);
		return model;
	}
	
	@RequestMapping(value="/ServiceLoginAuth",method=RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")LoginBean loginBean)
	{
			ModelAndView model= null;
			try
			{
					int isValidUser = loginDelegate.isValidUser(loginBean.getUsername().toString(), loginBean.getPassword().toString());
					if(isValidUser>0)
					{
							System.out.println("User Login Successful : "+isValidUser);
							request.setAttribute("loggedInUser", loginBean.getUsername());
							request.setAttribute("userId", isValidUser);
//							model = new ModelAndView("welcome");
							request.getSession().setAttribute("loggedInUser", loginBean.getUsername());
				            model = new ModelAndView("redirect:/profile?id="+isValidUser);
					}
					else
					{
							model = new ModelAndView("signin");
							request.setAttribute("message", "Invalid credentials!!");
					}

			}
			catch(Exception e)
			{
					e.printStackTrace();
			}

			return model;
	}

	
//	@RequestMapping(value = "/ServiceLoginAuth",method = RequestMethod.POST)
//	public ModelAndView showLogin(
//			@RequestParam(value = "userid", required = true) String userid,
//			@RequestParam(value = "pswd", required = true) String password){
//		
//		System.out.println("Entered PatientDetailsController"+userid + " "+password);
//		ModelAndView mv = new ModelAndView("loginsuccess");
//		mv.addObject("message", message);
//		return mv;
//	}
//	
//	@RequestMapping("/RecoverUsername")
//	public ModelAndView forgotUsername(){
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("dummy", "dummy");
//		return mv;
//	}
//	
//	@RequestMapping("/RecoverPassword")
//	public ModelAndView forgotPassword(){
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("dummy", "dummy");
//		return mv;
//	}
//	
//	@RequestMapping("/CreateNewUser")
//	public ModelAndView createNewUser(){
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("dummy", "dummy");
//		return mv;
//	}
}
