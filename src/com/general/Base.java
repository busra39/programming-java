package com.general;

public class Base {
    private static final char[] digits = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V'
    };

    /**
     * There is no unsigned integer in Java
     * @param value
     * @param base
     * @return
     */
    public static String base(int value, int base) {

        if (value <= 0 || base < 2 || base > 36) return "0";

        StringBuilder sb = new StringBuilder();
        while (value > 0) {
            int digit = value % base;
            sb.append(digits[digit]);
            value = value / base;
        }
        return sb.reverse().toString();

    }

}
