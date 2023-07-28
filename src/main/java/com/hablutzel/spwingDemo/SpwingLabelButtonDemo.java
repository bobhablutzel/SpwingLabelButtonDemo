package com.hablutzel.spwingDemo;


import com.hablutzel.spwing.Spwing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


/**
 * The demo application. This launches the Spwing
 * environment, passing the application class as
 * the context root. This root will be used to find
 * all the key objects - they will be in the same
 * package or a subpackage.
 */
@Service
@Scope("singleton")
public class SpwingLabelButtonDemo {

    public static void main(String[] args) {

        // Launch Spwing
        Spwing.launch(SpwingLabelButtonDemo.class);
    }

    @Bean
    @Scope("singleton")
    public String launchCommand() {
        return "cmdNew";
    }

}
