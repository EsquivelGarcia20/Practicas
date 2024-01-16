package System_University;

import java.util.Scanner;

public class Main{

private static Scanner leer = new Scanner(System.in); 

public static void main(String[] args) {
    

Courses_University dataEntry = new Courses_University(null, null, null);
Number_Buildings dataBuildings = new Number_Buildings(null, null, null);
dataBuildings.showLounge();
dataEntry.coursesUniversity();

}

}
