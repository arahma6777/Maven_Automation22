package Day2;

public class DynamicArray {

    public static void main(String[] args) {

        //create a linear string array for cities
        //declare the variable first
        String[] cities, zipcodes;
        //define the linear array for cities
        cities = new String[]{"Brooklyn", "Queens", "Manhattan", "Staten Island", "Bronx"};
        zipcodes = new String[]{"11218", "11385", "11432", "29201", "11231"};

        //define integer array for street number
        int[] streetNumber = new int[]{22,44,55,66,77,88};

        //setting a dynamic string array
        //String[] myDynamicStringArray;
        String[] myDynamicStringArray = new String[4];
        myDynamicStringArray[0] = "a";
        myDynamicStringArray[1] = "b";
        myDynamicStringArray[2] = "c";
        myDynamicStringArray[3] = "d";

        int[] myNumber = new int[2];
        myNumber[0] = 100;
        myNumber[1] = 101;

        System.out.println("My first city is " +cities[0] + " and street number is " +streetNumber[0] + " and my zipcode is " +zipcodes[2] + " and the letter is " + myDynamicStringArray[2]);

    }//end of main
}
