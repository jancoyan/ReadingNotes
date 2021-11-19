/**
 * @Author: Yan Jingcun
 * @Date: 2021/9/16
 * @Description:
 * @Version: 1.0
 */

package com.jancoyan.readingnotes.config;

import com.jancoyan.readingnotes.utils.ConstantUtil;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 将jar文件下的对应静态资源文件路径对应到磁盘的路径(根据个人的情况修改"file:static/"的static的值)
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String path = "file:" + ConstantUtil.STATIC_RESOURCES;
        registry.
                addResourceHandler("/static/**").
                addResourceLocations("classpath:/static/", path);
    }

    // 拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AllowOriginIntercepter());
    }

}
