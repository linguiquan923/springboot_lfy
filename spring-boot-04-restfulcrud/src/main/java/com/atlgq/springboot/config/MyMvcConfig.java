package com.atlgq.springboot.config;

import com.atlgq.springboot.component.LoginHandlerInterceptor;
import com.atlgq.springboot.component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Locale;

//使用WebMvcConfigurerAdapter来扩展SpringMvc的功能
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        //发送atlgq请求到success
        registry.addViewController("/atlgq").setViewName("success");
    }

    //所有的组件WebMvcConfigurerAdapter组件都会一起起作用
    @Bean // 把这个adapter注入到容器中，才会生效
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                //super.addViewControllers(registry);
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }
            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html","/crud","/user/login","/asserts/**","/","http://localhost:8080/crud/");
            }
        };
        return adapter;
    }

    //把我们设置的区域信息解析器加入到容器中
    @Bean
    public LocaleResolver myLocaleResolver(){
    //  System.out.println("注入容器");
        return new MyLocalResolver();
    }

}
