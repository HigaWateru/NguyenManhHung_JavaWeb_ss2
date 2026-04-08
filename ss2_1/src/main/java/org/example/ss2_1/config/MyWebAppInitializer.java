package org.example.ss2_1.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    // LỖI ở đây — Servlet Mapping bị đặt sai
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };   // Nó đang sử lý url dạng /demo/api
        // Lỗi: DispatcherServlet chỉ lắng nghe request bắt đầu bằng /api/ -> /welcome bị bỏ qua -> 404
    }
}
