package org.boostcourse.main;

import org.boostcourse.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam02 {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Car car = (Car)ac.getBean("car");
        car.run();
    }
}
