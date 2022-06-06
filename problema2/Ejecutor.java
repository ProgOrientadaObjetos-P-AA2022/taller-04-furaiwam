package problema2;

public class Ejecutor {
    public static void main(String[] args) {


        String nombre = "Clara";
        String apellido = "Ruiz";
        String cedula = "1182405630";
        double sueldo = 600.00;


        Profesores prof = new Profesores();

        prof.establecerSueldoTotal();
        System.out.printf("%s\n", prof);

        Profesores prof2 = new Profesores(nombre, apellido, cedula, sueldo);

        prof2.establecerSueldoTotal();
        System.out.printf("%s\n", prof2);
    }
}
