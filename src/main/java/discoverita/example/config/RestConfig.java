package discoverita.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc

@ComponentScan(basePackages = { "discoverita.example" })
public class RestConfig extends WebMvcConfigurerAdapter {

//	@Bean
//	public ViewResolver cnViewResolver() {
//		return new ContentNegotiatingViewResolver();
//	}
//
//	@Bean
//	public ViewResolver beanNameViewResolver() {
//		return new BeanNameViewResolver();
//	}

	

}
