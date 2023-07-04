import java.util.Scanner;

public class Burdellosgusaneros {
    public static void main(String[] args) {
        System.out.println("+------------------------------------------------+");
        System.out.println("|         Bienvenido al burdel Los Gusaneros      |");
        System.out.println("+------------------------------------------------+");

        Scanner scanner = new Scanner(System.in);

        String genero2;
        int numeroProstitutas;
        int[] precios;
        String[] raza;
        String[] generoProstituta;
        int presupuesto;
        int[] resultado;
        String[] pago;

        System.out.print("Ingrese el número de prostitutas que desee (máximo 10): ");
        numeroProstitutas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite su presupuesto para las prostitutas: ");
        presupuesto = scanner.nextInt();
        scanner.nextLine();

        precios = new int[numeroProstitutas];
        raza = new String[numeroProstitutas];
        generoProstituta = new String[numeroProstitutas];
        resultado = new int[numeroProstitutas];
        pago = new String[numeroProstitutas];

        for (int i = 0; i < numeroProstitutas; i++) {
            System.out.println("-------------------------------------------------");

            System.out.print("Elija su método de pago para la prostituta " + (i + 1) + " (E/T): ");
            pago[i] = scanner.nextLine();

            while (!pago[i].equalsIgnoreCase("E") && !pago[i].equalsIgnoreCase("T")) {
                System.out.println("Perrito, este burdel solo acepta efectivo (E) o tarjeta de crédito (T).");
                System.out.print("Ingrese correctamente su método de pago  " + (i + 1) + " (E/T): ");
                pago[i] = scanner.nextLine();
            }

            System.out.print("Ingrese la raza de la prostituta " + (i + 1) + ": ");
            raza[i] = scanner.nextLine();

            System.out.print("Ingrese el precio de la prostituta " + (i + 1) + ": ");
            precios[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el género de su prostituta  " + (i + 1) + " (M/F): ");
            genero2 = scanner.nextLine();

            while (!genero2.equalsIgnoreCase("M") && !genero2.equalsIgnoreCase("F")) {
                System.out.println("Perrito, este burdel solo acepta género 'M' o 'F'. Vuelva a intentarlo.");
                System.out.print("Ingrese el género de su prostituta  " + (i + 1) + " (M/F): ");
                genero2 = scanner.nextLine();
            }

            generoProstituta[i] = genero2;
            resultado[i] = presupuesto - precios[i];
        }

        System.out.println("+------------------------------------------------+");
        System.out.println("|             Datos ingresados                   |");
         System.out.println("+------------------------------------------------+");
        System.out.println("Número de prostitutas: " + numeroProstitutas);

        int total = 0; // Variable para almacenar el total de precios

        for (int i = 0; i < numeroProstitutas; i++) {
            System.out.println("Prostituta " + (i + 1) + "  Raza: " + raza[i] + ", Precio: " + precios[i] + ", Género elegido: " + generoProstituta[i] + ", Su vuelta es: " + resultado[i]);
            total += precios[i]; // Actualizar el total sumando el precio de cada prostituta
        }
        System.out.println("Total: " + total);

        System.out.println("+------------------------------------------------+");
        System.out.println("|           Gracias por su compra                |");
        System.out.println("+------------------------------------------------+");

        scanner.close();

        // Crear una instancia de Prostitutas y asignarle los datos
        Prostitutas prostitutas = new Prostitutas();
        prostitutas.setRaza(raza);
        prostitutas.setGenero(generoProstituta);
        prostitutas.setTotal(total);

        // Crear una instancia de Calle y asignarle las prostitutas
        Calle calle = new Calle();
        calle.setProstitutas(prostitutas);

        // Acceder a los datos de la Calle y las Prostitutas
        System.out.println("Total en la calle: " + calle.getProstitutas().getTotal());
        System.out.println("Número de prostitutas en la calle: " + calle.getProstitutas().getRaza().length);
        System.out.println("Raza de la primera prostituta en la calle: " + calle.getProstitutas().getRaza()[0]);
        System.out.println("Género de la primera prostituta en la calle: " + calle.getProstitutas().getGenero()[0]);
    }
}

class Prostitutas {
    private String[] raza;
    private String[] genero;
    private int total;

    public String[] getRaza() {
        return raza;
    }

    public void setRaza(String[] raza) {
        this.raza = raza;
    }

    public String[] getGenero() {
        return genero;
    }

    public void setGenero(String[] genero) {
        this.genero = genero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

class Calle {
    private Prostitutas prostitutas;

    public Prostitutas getProstitutas() {
        return prostitutas;
    }

    public void setProstitutas(Prostitutas prostitutas) {
        this.prostitutas = prostitutas;
    }
}



