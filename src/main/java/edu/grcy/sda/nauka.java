package edu.grcy.sda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class nauka {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Collections.shuffle(list);
        System.out.println(list);
// przykładowy wynik po uruchomieniu: [C, D, A, B]
    }

}
