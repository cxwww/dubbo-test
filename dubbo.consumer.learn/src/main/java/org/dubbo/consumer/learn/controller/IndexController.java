package org.dubbo.consumer.learn.controller;

import org.dubbo.api.learn.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class IndexController {

	@Reference
	private DemoService ds;
	
	@RequestMapping("/index/{name}")
	public String index(@PathVariable(value="name") String name) {
		return ds.sayHello(name);
	}
	
}
