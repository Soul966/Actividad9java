import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Listas para contener las variables
        String [] nombrePerros = new String[2];
        String [] razas = new String[2];
        String [] comidas = new String[2];
        Integer [] edades = new Integer[2];
        Double [] cantidadesGramos = new Double[2];

        //objetos
        Scanner teclado = new Scanner(System.in);
        Perro a = new Perro();
        Perro b = new Perro();


            try {
                for (int cantidadPerros = 0; cantidadPerros < 2; cantidadPerros++) {
                    System.out.print("Ingrese el nombre del perro " + (cantidadPerros + 1) + ": ");
                    nombrePerros[cantidadPerros] = teclado.nextLine();
                }

                for (int cantidadRazas = 0; cantidadRazas < 2; cantidadRazas++) {
                    System.out.println("Ingrese la raza del perro " + (cantidadRazas + 1) + ":");
                    razas[cantidadRazas] = teclado.nextLine();
                }

                for (int numeroEdades = 0; numeroEdades < 2; numeroEdades++) {
                    System.out.println("Ingrese la edad en años en numeros enteros del perro " + (numeroEdades + 1) + ":");
                    edades[numeroEdades] = teclado.nextInt();
                    teclado.nextLine();
                }

                for (int numeroComidas = 0; numeroComidas < 2; numeroComidas++) {
                    System.out.println("Ingrese la comida del perro " + (numeroComidas + 1) + ":");
                    comidas[numeroComidas] = teclado.nextLine();
                }

                for (int numeroCantidades = 0; numeroCantidades < 2; numeroCantidades++) {
                    System.out.println("Ingrese la cantidad en gramos de la comida del perro " + (numeroCantidades + 1) + ":");
                    cantidadesGramos[numeroCantidades] = teclado.nextDouble();
                    teclado.nextLine();
                }


            } catch (InputMismatchException kaboom) {
                System.out.println("Error al ingresar los datos");
            }


        //añadimos todos los datos obtenidos a los dos objetos perrros
        //perro1
        try{
            System.out.println("El perro 1 tiene los siguientes datos");
            a.setNombre(nombrePerros[0]);
            a.setEdad(edades[0]);
            a.setRaza(razas[0]);
            System.out.println("Su nombre es: " + a.getNombre() + "\nEdad en años: " + a.getEdad() + "\nRaza: "+ a.getRaza());
            a.comer(comidas[0],cantidadesGramos[0]);
            System.out.println(a.Ladrar());

            //perro2
            System.out.println("El perro 2 tiene los siguientes datos");
            b.setNombre(nombrePerros[1]);
            b.setEdad(edades[1]);
            b.setRaza(razas[1]);
            System.out.println("\nSu nombre es: " + b.getNombre() + "\nEdad en años: " + b.getEdad() + "\nRaza: "+ b.getRaza());
            b.comer(comidas[1],cantidadesGramos[1]);
            System.out.println(b.Ladrar());

        }catch(NullPointerException e){
            System.out.println("No hay datos para ingresar");
        }





        }
    }
