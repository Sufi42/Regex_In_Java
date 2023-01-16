package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^([A-Z]{1})([a-z]+)$");
        Matcher m = p.matcher("Abcdf");
        boolean b = m.matches();
        System.out.println(b);
    }
}
