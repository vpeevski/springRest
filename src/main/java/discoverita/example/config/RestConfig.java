package discoverita.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
@EnableWebMvc

@ComponentScan(basePackages = { "discoverita.example" })
public class RestConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver cnViewResolver() {
		return new ContentNegotiatingViewResolver();
	}

	@Bean
	public ViewResolver beanNameViewResolver() {
		return new BeanNameViewResolver();
	}

	@Bean
	public View spittles() {
		return new MappingJackson2JsonView();
	}

}
