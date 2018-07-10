package com.seda.springboot;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component
public class TimeFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("=================初始化过滤器===================");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		long start = System.currentTimeMillis();
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();
		System.out.println(uri);
		chain.doFilter(request, response);
		System.out.println("耗时：" + (System.currentTimeMillis() - start));
	}

	public void destroy() {
		System.out.println("==================销毁过滤器=====================");
	}

}
