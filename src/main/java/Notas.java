import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre ;
        int nota, edad;
        int edades = 0;
        float [] notas = new float[]{0f,0f,0f};
        int acumuladorNotas=0;


        for (int i = 0; i < 3 ; i++) {
            acumuladorNotas=0;
            System.out.println("ingrese se nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
            edades = edades+edad;

            for (int j = 0; j < 3; j++) { //las notas acumuladas de cada estudiante.
                System.out.println("Ingrese nota ");
                nota = entrada.nextInt();
                acumuladorNotas=nota+acumuladorNotas;
            }
            notas[i]=acumuladorNotas/3;


        }
        System.out.println("El promedio de edades es : "+edades/3);
        System.out.println("El promedio de notas estudiante 1 es: "+notas[0]);
        System.out.println("El promedio de notas estudiante 2 es: "+notas[1]);
        System.out.println("El promedio de notas estudiante 3 es: "+notas[2]);



    }
}
