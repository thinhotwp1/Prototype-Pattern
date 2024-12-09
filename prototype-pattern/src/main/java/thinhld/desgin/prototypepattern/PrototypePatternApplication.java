package thinhld.desgin.prototypepattern;

import thinhld.desgin.prototypepattern.spring.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PrototypePatternApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrototypeBean.class);

        PrototypeBean bean1 = context.getBean(PrototypeBean.class);
        bean1.setName("Bean 1");

        PrototypeBean bean2 = context.getBean(PrototypeBean.class);
        bean2.setName("Bean 2");

        System.out.println("Bean 1 name: " + bean1.getName());
        System.out.println("Bean 2 name: " + bean2.getName());
        System.out.println("Are beans different? " + (bean1 != bean2)); // Output: true
    }

}
