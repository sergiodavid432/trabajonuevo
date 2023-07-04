import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDeProstitutas = 0;
        int opcionMenu = 0;
        Prostituta[] lasprostitutas = new Prostituta[50];
        String sexo, raza;
        double presupuesto = 0, pago = 0, totalCostoProstitutas = 0;

        while (opcionMenu != 6) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Adicionar una prostituta");
            System.out.println("2. Elige tu método de pago");
            System.out.println("3. Ingresar tu presupuesto");
            System.out.println("4. Elegir tu raza preferida");
            System.out.println("5. Ingresar el sexo que prefieres");
            System.out.println("6. Total a pagar");

            System.out.println("Escoja una opción:");
            opcionMenu = sc.nextInt();

            if (opcionMenu == 1) {
                System.out.println("Digite su raza preferida: ");
                raza = sc.next();
                System.out.println("Ingrese el sexo de la prostituta (F/M): ");
                sexo = sc.next();
                while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                    System.out.println("Este burdel solo acepta género 'M' o 'F'. Vuelva a intentarlo.");
                    System.out.print("Ingrese el género de la prostituta: ");
                    sexo = sc.next();
                }
                System.out.println("Ingrese el presupuesto de la prostituta (entre 10000 y 1000000): ");
                presupuesto = sc.nextDouble();
                while (presupuesto < 10000 || presupuesto > 1000000) {
                    System.out.println("El presupuesto debe estar entre 10000 y 1000000. Vuelva a intentarlo.");
                    System.out.print("Ingrese el presupuesto de la prostituta: ");
                    presupuesto = sc.nextDouble();
                }

                totalCostoProstitutas += presupuesto;

                Prostituta nuevaProstituta = new Prostituta(sexo, raza, presupuesto, pago, numeroDeProstitutas);
                lasprostitutas[numeroDeProstitutas] = nuevaProstituta;
                numeroDeProstitutas++;
                System.out.println("Prostituta añadida correctamente.");
            } else if (opcionMenu == 6) {
                System.out.println("Resumen de prostitutas:");
                for (int i = 0; i < numeroDeProstitutas; i++) {
                    System.out.println("Prostituta " + (i + 1) + ": " + lasprostitutas[i].toString());
                }
                System.out.println("Total a pagar: " + totalCostoProstitutas);
            }
        }
    }
}

