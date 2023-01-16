package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^([a-z]{3})([\\.])?([a-z]{3})?([@])([a-z]{2})([\\.])([a-z]{2})" +
                "([\\.])?([a-z]{2})?$");
        Matcher m = p.matcher("abc.xyz@bl.co.in");
        boolean b = m.matches();
        System.out.println(b);

    }
}
