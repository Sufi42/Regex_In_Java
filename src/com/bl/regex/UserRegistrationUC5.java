package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC5 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^(a-zA-Z0-9@#&){8}$");
        Matcher m = p.matcher("Abcdef@42");
        boolean b = m.matches();
        System.out.println(b);
    }
}
