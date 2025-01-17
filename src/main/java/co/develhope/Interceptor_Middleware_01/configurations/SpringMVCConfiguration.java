package co.develhope.Interceptor_Middleware_01.configurations;

import co.develhope.Interceptor_Middleware_01.interceptors.APILoggingInterceptor;
import co.develhope.Interceptor_Middleware_01.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;

    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(legacyInterceptor);
        registry.addInterceptor(apiLoggingInterceptor);
    }
}
