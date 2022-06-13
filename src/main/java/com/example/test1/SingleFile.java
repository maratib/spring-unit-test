package com.example.test1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SingleFile {

    @Value("${test.param}")
    private String testParam;

    public SingleFile() {
        System.out.println("Http Client created....");

    }

    public void print() {
        System.out.println("toString(): { sdfjk sdklaf jsdlk} : " + this.testParam);
    }

}
