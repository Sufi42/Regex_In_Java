package com.bl.regex;
import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("[S]*[a-zA-Z]*[n]");
        Matcher m1 = p1.matcher("Sufiyan");
        boolean b2 = m1.matches();
        System.out.println(b2);
        boolean b1 = m1.find();
        System.out.println(b1);

       // Pattern p2  = Pattern.compile("[S]*[A-Za-z].*");
        Pattern p2 = Pattern.compile("[S].*[n]");
        Matcher m2 = p2.matcher("Sufiyan");
        boolean b3 = m2.matches();
        System.out.println(b3);
 }
}
