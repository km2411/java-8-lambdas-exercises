package com.insightfullogic.java8.answers.chapter2;

import org.junit.Test;

import javax.swing.*;

public class Question3Test {

    @Test
    public void exampleInA() {
        Runnable helloWorld = () -> System.out.println("Hello World");
        helloWorld.run();

//        compiles
//        JButton button = new JButton();
//        button.addActionListener(event ->
//                System.out.println(event.getActionCommand()));

    }

}
