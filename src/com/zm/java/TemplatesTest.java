package com.zm.java;

import com.zm.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 */
public class TemplatesTest {

    private static final Customer cust=new Customer();
    public static final int num=1;
    public static final int num2=2;
    public static final String  NATION="china";


    public static void main(String[] args) {
        System.out.println("hello");
       /* System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);*/

        String[] arr = new String[]{"tom", "jerry", "hanmeimei", "lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list);
        }
    }

    public void method() {
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
    }
}