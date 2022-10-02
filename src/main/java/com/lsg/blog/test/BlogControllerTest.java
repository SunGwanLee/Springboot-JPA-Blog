package com.lsg.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//  springboot 스프링부트 - 나만의 블로그 만들기
//  https://getinthere.tistory.com   강사 블로그

// 스프링이 com.lsg.blog 패키지를 스캔해서 모든 파일을 메모리에 new 하는 것이 아니고
// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(Ioc) 스프링 컨테이너에서 관리해준다
@RestController
public class BlogControllerTest {

	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello spring boot!!!</h1>";
	}
}
