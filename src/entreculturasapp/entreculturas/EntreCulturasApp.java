/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreculturasapp.entreculturas;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author xavi
 */
public class EntreCulturasApp {

    /**
     * @param args the command line arguments
     * @throws IOException
     */

    static int option;
    private static boolean quit = false;
    public static void main(String[] args) throws IOException {
        
        System.out.println("\n ***** ONG EntreCulturas ***** \n\n ----Menú principal---- \n\n\n >>> Seleccione una opción: \n"
				+ " 1. Gestión de Socios. \n 2. Proyectos. \n 3. Ingresos\n 4. Menú del administrador \n 5. Salir \n");
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		sc.close();
        do {
            selecOpcion();	
		} while (!quit);
    }
        public static boolean selecOpcion() throws IOException {

            if (option == 5){
                return true;
            }
            switch (option) {
    
                case 1:	menuSocios();
                        break;
    
                case 2: //menuProyectos();
                        System.out.println("\n ******* Bienvenido al menú de Proyectos *******\n\n >>> Seleccione una opción: \n 1. Crear proyecto\n 2. Modificar proyecto \n 3. Eliminar proyecto \n 4. Consultar proyectos\n");
                        option = 0;
                        Scanner sc = new Scanner(System.in);
                        option = sc.nextInt();
                        switch (option) {
                            case 1: System.out.println("Hola");
                
                            case 2: System.out.println("Adios");
                
                            //case 3:
                
                            //case 4:
                        }
                        sc.close();
                                break;
    
                case 3: menuIngresos();
                        break;
    
                case 4: menuAdmin();
                        break;					
            }
            return false;
    
        }
        
        public static void menuProyectos() {
		
            System.out.println("\n ******* Bienvenido al menú de Proyectos *******\n\n >>> Seleccione una opción: \n 1. Crear proyecto\n 2. Modificar proyecto \n 3. Eliminar proyecto \n 4. Consultar proyectos\n");
            option = 0;
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option) {
                case 1: System.out.println("Hola");
    
                case 2: System.out.println("Adios");
    
                //case 3:
    
                //case 4:
            }
            sc.close();
            
            
        }
            
        
        
        public static void menuSocios() throws IOException {
    
            System.out.println("\n ******* Bienvenido al menú de Socios *******\n\n >>> Seleccione una opción: \n 1. Añadir socio\n 2. Modificar socio \n 3. Eliminar socio \n 4. Consultar socios\n");
            option = 0;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                option = in.read();
                switch (option) {
                    case 1: System.out.println("1");
        
                    case 2: System.out.println("2");
        
                    case 3: System.out.println("3");
        
                    case 4: System.out.println("4");
                }                      
        }
        
        public static void menuAdmin() {
            
            Console console = System.console();
            System.out.println("\n ******* Bienvenido al menú del administrador *******\n\n >>> Introduzca la contraseña: \n");
            char [] password = console.readPassword("Enter password");
            Arrays.fill(password,'*');
            System.out.println("\nContraseña incorrecta\n");
            
        }
        
        public static void menuIngresos() {
    
            System.out.println("\n ******* Bienvenido al menú de Ingresos *******\n\n >>> Seleccione una opción: \n 1. Crear ingreso\n 2. Consultar ingresos \n ");
            option = 0;
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            sc.close();
    
            switch (option) {
                case 1: 
    
                case 2:
    
            }
            
        }
    }
    

