package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC4 {
    public static void main(String[] args) {
        int countryCode = 91;
        Pattern p = Pattern.compile("^([91]{2})\s([0-9]{10})$");
        Matcher m = p.matcher("91 7276783237");
        boolean b = m.matches();
        System.out.println(b);
    }
}
