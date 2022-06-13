package com.example.test1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

// @SpringBootApplication
// @ContextConfiguration(locations = { "/application.properties" })
@SpringBootTest
public class SingleFileTest {

    @Autowired
    SingleFile singleFile;

    @Test
    public void httpTest() {
        singleFile.print();
        System.out.println("httpTest() method called");

    }

}
