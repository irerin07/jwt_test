package com.bezkoder.springjwt.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebFault;
import java.io.IOException;

@WebFilter("/users/*")
public class AddResponseHeaderFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader(
                "Baeldung-Example-Filter-Header", "Value-Filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
