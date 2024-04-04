import java.util.PriorityQueue;

public class Hospital {
    // Declaramos una PriorityQueue para almacenar los pacientes.
    // PriorityQueue nos permite obtener siempre el paciente con mayor prioridad.
    private PriorityQueue<Paciente> colaPacientes;

    // En el constructor inicializamos la cola de pacientes.
    public Hospital() {
        colaPacientes = new PriorityQueue<>();
    }

    /**
     * Este método agrega un paciente a la cola de pacientes del hospital.
     * @param paciente El paciente a agregar.
     */
    public void agregarPaciente(Paciente paciente) {
        colaPacientes.add(paciente);
    }

    /**
     * Este método retira al paciente con mayor prioridad de la cola de pacientes del hospital.
     * @return El paciente con mayor prioridad, o null si la cola está vacía.
     */
    public Paciente siguientePaciente() {
        return colaPacientes.poll();
    }

    /**
     * Este método retorna la cola de pacientes del hospital.
     * @return La cola de pacientes del hospital.
     */
    public PriorityQueue<Paciente> getColaPacientes() {
        return colaPacientes;
    }
}
