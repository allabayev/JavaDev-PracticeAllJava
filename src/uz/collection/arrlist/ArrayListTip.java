package uz.collection.arrlist;

import java.util.ArrayList;

public class ArrayListTip {
    public static void main(String[] args) {

        ArrayList<Integer> demoInt = new ArrayList<Integer>();
        demoInt.add(8);
        demoInt.add(44);
        demoInt.add(44);

        System.out.println(demoInt);



        System.out.println(demoInt);
        ArrayList<String> demoString = new ArrayList<>();
        demoString.add("34");
        demoString.add("Hey bola");
        demoString.add("Olma");
        demoString.add("Apple");
        System.out.println(demoString);

        if (demoString.contains("Olma")){
            System.out.println("Yes, da bor");
        } else {
            System.out.println("Net, no here");
        }

        demoString.remove("Olma");
        System.out.println(demoString);

    }
}


/***
 * Task:
 *  removeAll
 *  removeIf
 *  isEmpty
 *  ensureCapacity
 * */