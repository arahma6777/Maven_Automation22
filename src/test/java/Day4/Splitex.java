package Day4;

public class Splitex {

    public static void main(String[] args) {

        String mySentence = "Sam prayed Fajr and Arif did not and pray.";

        //System.out.println(mySentence);

        String[] mySplit = mySentence.split("Sam prayed Fajr");
        String[] mySplit2 = mySplit[1].split("not and pray");
        System.out.println(mySplit2[0]);
    }//end of main
}
