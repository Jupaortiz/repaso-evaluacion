package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //REGISTRAR | BUSCAR TODOS | BUSCAR UNO | MODIFICAR UN ESTIDIANTES
        //ESTUDIANTE TIENE ID, NOMBRE Y CEDULA

        //ENTRADAS
        Scanner leerTeclado=new Scanner(System.in);
        ArrayList<HashMap<String,Object>>estudiantes=new ArrayList<>();
        System.out.println("Menu");
        System.out.println("1.Registrar");
        System.out.println("2.Buscar todos");
        System.out.println("3.Buscar por nombre");
        System.out.println("4.Modificar");
        System.out.println("Salir");
         int opcion;

        do {
            HashMap<String,Object>estudiante=new HashMap<>();
            System.out.print("Digite la opcion: ");
            opcion=leerTeclado.nextInt();
            leerTeclado.nextLine();
            if (opcion==1){
                System.out.println("Registrar");
                System.out.print("Digite el nombre del estudiante: ");
                String nombreEstudiante= leerTeclado.nextLine();
                System.out.print("Digite la cedula: ");
                String cedulaEstudiante= leerTeclado.nextLine();
                int idEstudiante= new Random().nextInt(100);

                estudiante.put("id",idEstudiante);
                estudiante.put("nombre",nombreEstudiante);
                estudiante.put("cedula",cedulaEstudiante);

                estudiantes.add(estudiante);

            } else if (opcion==2) {
                System.out.println("Buscar todos");
            } else if (opcion==3) {

            } else if (opcion==4) {

            } else if (opcion==5) {

            } else {}
        }while (opcion!=5);
    }
}