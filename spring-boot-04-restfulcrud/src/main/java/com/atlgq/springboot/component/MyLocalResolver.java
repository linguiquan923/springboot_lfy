package com.atlgq.springboot.component;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;


//自定义一个区域解析器
public class MyLocalResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //判断请求是否携带l信息，先获取l
        String l =  httpServletRequest.getParameter("l");
        //定义一个local
        Locale locale = Locale.getDefault();
        if(!StringUtils.isEmpty(l)){
            //如果不为空，那么就解析数据，根据 '_'来解析得到数组
            String[] s = l.split("_");
            //把值赋给locale
            locale = new Locale(s[0],s[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
