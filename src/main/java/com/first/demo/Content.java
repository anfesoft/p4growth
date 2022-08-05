package com.first.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Content {


@GetMapping("/page1/{id}")
	public static String page2()
	{
		return "<h3>hola </h3>";
	}

}
