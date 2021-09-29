package com.company;

public class Main {

    public static void main(String[] args) {
        String str1 = "1,4,5,NaN,,,,65,32,,,NaN,aString,4,56,99";
        String str2 = "2,7,,xc,te,34,ng,,,45g,as3,34,,1";
        String str3 = ",45,+,},xcs,ujSD,JSON,455,23,,,*,*,3,,";
        Converter converter = new Converter();
        System.out.println(converter.convert(str1));
        System.out.println(converter.convert(str2));
        System.out.println(converter.convert(str3));


    }
}
