package cn.itcast.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**   
* @Title: Application.java 
* @Package cn.itcast.springboot 
* @Description: web容器启动类
* @author 曹源
* @date 2017年11月19日 下午8:37:55 
*/
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}

}
