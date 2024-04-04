import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        LectorPacientes.cargarPacientes(hospital, "pacientes.txt");

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nBienvenido al sistema de atención de pacientes del hospital de UVG. Por favor, elige una opción:");
            System.out.println("1. Ver todos los pacientes en orden de prioridad");
            System.out.println("2. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    Paciente paciente;
                    while ((paciente = hospital.siguientePaciente()) != null) {
                        System.out.println("Atendiendo a: " + paciente);
                    }
                    break;
                case "2":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }

        scanner.close();
        System.out.println("Gracias por usar el sistema de atención de pacientes, hostial UVG.");
    }
}
