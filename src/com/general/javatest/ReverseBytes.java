package com.general.javatest;

public class ReverseBytes {

    public static void main(String... args) {
        reverse_bytes(new byte[]{'s','k','r','o','w','t','e','N',' ','z','z','a','J'});
    }

    public static void reverse_bytes(byte[] byteArray) {
        if(byteArray.length == 0)
            return;

        int first = 0;
        int last = byteArray.length -1;
        while(first <= last) {
            byte tmp = byteArray[last];
            byteArray[last] = byteArray[first];
            byteArray[first] = tmp;
            first++;
            last--;
        }
        for(int i =0; i< byteArray.length; i++)
            System.out.print((char)byteArray[i]+ " ");
    }
}
