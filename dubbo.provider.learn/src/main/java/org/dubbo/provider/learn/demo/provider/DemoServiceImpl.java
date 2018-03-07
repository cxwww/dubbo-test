package org.dubbo.provider.learn.demo.provider;

import org.dubbo.api.learn.DemoService;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService	{

	public String sayHello(String name) {
		return "hell:" + name;
	}

}
