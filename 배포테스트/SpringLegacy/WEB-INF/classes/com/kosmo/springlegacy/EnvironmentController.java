package com.kosmo.springlegacy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnvironmentController {

	@RequestMapping("/environment/main1")
	public String main1(Model model) {
		//1. 스프링 컨테이너 생성
		ConfigurableApplicationContext ctx = new GenericApplicationContext();
		//2.Environment 객체 생성
		ConfigurableEnvironment env = ctx.getEnvironment();
		//3.외부파일을 읽어올 준비를 한다.
		MutablePropertySources propertySources = env.getPropertySources();
		
		String adminIdStr = "";
		String adminPwStr = "";
		
		try {
			String envPath = "classpath:EnvAdmin.properties";
			propertySources.addLast(new ResourcePropertySource(envPath));
			adminIdStr = env.getProperty("admin.id");
			adminPwStr = env.getProperty("admin.pw");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("adminID", adminIdStr);
		model.addAttribute("adminPW", adminPwStr);
		
		return "05Environment/main1";
	}
}
