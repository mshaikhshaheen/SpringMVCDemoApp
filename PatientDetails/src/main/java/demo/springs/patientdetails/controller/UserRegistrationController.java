package demo.springs.patientdetails.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demo.springs.patientdetails.viewBean.*;

@Controller
public class UserRegistrationController {
	@RequestMapping(value="/SignUp",method=RequestMethod.GET)
	public ModelAndView displaySignUp(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("signup");
		NewUserBean newUserBean = new NewUserBean();
		model.addObject("signUpBean", newUserBean);
		return model;
	}
	
	@RequestMapping(value="/SignUp",method=RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("newUserBean")NewUserBean newUserBean)
	{
			ModelAndView model= null;
			try
			{
//					boolean isValidUser = loginDelegate.isValidUser(loginBean.getUsername().toString(), loginBean.getPassword().toString());
//					if(isValidUser)
//					{
//							System.out.println("User Login Successful");
//							request.setAttribute("loggedInUser", loginBean.getUsername());
//							model = new ModelAndView("welcome");
//					}
//					else
//					{
//							model = new ModelAndView("signin");
//							request.setAttribute("message", "Invalid credentials!!");
//					}

			}
			catch(Exception e)
			{
					e.printStackTrace();
			}

			return model;
	}
}
