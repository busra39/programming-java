package com.general;

import com.general.javatest.DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String...args){
        //fibonacci();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(3);
        list1.add(7);
        list1.add(12);
        list1.add(23);
        list1.add(34);
        list1.add(37);
        list1.add(89);
        list2.add(22);
        list2.add(33);
        list2.add(37);
        list2.add(88);
        list2.add(77);
        merge(list1, list2);
    }

    public static void fibonacci(){
        long first = 1;
        long second = 1;
        int counter = 2;
        long sum = 0;
        while(counter <= 100) {
            long tmp = first + second;
            first = second;
            second = tmp;
            if(tmp %2 ==0) {
                sum += second;
                counter++;
            }

        }
        System.out.println(sum);
    }



    public static void merge(List<Integer> l1, List<Integer> l2) {
        for (int index1 = 0, index2 = 0; index2 < l2.size(); index1++) {
            if (l1.get(index1) > l2.get(index2)) {
                l1.add(index1, l2.get(index2));
                index2++;
            }
        }
        System.out.println(l1);
    }

    public void base(long value, long base) {

    }
}
