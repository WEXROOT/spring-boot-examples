package com.leone.boot.mvc.web.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author leone
 * @since 2018-05-13
 **/
@Slf4j
@WebFilter(filterName = "appFilter", urlPatterns = "/**")
public class AppFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter 初始化 init方法！");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("filter 调用doFilter 方法！");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("filter 销毁 destroy方法！");
    }
}
