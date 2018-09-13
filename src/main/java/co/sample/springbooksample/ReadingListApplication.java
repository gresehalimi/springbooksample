package co.sample.springbooksample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
//this class serves us for configuration and bootsrap.
//Enables Spring component scaning and auto-configuration.
//@SpringbootApplication combines three useful annotations: @Configuration, @ComponentScan, @EnableAutoConfiguration.
    public class ReadingListApplication {

        public static void main(String[] args) {

            SpringApplication.run(ReadingListApplication.class, args); //bootstrap the application(bootstrap- the first piece of code that runs when machine starts)

        }}


