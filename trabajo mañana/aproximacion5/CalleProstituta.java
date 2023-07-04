public class CalleProstituta {
    private final String nit;
    private String direccion;
    private ClaseBaja[] prostituta1;
    private ClaseMedia[] prostituta2;
    private ClaseAlta[] prostituta3;
    private int numProstituta1;
    private int numProstituta2;
    private int numProstituta3;
    
    public CalleProstituta(String nit, String direccion) {
        if (nit != null) {
            this.nit = nit;
        } else {
            this.nit = "";
        }
        this.direccion = direccion;
        prostituta1 = new ClaseBaja[50];
        prostituta2 = new ClaseMedia[50];
        prostituta3 = new ClaseAlta[50];
        
        numProstituta1 = 0;
        numProstituta2 = 0;
        numProstituta3 = 0;
    }
    
    public String getNit() {
        return nit;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public boolean estaLlena() {
        return (numProstituta1 + numProstituta2 + numProstituta3) >= 150; // Cambiar el valor según el límite deseado
    }
    
    public int getNumeroTotalProstitutas() {
        return numProstituta1 + numProstituta2 + numProstituta3;
    }
    
    
}



   
    
    