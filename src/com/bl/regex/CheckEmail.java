package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^([a-zA-Z0-9-_+\\.]+)@([a-z0-9-]+)\\.([a-z]{2,8})(\\.[a-z]{2,7})?$");
        Matcher m = p.matcher("sufiyan.Gawandi42@gmail.com");
        Matcher m1 = p.matcher("abc+100@gmail.com");

        boolean b = m.matches();
        boolean b1 = m1.matches();

        System.out.println(b+" "+b1);

    }
}
