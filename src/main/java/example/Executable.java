package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by eljah32 on 9/16/2017.
 */

@ComponentScan(basePackages = "example")
public class Executable {

    @Autowired
    NonStaticSerializationRunner nonStaticSerializationRunner;

    @Autowired
    NonStaticDeserializationRunner nonStaticDeserializationRunner;

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Executable.class);
        Executable p = context.getBean(Executable.class);
        p.start();
    }

    void start()
    {
        String toReturn=nonStaticSerializationRunner.scenario();
        toReturn=toReturn.replace("Poor","Rich");
        nonStaticDeserializationRunner.scenario(toReturn);
    }

}