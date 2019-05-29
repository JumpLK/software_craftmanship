package com.epita.socra.app;

public class Roman {
    static public String toRoman(int decimal){
        int[] civilise = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder[] vieux = {new StringBuilder("M"),
                new StringBuilder("CM"),
                new StringBuilder("D"),
                new StringBuilder("CD"),
                new StringBuilder("C"),
                new StringBuilder("XC"),
                new StringBuilder("L"),
                new StringBuilder("XL"),
                new StringBuilder("X"),
                new StringBuilder("IX"),
                new StringBuilder("V"),
                new StringBuilder("IV"),
                new StringBuilder("I")};
        StringBuilder res = new StringBuilder("");

        int tmp = 0;

        while (tmp != decimal) {
            for (int i = 0; i < civilise.length; i++) {
                if (tmp + civilise[i] <= decimal) {
                    res.append(vieux[i]);
                    tmp += civilise[i];
                    break;
                }
            }
        }
        return res.toString();
    }

    static public String convertor(String s){
        int i = Integer.parseInt(s);
        return toRoman(i);
    }
}
