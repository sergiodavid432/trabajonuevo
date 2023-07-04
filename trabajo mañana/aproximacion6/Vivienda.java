public class Vivienda {
    private final String direccion;
    private String tipo;
    private int numeroHabitaciones;
    private double area;
    private Prostituta[] prostitutas;
    private int numProstitutas;

    public Vivienda(String direccion, String tipo, int numeroHabitaciones, double area) {
        this.direccion = direccion;
        setTipo(tipo);
        setNumeroHabitaciones(numeroHabitaciones);
        setArea(area);
        prostitutas = new Prostituta[50];
        numProstitutas = 0;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        } else {
            this.tipo = "";
        }
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void adicionarBaja(String raza, String genero, int numeroDeProstitutas, double costo, double vueltas, String metodoPago, String calle, String barrio, int direccion) {
        prostitutas[numProstitutas] = new Baja(raza, genero, numeroDeProstitutas, costo, vueltas, metodoPago, calle, barrio, direccion);
        numProstitutas++;
    }

    public void adicionarMedia(String raza, String genero, int numeroDeProstitutas, double costo, double vueltas, String metodoPago, String calle, String barrio, int direccion) {
        prostitutas[numProstitutas] = new Media(raza, genero, numeroDeProstitutas, costo, vueltas, metodoPago, calle, barrio, direccion);
        numProstitutas++;
    }

    public void adicionarAlta(String raza, String genero, int numeroDeProstitutas, double costo, double vueltas, String metodoPago, String calle, String barrio, int direccion) {
        prostitutas[numProstitutas] = new Alta(raza, genero, numeroDeProstitutas, costo, vueltas, metodoPago, calle, barrio, direccion);
        numProstitutas++;
    }

    public Prostituta[] getProstitutas() {
        return prostitutas;
    }

    public int getNumProstitutas() {
        return numProstitutas;
    }

    public String mostrarProstitutas() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numProstitutas; i++) {
            sb.append(prostitutas[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public double calcularTotalPagoProstitutas() {
        double totalCosto = 0.0;
        for (int i = 0; i < numProstitutas; i++) {
            totalCosto += prostitutas[i].getCosto();
        }
        return totalCosto;
    }
}











