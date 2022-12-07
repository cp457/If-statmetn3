import java.util.Random;

public class Student {
    Random age = new Random();


    public String name;
    public int age1;

    public Student (String studentName, int studentAge){

        this.name = studentName;
        this.age1 = studentAge;

    }

    public  void guessingAge(){


        int randomN = 1 + age.nextInt(36);


        System.out.println(randomN);
        System.out.println(randomN > age1 ? "ciao" : randomN < 36 ? "ciao2" : "ciao3") ;



    }




}





/*

    define a class called Student that has:
        2 instance variables:
            a string name
            an integer age
        a constructor method that takes as parameters studentName and studentAge, assigning the values to the 2 instance variables
        a method guessingAge that:
            generates a random integer (using java.util.Random and nextInt()) that has 35 as upperbound
            prints the random value generated for name (e.g. I generated the random number X for student Y)
            prints if the random value is equal, greater or lower to the Student's age
    define a testing class where you:
        create a Student with your name and your age
        call the guessingAge method

 */