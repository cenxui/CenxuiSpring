package org.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */

@Controller // let spring to consider it as a web request handler
@EnableAutoConfiguration // let spring to guess your config
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @RequestMapping("/") // mapping to the path 
    @ResponseBody // let spring know this function will return this function as a response body.
    public String home() {
    	return "Hello Spring !" ;
    }
    
    @RequestMapping("/login")
    @ResponseBody
    public String login() {
		return "Welcome to login";
	}
    
}
