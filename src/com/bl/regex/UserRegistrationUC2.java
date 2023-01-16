package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^([A-Z]{1})([a-z]{2})([' '])([A-Z]{1})([a-z]{2})$");
        Matcher m = p.matcher("Abc Xyz");
        boolean b = m.matches();
        System.out.println(b);
    }
}
