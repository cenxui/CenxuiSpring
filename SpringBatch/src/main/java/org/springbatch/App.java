package org.springbatch;

import org.springframework.boot.SpringApplication;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.exit(SpringApplication.exit(SpringApplication.run(BatchConfiguration.class, args)));
    }
}
