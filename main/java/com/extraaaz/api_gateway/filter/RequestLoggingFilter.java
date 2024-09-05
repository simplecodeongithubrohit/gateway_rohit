package com.extraaaz.api_gateway.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class RequestLoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response, FilterChain chain)
                         throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        System.out.println("Incoming request data log: " + httpServletRequest.getMethod() + " " + httpServletRequest.getRequestURI());
        chain.doFilter(request, response);
    }
}
