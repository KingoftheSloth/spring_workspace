package org.iclass.my;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FinalProductController {
	
	private FinalProductService service;
	
	
	public void product() {
		System.out.println("---- ProductController product() 메소드 ----");
		service.product();
	}
}
