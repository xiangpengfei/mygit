package com;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@SpringBootConfiguration
@Controller
@RequestMapping(value="/demo")
public class MySpringBoot extends SpringBootServletInitializer {
	@Resource
	Person ps;
	
	
	@RequestMapping(value="/initPage")
	public @ResponseBody String initPage(){
		System.out.println("ps=="+ps);
		
		return "all men are created equals";
	}
	
	@RequestMapping(value="/getPerson")
	public @ResponseBody Person getPerson(@RequestBody Person p){
		System.out.println("p=="+p);
		return p;
	}
	
	@RequestMapping(value="/welcome")
	public String  welcome() {
		System.out.println("不知道什么意思");
		System.out.println("不知道什么意思");
		System.out.println("不知道什么意思");
		return "welcome";
	}
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(MySpringBoot.class);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SpringApplication sa = new SpringApplication(MySpringBoot.class);
      sa.run(args);
       
	}

}
