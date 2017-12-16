package com.skill.testjavastring;

public class TestString {
    public static void main(String aar[]) {
    String s="This is a test string [ hi(ap) test it.]";
    System.out.println("-->> "+s.split("\\)")[0].split("\\(")[1]);
    System.out.println("This code is of new checkout branch");
    }
}
