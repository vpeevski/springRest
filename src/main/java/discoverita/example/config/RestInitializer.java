package discoverita.example.config;



import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RestInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { RestConfig.class };
	}


}
