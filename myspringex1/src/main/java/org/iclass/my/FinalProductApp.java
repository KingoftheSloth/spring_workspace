package org.iclass.my;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FinalProductApp {
//	private static final Logger logger = LoggerFactory.getLogger(ProductApp.class);

	public static void main(String[] args) {
		ApplicationContext context
		= new AnnotationConfigApplicationContext(FinalProductConfig.class);
	
		System.out.println("\n");
		FinalProductController control = context.getBean(FinalProductController.class);
		control.product();
		log.info("앙 오늘 데리버거 먹을거야");
//		log.debug("debug 메소드 실행은 org.iclass 패키지 로그 출력 수준이 debug 이하 일때 나옵니다.");
//		log.info("info 메소드 실행은 org.iclass 패키지 로그 출력 수준이 info 이하 일때 나옵니다.");
//		로그 레벨  trace -> debug -> info -> warn -> error
		
		((AbstractApplicationContext) context).close();
	}

}
