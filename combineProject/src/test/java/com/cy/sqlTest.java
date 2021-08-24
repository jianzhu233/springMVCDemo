package com.cy;

import java.sql.Connection;
import javax.sql.DataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class sqlTest {
    @Test
    public void test03() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    ApplicationContext iocContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void testEnvironment() throws Exception {

        DataSource ds = iocContext.getBean("dataSource", DataSource.class);
        Connection conn = ds.getConnection();

        System.out.println(conn);
        System.out.println("1");

    }
}
