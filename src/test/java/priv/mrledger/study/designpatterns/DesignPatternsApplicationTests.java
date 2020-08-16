package priv.mrledger.study.designpatterns;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import priv.mrledger.study.designpatterns._01_Strategy.Animal;
import priv.mrledger.study.designpatterns._01_Strategy.Dog;
import priv.mrledger.study.designpatterns._01_Strategy.RunBehavior;

class DesignPatternsApplicationTests {

    @Test
    void contextLoads() {
        Animal dog = new Dog(1, 7, new RunBehavior());
        System.out.println(dog);
    }

}
