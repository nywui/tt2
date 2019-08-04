package net.androidis.sample3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.androidis.sample3.model.Account;
import net.androidis.sample3.model.Login;
import net.androidis.sample3.service.IAccountService;
import net.androidis.sample3.service.ILoginService;
import net.androidis.sample3.service.impl.LoginService;


@Controller
public class AppController {
	
	
	@Autowired
	ILoginService loginService ;
	//ILoginService loginService = new LoginService();
	
	@Autowired
	IAccountService accountService;
	
	@RequestMapping("/")
	public ModelAndView controlA()
	{
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("login", new Login());
		return mv;
	}

	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("login", new Login());
		return mv;
	}
	
	@RequestMapping("loginProcess")
	public ModelAndView loginProcess(@ModelAttribute("login") Login login)
	{
		
		//Iterable<Login> loginList =  loginService.findAllLogin();
		/*
		for(Login l : loginService.findAllLogin())
		{
			System.out.println(l);
			if(l != null)
			System.out.println(l.getUserName());
		}
		*/
		
		ModelAndView mv= new ModelAndView("greeting");
		
		
		Login lo1 = loginService.findLoginByUserName(login.getUserName());
		
		if(lo1 != null)
		{
			System.out.println(lo1.getUserName());
			
			if(lo1.getPassword().equals(login.getPassword()))
			{
				//mv = new ModelAndView("greeting");
				mv.addObject("name", lo1.getUserName());
				
				Account acct = accountService.findAccountByUserName(lo1.getUserName());
				
				if(acct != null)
				{
					mv.addObject("first_name", acct.getFirstName());
					mv.addObject("last_name", acct.getLastName());
					mv.addObject("email", acct.getEmailAddress());
					mv.addObject("address", acct.getAddress());
				}
			}
			else
			{
				//mv = new ModelAndView("greeting");
				mv.addObject("name", "Error login");
			}
		}
		
		
		/*
		if(login != null)
		{
			String name = login.getUserName();
			mv.addObject("name", name);
		}
		*/
		return mv;
		
	}
}

