package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class DeptListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {
    private static String SPRING_CONTEXT_KEY;

    // Public constructor is required by servlet spec
    public DeptListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis-spring.xml");
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute(SPRING_CONTEXT_KEY,"a");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }
}
