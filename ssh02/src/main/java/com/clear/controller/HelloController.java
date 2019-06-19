package com.clear.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.clear.model.Member;
import com.clear.service.MemberService;



@Controller
public class HelloController {
  
  @Autowired
  private MemberService memberService;

  @RequestMapping(value="/login",method = RequestMethod.POST) //«eºÝ
  public String Login(HttpServletRequest request) {
	System.out.println(request.getParameter("account"));
	System.out.println(request.getParameter("password"));
	String account =  request.getParameter("account");
	String password =  request.getParameter("password"); 
	  
   // Member member = memberService.getMember(account,password);
    //String  Email = member.getMemberEmail();
  
   // System.out.println(Email);
    
    return "Login";
  }
  @RequestMapping(value = "/register", method = RequestMethod.GET)
	public String  RegisterView() {
		System.out.println("GO Register Page!");
		return "Register";
	}
  
  @RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute Member Member, BindingResult result) {
		ModelAndView mv = new ModelAndView("allUsers");
		
		if (result.hasErrors()) {
			List<ObjectError> errorList = result.getAllErrors();
            for (ObjectError error : errorList) {
                System.out.println(error.getDefaultMessage());
            }
			return new ModelAndView("Register");
			
		}
		boolean isAdded = memberService.saveUser(Member);
		if (isAdded) {
			mv.addObject("message", "New user successfully added");
		} else {
			return new ModelAndView("Register");
		}

		return mv;
	}
  @RequestMapping(value = "/backhome", method = RequestMethod.GET)
	public RedirectView  indexView() {
		System.out.println("GO backhome Page!");
		return new RedirectView("/ssh02", false);
	}
  @RequestMapping(value = "/forgetpwd", method = RequestMethod.GET)
	public String  forgetpwd() {
	  	Member member = memberService.getMail(1);
	  	System.out.println(member.getMemberName());
	    System.out.println(member.getRegisterTime());
		System.out.println("GO ForgetPWD Page!");
		return "ForgetPWD";
	}
  @RequestMapping(value = "/alluser", method = RequestMethod.GET)
	public String  alluser(Model model) {
	  	model.addAttribute("user",new Member());
		model.addAttribute("userList",memberService.getAllUser());
		System.out.println("GO alluser Page!");
		return "allUsers";
	}
  

}