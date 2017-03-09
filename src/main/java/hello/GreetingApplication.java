package hello;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GreetingApplication {

    public static void main(String[] args) {
        ApplicationContext contex = SpringApplication.run(GreetingApplication.class, args);
        
        String[] beanNames = contex.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String def : beanNames){
        	System.out.println(def);
        }
    }
}
