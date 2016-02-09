package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "! ";
    }
    
    public HelloClass (String name,boolean a) {
     this.message="length of name "+name.length();

    }
    
    public String getMessage() {
        return message;
    }
}
