package gd.fintech.boardcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class BoardcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardcrudApplication.class, args);
	}
	@Bean
	public InternalResourceViewResolver setupViewResolver() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
				
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
		
	}

}
