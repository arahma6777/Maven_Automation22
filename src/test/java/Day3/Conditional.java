package Day3;

public class Conditional {
    public static void main(String[] args) {

            //define the set of variables
            int a = 1;
            int b = 3;
            int c = 4;

            //verify a+b > c, a+b <c or a+b == c
            if(a+b > c){
                System.out.println("a & b is greater than c");
            } else if(a+b < c) {
                System.out.println("a & b is less than c");
            } else {
                System.out.println("a & b is equal to c");
            }
        }//end of main
    }


/*
    public static void main(String[] args) {


        //Creating the numeric variable for grade
        int grade = 65;

//Creating the conditions based on grade input and what the letter grade will be
        if (grade >= 90 && grade <= 100) {
            System.out.println("Grade is A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Grade is B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Grade is C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }

    }


 */
