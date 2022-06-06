package problema3;

public class Automotor {
    private String cedula;
    private String marca;
    private int año;
    private double valor;
    private double valorMatricula;

    public Automotor() {
        cedula = "11122532346";
        marca = "Suzuki";
        año = 2015;
        valor = 12000;
    }

    public Automotor(String a, String b, int c, double d) {
        cedula = a;
        marca = b;
        año = c;
        valor = d;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerAño(int c) {
        año = c;
    }

    public void establecerValor(double c) {
        valor = c;
    }

    public void calcularValorMatricula() {
        valorMatricula = ((0.002 * valor) / 100 * (2022 - año));
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAño() {
        return año;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%sCedula del cliente: %s\nMarca: %s\n"
                        + "Año: %d\nValor del vehiculo: %.2f\nValor: "
                        + "%.2f",
                cadena, cedula, marca, año, valor, valorMatricula);
        return cadena;
    }
}
