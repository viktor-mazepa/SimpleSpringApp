package com.mazasoft.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    private static String APPLICATION_CONTEXT_FILE_NAME = "applicationContext.xml";
    private static String TEST_BEAN_NAME = "testBean";

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_FILE_NAME);

        TestBean testBean = context.getBean(TEST_BEAN_NAME, TestBean.class);

        System.out.println("Name parameter from bean: " + testBean.getName());

        context.close();
    }
}
