package problema1.uno.src;

public class ejecutos {
    public static void main(String[] args) {

        String nombre = "Katerin Juanda";

        double materia1 = 10.00;
        double materia2 = 5.00;
        double materia3 = 8.05;

        estudiante est = new estudiante();

        est.calcularPromedio();

        estudiante est2 = new estudiante(nombre, materia1, materia2, materia3);
        est2.calcularPromedio();

        System.out.printf("%s\n", est);
        System.out.println("\n");
        System.out.printf("%s\n", est2);
    }
}
