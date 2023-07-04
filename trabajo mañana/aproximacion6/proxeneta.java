import java.util.Scanner;

public class proxeneta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionMenu = 0;
        Vivienda vivienda = null;

        while (opcionMenu != 6) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Crear un motel");
            System.out.println("2. Adicionar una prostituta al motel");
            System.out.println("3. Mostrar detalles del motel");
            System.out.println("4. Mostrar detalles de las prostitutas en el motel");
            System.out.println("5. Mostrar el total a pagar por las prostitutas");
            System.out.println("6. Salir");

            System.out.println("Escoja una opción:");
            opcionMenu = sc.nextInt();

            if (opcionMenu == 1) {
                System.out.println("Ingrese la dirección del motel: ");
                String direccion = sc.next();
                System.out.println("Ingrese el número de habitaciones: ");
                int numeroHabitaciones = sc.nextInt();
                System.out.println("Ingrese el área del motel: ");
                double area = sc.nextDouble();

                vivienda = new Vivienda(direccion, "", numeroHabitaciones, area);

                System.out.println("Motel creado correctamente.");
            } else if (opcionMenu == 2) {
                if (vivienda != null) {
                    System.out.println("Digite la raza de la prostituta: ");
                    String raza = sc.next();
                    System.out.println("Ingrese el género de la prostituta (F/M): ");
                    String genero = sc.next();
                    while (!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F")) {
                        System.out.println("Género no válido. Vuelva a intentarlo.");
                        System.out.print("Ingrese el género de la prostituta: ");
                        genero = sc.next();
                    }
                    System.out.println("Ingrese el número de prostitutas: ");
                    int numeroDeProstitutas = sc.nextInt();
                    System.out.println("Ingrese el costo: ");
                    double costo = sc.nextDouble();
                    System.out.println("Ingrese su presupuesto: ");
                    double vueltas = sc.nextDouble();
                    System.out.println("Ingrese el método de pago: ");
                    String metodoPago = sc.next();
                    System.out.println("Ingrese la calle: ");
                    String calle = sc.next();
                    System.out.println("Ingrese el barrio: ");
                    String barrio = sc.next();
                    System.out.println("Ingrese la dirección: ");
                    int direccionProstituta = sc.nextInt();

                    System.out.println("Ingrese el tipo de prostituta (Baja/Media/Alta): ");
                    String tipoProstituta = sc.next();

                    if (tipoProstituta.equalsIgnoreCase("Baja")) {
                        vivienda.adicionarBaja(raza, genero, numeroDeProstitutas, costo, vueltas, metodoPago, calle, barrio, direccionProstituta);
                    } else if (tipoProstituta.equalsIgnoreCase("Media")) {
                        vivienda.adicionarMedia(raza, genero, numeroDeProstitutas, costo, vueltas, metodoPago, calle, barrio, direccionProstituta);
                    } else if (tipoProstituta.equalsIgnoreCase("Alta")) {
                        vivienda.adicionarAlta(raza, genero, numeroDeProstitutas, costo, vueltas, metodoPago, calle, barrio, direccionProstituta);
                    } else {
                        System.out.println("Tipo de prostituta no válido.");
                    }
                } else {
                    System.out.println("Primero debe crear un motel.");
                }
            } else if (opcionMenu == 3) {
                if (vivienda != null) {
                    System.out.println(vivienda.toString());
                } else {
                    System.out.println("Primero debe crear un motel.");
                }
            } else if (opcionMenu == 4) {
                if (vivienda != null) {
                    System.out.println(vivienda.mostrarProstitutas());
                } else {
                    System.out.println("Primero debe crear un motel.");
                }
            } else if (opcionMenu == 5) {
                if (vivienda != null) {
                    System.out.println("Total a pagar por las prostitutas: " + vivienda.calcularTotalPagoProstitutas());
                } else {
                    System.out.println("Primero debe crear un motel.");
                }
            } else if (opcionMenu == 6) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción inválida. Vuelva a intentarlo.");
            }
        }

        sc.close();
    }
}

