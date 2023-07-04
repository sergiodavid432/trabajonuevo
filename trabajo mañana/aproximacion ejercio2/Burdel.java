import java.util.Scanner;

public class Burdel {
    public static void main(String[] args) {
        prostitutas[] elburdel = new prostitutas[50];
        Scanner scanner = new Scanner(System.in);
        int numerodeprostitutas;
        String[] raza;
        String[] generodeprostitutas;
        double[] precios;
        double presupuesto;
        double[] vueltas;

        System.out.println("+------------------------------------------------+");
        System.out.println("|         Bienvenido al burdel Los Gusaneros      |");
        System.out.println("+------------------------------------------------+");

        System.out.print("Ingrese el número de prostitutas que desee (máximo 10): ");
        numerodeprostitutas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite su presupuesto para las prostitutas: ");
        presupuesto = scanner.nextDouble();
        scanner.nextLine();

        raza = new String[numerodeprostitutas];
        generodeprostitutas = new String[numerodeprostitutas];
        precios = new double[numerodeprostitutas];
        vueltas = new double[numerodeprostitutas];

        for (int i = 0; i < numerodeprostitutas; i++) {
            System.out.println("-------------------------------------------------");

            System.out.print("Elija su método de pago para la prostituta " + (i + 1) + " (E/T): ");
            String pago = scanner.next();

            while (!pago.equalsIgnoreCase("E") && !pago.equalsIgnoreCase("T")) {
                System.out.println("Perrito, este burdel solo acepta efectivo (E) o tarjeta de crédito (T).");
                System.out.print("Ingrese correctamente su método de pago " + (i + 1) + " (E/T): ");
                pago = scanner.next();
            }

            System.out.print("Ingrese la raza de la prostituta: ");
            scanner.nextLine(); // Consumir el carácter de nueva línea en el búfer
            raza[i] = scanner.nextLine();

            System.out.print("Ingrese el precio de la prostituta: ");
            precios[i] = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Ingrese el género de su prostituta (M/F): ");
            generodeprostitutas[i] = scanner.nextLine();

            while (!generodeprostitutas[i].equalsIgnoreCase("M") && !generodeprostitutas[i].equalsIgnoreCase("F")) {
                System.out.println("Perrito, este burdel solo acepta género 'M' o 'F'. Vuelva a intentarlo.");
                System.out.print("Ingrese el género de su prostituta  " + (i + 1) + " (M/F): ");
                generodeprostitutas[i] = scanner.nextLine();
            }

            vueltas[i] = presupuesto - precios[i];
        }

        System.out.println("+------------------------------------------------+");
        System.out.println("|             Datos ingresados                   |");
        System.out.println("+------------------------------------------------+");
        System.out.println("Número de prostitutas: " + numerodeprostitutas);

        for (int i = 0; i < numerodeprostitutas; i++) {
            System.out.println("Prostituta " + (i + 1) + " - Raza: " + raza[i] + ", Precio: " + precios[i] + ", Género elegido: " + generodeprostitutas[i] + ", Su vuelta es: " + vueltas[i]);
        }

        System.out.println("+------------------------------------------------+");
        System.out.println("|           Gracias por su compra                |");
        System.out.println("+------------------------------------------------+");

        scanner.close();
    }
}



 