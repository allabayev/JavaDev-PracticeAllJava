package uz.collection.arrlist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /***
         Array - massiv
         List - spisok
           - add
           - remove
           - clear
           - set
           - get
         * */

        ArrayList demo = new ArrayList ();
        demo.add("Abdullayev");
        demo.add("Allabayev");
        demo.add("Mamajanov");
        demo.add(5);
        demo.add(5);
        demo.add(6);
        demo.add(88.3);

        System.out.println("Orginal: " + demo);
        System.out.println("------------------");
        System.out.println(demo.get(1));
        System.out.println("-----SET ------");
        demo.set(4, "Donik");
        System.out.println(demo);
        System.out.println("-------ADD with Index----");
        demo.add(0, "Ozod");
        demo.add(3, "Yuri");
        demo.add(4, "Gagarin");
        demo.add(6,"Kasmanovat");
        demo.add("Orifjon");

        demo.remove(4);
        demo.remove(6);
        demo.remove(7);
        demo.remove(7);

        System.out.println("-----Remove ----- ");
        System.out.println(demo);









        System.out.println("-----Clear ------ ");
        demo.clear();



        System.out.println(demo);
    }
}
