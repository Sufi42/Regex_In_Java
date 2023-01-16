package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMobileNumber {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(0|91)||[6-9]{1}[0-9]{9}");
        Matcher m = p.matcher("7276783237");
        boolean b = m.matches();
        System.out.println(b);

    }
}
