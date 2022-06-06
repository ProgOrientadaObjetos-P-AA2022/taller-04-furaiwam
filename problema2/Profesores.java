package problema2;

public class Profesores {
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldo;
    private double sueldoTotal;

    public Profesores() {
        nombre = "Armando";
        apellido = "Villa";
        sueldo = 912;
        cedula = "1100378413";
    }

    public Profesores(String a, String b, String c, double d) {
        nombre = a;
        apellido = b;
        cedula = c;
        sueldo = d;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerSueldo(double c) {
        sueldo = c;
    }

    public void establecerSueldoTotal() {
        sueldoTotal = sueldo + (sueldo * 0.20);
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("\n%s%s %s\nSueldo: %.2f\nSueldo total: "
                + "%.2f",cadena, nombre, apellido, sueldo, sueldoTotal);
        return cadena;
    }
}
