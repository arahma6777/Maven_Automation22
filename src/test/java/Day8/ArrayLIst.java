package Day8;

import java.util.ArrayList;

public class ArrayLIst {

    public static void main(String[] args) {

        //ArrayList is a resizable array which means you don't need to add the length to-
        //add more array values.
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");


        //shortcut for println is sout lowercase
        System.out.println("My city is " + cities.get(1));

        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(111);
        streetNumber.add(112);
        streetNumber.add(113);


        System.out.println("My third city is " + cities.get(2) + " and my third house number is " + streetNumber.get(2));

    }//end of main
}
