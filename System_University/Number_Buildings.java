package System_University;

import java.util.Scanner;

public class Number_Buildings extends University_Data {

    public Number_Buildings(int[] building, int[] lounge, int[] students) {
        super(building, lounge, students);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int[][] showLounge() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de edificios: ");
        int numberBuildings = read.nextInt();
        int[][] container = new int[numberBuildings][];

        for (int i = 0; i < container.length; i++) {
            System.out.println("Ingresa la catidad de salones por Edificio: " + (i + 1));
            int numberLounge = read.nextInt();

            container[i] = new int[numberLounge];
            System.out.println("Ingresaste: " + numberLounge + " " + "Salones al Edificio");
            for (int j = 0; j < numberLounge; j++) {
                System.out.println("Ingresa la capacidad del salon" + (j + 1) + "para el Edificio" + (i + 1));
                container[i][j] = read.nextInt();

            }
        }

        return container;
    }

    @Override
    public String[] coursesUniversity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'coursesUniversity'");
    }

}
