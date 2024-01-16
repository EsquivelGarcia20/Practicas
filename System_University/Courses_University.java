package System_University;

import java.util.Scanner;

public class Courses_University extends University_Data {

    /*String[] coursesName = { "Licenciatura en Medicina", "Ingeniería Civil",
    "Licenciatura en Psicología", "Licenciatura en Administración de Empresas",
    "Licenciatura en Biología", "Licenciatura en Derecho", "Licenciatura en Arquitectura",
    "Licenciatura en Química", "Licenciatura en Periodismo",
    "Licenciatura en Economía", "Licenciatura en Ciencias de la Computación", "Licenciatura en Enfermería",
    "Licenciatura en Historia", "Licenciatura en Ciencias Políticas",
    "Licenciatura en Matemáticas", "Licenciatura en Comunicación Audiovisual", "Licenciatura en Sociología",
    "Licenciatura en Geología", "Licenciatura en Educación Física",
    "Licenciatura en Contabilidad", "Licenciatura en Farmacia", "Licenciatura en Diseño Gráfico",
    "Licenciatura en Agronomía", "Licenciatura en Física",
    "Licenciatura en Relaciones Internacionales", "Licenciatura en Lingüística",
    "Licenciatura en Odontología", "Licenciatura en Turismo", "Licenciatura en Geografía",
    "Licenciatura en Ciencias Ambientales", "Licenciatura en Artes Escénicas", "Licenciatura en Música",
    "Licenciatura en Terapia Ocupacional", "Licenciatura en Trabajo Social",
    "Licenciatura en Astronomía", "Licenciatura en Nutrición", "Licenciatura en Marketing",
    "Ingeniería Eléctrica", "Licenciatura en Filosofía", "Licenciatura en Geotecnia",
    "Licenciatura en Ciencias del Deporte", "Ingeniería Mecánica", "Licenciatura en Ciencias Forenses",
    "Licenciatura en Psicopedagogía", "Licenciatura en Ciencias Actuariales",
    "Licenciatura en Traducción e Interpretación", "Ingeniería Química", "Licenciatura en Ciencias Marinas",
    "Licenciatura en Comercio Internacional", "Licenciatura en Filología",
    "Licenciatura en Terapia Física", "Licenciatura en Ciencias de Datos",
    "Licenciatura en Historia del Arte", "Licenciatura en Antropología", "Ingeniería Aeroespacial",
    "Licenciatura en Estadística", "Licenciatura en Ciencias de la Alimentación", "Ingeniería Biomédica",
    "Licenciatura en Letras Clásicas", "Licenciatura en Ciencias de la Información",
    "Licenciatura en Animación", "Licenciatura en Ciencias Veterinarias",
    "Licenciatura en Ciencias del Medio Ambiente", "Ingeniería Industrial", "Licenciatura en Fotografía",
    "Licenciatura en Paleontología", "Licenciatura en Ciencias Forenses", "Ingeniería de Software",
    "Licenciatura en Estudios de Género", "Licenciatura en Ciencias de la Salud",
    "Ingeniería Agrícola", "Licenciatura en Filosofía Política", "Licenciatura en Ciencias Cognitivas",
    "Ingeniería en Nanotecnología", "Ingeniería Nuclear",
    "Licenciatura en Ciencias de la Religión", "Licenciatura en Criminología",
    "Licenciatura en Artes Plásticas", "Licenciatura en Oceanografía",
    "Licenciatura en Ciencias del Espacio",
    "Ingeniería de Sistemas", "Licenciatura en Filología Hispánica",
    "Licenciatura en Ciencias del Consumidor", "Ingeniería Ambiental", "Licenciatura en Musicología",
    "Licenciatura en Ciencias del Deporte y Recreación",
    "Ingeniería de Telecomunicaciones", "Licenciatura en Danza", "Licenciatura en Ciencias de la Robótica",
    "Ingeniería de Control", "Licenciatura en Medicina Veterinaria", "Licenciatura en Ciencias Poliméricas",
    "Ingeniería de Materiales", "Licenciatura en Ciencias Textiles", "Ingeniería de Petróleo",
    "Licenciatura en Ciencias del Color", "Ingeniería Acústica",
    "Licenciatura en Ciencias de la Documentación", "Ingeniería de Procesos",
    "Licenciatura en Ciencias de la Educación" };*/

    public Courses_University(int[] building, int[] lounge, int[] students) {
        super(building, lounge, students);
        //TODO Auto-generated constructor stub
    }

    //mostrar las carreras
   /*  public String[] showCoursesName() { 
        // Obtener la dimensión del arreglo desde el usuario
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de cursos: ");
        int dimension = read.nextInt();
        read.nextLine();  //salto de linea 

        // Inicializar el arreglo con la dimensión proporcionada por el usuario
        String[] coursesName = new String[dimension];

        // Solicitar al usuario que ingrese los nombres de los cursos
        for (int i = 0; i < coursesName.length; i++) {
            System.out.print("Ingrese el nombre del curso " + (i + 1) + ": "); //se pone (i+1) para que empiese desde la posición 1
            coursesName[i] = read.nextLine();
        }

        return coursesName;
    }*/

    @Override
    public int[][] showLounge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showLounge'");
    }

    @Override
    public String[] coursesUniversity() {
         // Obtener la dimensión del arreglo desde el usuario
         Scanner read = new Scanner(System.in);
         System.out.print("Ingrese la cantidad de cursos: ");
         int dimension = read.nextInt();
         read.nextLine();  //salto de linea 
 
         // Inicializar el arreglo con la dimensión proporcionada por el usuario
         String[] coursesName = new String[dimension];
 
         // Solicitar al usuario que ingrese los nombres de los cursos
         for (int i = 0; i < coursesName.length; i++) {
             System.out.print("Ingrese el nombre del curso " + (i + 1) + ": "); //se pone (i+1) para que empiese desde la posición 1
             coursesName[i] = read.nextLine();
         }
 
         return coursesName;
    }
}
