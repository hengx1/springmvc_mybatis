package com.hengx;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
/**
 * @Author xcp
 * @date 2020/11/22 11:08
 */
@Service
public class SpringTest {
    @Test
    public void testSpring(){
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
SpringTest springTest =(SpringTest)applicationContext.getBean("springTest");
springTest.sayHello();

    }
    public void sayHello(){
        System.out.println("Hello");
    }
}
