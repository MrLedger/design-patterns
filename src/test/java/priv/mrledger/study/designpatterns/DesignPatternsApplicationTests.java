package priv.mrledger.study.designpatterns;

import org.junit.jupiter.api.Test;
import priv.mrledger.study.designpatterns._01_Strategy.Dog;
import priv.mrledger.study.designpatterns._01_Strategy.RunBehavior;

public class DesignPatternsApplicationTests {

    @Test
    public void contextLoads() {
        Dog dog = new Dog(1, 7, new RunBehavior());
        dog.show();
    }

}
