package org.iclass.my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FinalProductService{
	
	private final FinalProductDao dao;
      
	public int product() {
		System.out.println("---- ProductService product() 메소드 ----");
				int result = dao.product();
				System.out.println("나와라 프로덕트");
				return result;
	}
}
