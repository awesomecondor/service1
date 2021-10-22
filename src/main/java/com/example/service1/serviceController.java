package com.example.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class serviceController {
@GetMapping("/test1")
public String test1()
{
	return "This is the test1 controller";
}
@GetMapping("/test2")
public String test2()
{
	return "This is the test2 controller";
}
}
