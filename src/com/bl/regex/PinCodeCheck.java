package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeCheck {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^([0-9]{3}[' ']?[0-9]{3})$");
        Matcher m = p.matcher("400088");
        Matcher m1 = p.matcher("400 088");
        boolean b1 = m1.matches();
        System.out.println(b1);
        boolean b = m.matches();
        System.out.println(b);
    }
}
