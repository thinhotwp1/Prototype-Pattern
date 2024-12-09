package thinhld.desgin.prototypepattern.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // Mỗi lần getBean sẽ trả về một instance mới, có thể tắt bật và test ở PrototypePatternApplication
public class PrototypeBean {
    private String name;

    public PrototypeBean() {
        System.out.println("PrototypeBean instance created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
