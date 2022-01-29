package Day2;

public class forLoop {

    public static void main(String[] args) {
        //iterate through all boroughs defined by dynamic array using for loop
        String[] boroughs = new String[6];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "Manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "Staten";
        boroughs[5] = "LI";

        for(int i = 0; i < boroughs.length;i++){
            //print statement
            System.out.println("My current borough is " + boroughs[i]);
        }//end of for loop
    }
}
