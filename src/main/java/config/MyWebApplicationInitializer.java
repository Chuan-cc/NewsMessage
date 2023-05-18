package config;

import config.SpringMvcConfig;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class MyWebApplicationInitializer implements WebApplicationInitializer {


    @Override
    public void onStartup(jakarta.servlet.ServletContext servletContext) throws jakarta.servlet.ServletException {
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(SpringMvcConfig.class);
        DispatcherServlet servlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/*");
    }


}