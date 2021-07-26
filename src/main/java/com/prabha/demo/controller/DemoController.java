package com.prabha.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prabha.demo.dao.RegisterDao;
import com.prabha.demo.model.RegisterModel;
@Controller
public class DemoController {
	@Autowired
	RegisterDao registerDao;
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/signUp")
	public String add(RegisterModel registerModel)
	{
		System.out.println("Entered");
		if( ! registerModel.getPassword().equals(registerModel.getCpass()))
			return "error.jsp";
		registerDao.save(registerModel);
		return "home.jsp";	
	}

	@GetMapping("/userLogin")
	public String login(@RequestBody RegisterModel registerModel)
	{
		
	        List<RegisterModel> users = (List<RegisterModel>) registerDao.findAll();
	        for (RegisterModel other : users) {
	            if (other.equals(registerModel)) {
	                registerModel.setLoggedIn(true);
	                registerDao.save(registerModel);
	                return "welcome.jsp";
	            }
	        }
	        return "error.jsp";
	    }
	
	@GetMapping("/adminLogin")
	public String loginad(@RequestBody RegisterModel registerModel)
	{
		
	        List<RegisterModel> users = (List<RegisterModel>) registerDao.findAll();
	        for (RegisterModel other : users) {
	            if (other.equals(registerModel)) {
	                registerModel.setLoggedIn(true);
	                registerDao.save(registerModel);
	                return "admin.jsp";
	            }
	        }
	        return "error.jsp";
	    }
	
	@GetMapping("/users/logout")
    public Status logUserOut(@RequestBody RegisterModel user) {
        List<RegisterModel> users = (List<RegisterModel>) registerDao.findAll();
        for (RegisterModel other : users) {
            if (other.equals(user)) {
                user.setLoggedIn(false);
                registerDao.save(user);
                return Status.SUCCESS;
            }
        }
        return Status.FAILURE;
    }
    @DeleteMapping("/users/all")
    public String deleteUsers() {
        registerDao.deleteAll();
        return "home.jsp";
    }
    
    @RequestMapping("/all")
    public ModelAndView listAll(RegisterModel registerModel)
    {
    	ModelAndView mv = new ModelAndView("admin.jsp");
    	List<RegisterModel> al =(List<RegisterModel>) registerDao.findAll();
    	for(RegisterModel rs : al)
    		mv.addObject(registerModel);
    		
    	return mv;
    }
}

