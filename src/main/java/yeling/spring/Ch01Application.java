package yeling.spring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"yeling.spring", "yeling.framework"})
public class Ch01Application {

	public static void main(String[] args) {
//		SpringApplication.run(Ch01Application.class, args);
		
		//어플리케이션 웹이 아니라 일반 자바 어플리케이션으로 실행되고, 톰캣도 실행x
		// ==로컬
		SpringApplication application = new SpringApplication(Ch01Application.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);
//		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
