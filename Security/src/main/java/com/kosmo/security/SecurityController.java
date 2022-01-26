package com.kosmo.security;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

	/*
	시큐리티 1단계  : 기본페이지 사용하기
	 */
	
	/*
	해당 요청명으로 접근하기 위해서는 USER권한을 획득해야 한다.
	(security1-1/로 시작하는 요청명은 전부 그렇게 되도록 
		security-context.xml파일에 설정해 두었기 때문)
	<security:intercept-url pattern="/security1-1/**" access="hasRole('USER')" />
	위와 같이 설정되어 있음.
	 */
	@RequestMapping("/security1-1/index.do")
	public String security1() {
		return "09Security/Step1/index";
	}
	/*
	아래 요청명은 security1-1이 들어가지 않기 때문에 
	별도의 권한없이 누구나 접근할 수 있는 요청명 매핑이다.
	<security:intercept-url pattern="/**" access="permitAll" />
	이렇게 설정하면 누구나 접근할 수 있는 경로가 된다.
	 */
	@RequestMapping("/security1-2/access.do")
	public String security1_1() {
		return "09Security/Step1/access";
	}
	
	@RequestMapping("/security2/index.do")
	public String securityIndex2(Principal principal, 
			Authentication authentication, Model model ) 
	{
		/*
		스프링 시큐리티에서 아이디를 얻어오는 법
		방법1] principal객체를 통해 얻어온다.
		 */
		String user_id = principal.getName();
		System.out.println("user_id="+user_id);
		
		//방법2] authentication객체를 통해 얻어온다.
		UserDetails userDetails = (UserDetails)authentication.getPrincipal();
		String detail_id = userDetails.getUsername();
		System.out.println("detail_id="+ detail_id);
		
		//방법3] SecurityContextHolder 객체를 통해 얻어온다.
		Object object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDetails sch = (UserDetails)object;
		String sch_id = sch.getUsername();
		System.out.println("sch_id="+ sch_id);
		
		//얻어온 id값을 모델 객체에 저장
		model.addAttribute("user_id",user_id);
		
		
		return "09Security/Step2/index";
	}
	
	@RequestMapping("/security2/login.do")
	public String securityIndex2Login(Principal principal, Model model ) 
	{
		
		String user_id = "";
		try {
			user_id = principal.getName();
			System.out.println("user_id"+user_id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("user_id",user_id);
		
		return "09Security/Step2/login";
	}
	@RequestMapping("/security2/accessDenied.do")
	public String securityIndex2AccessDenied() 
	{
		return "09Security/Step2/accessDenied";
	}
	@RequestMapping("/security2/admin/main.do")
	public String securityIndex2AdminMain() 
	{
		return "09Security/Step2/adminMain";
	}
	
	@RequestMapping("/security3/form.do")
	public String formPage() {
		return "09Security/Warning/postForm";
	}


	
	
	
	
	
	
	
}
