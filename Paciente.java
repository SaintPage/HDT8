public class Paciente implements Comparable<Paciente> {
    // Declaramos las variables de instancia para el nombre, síntoma y código de emergencia del paciente.
    private String nombre;
    private String sintoma;
    private char codigoEmergencia;

    // En el constructor inicializamos las variables de instancia con los valores proporcionados.
    public Paciente(String nombre, String sintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
    }

    // Los métodos getter y setter nos permiten obtener y establecer los valores de las variables de instancia.

    // El método compareTo nos permite comparar este paciente con otro en términos de su código de emergencia.
    // Esto es necesario para que la PriorityQueue sepa en qué orden atender a los pacientes.
    @Override
    public int compareTo(Paciente otroPaciente) {
        return Character.compare(this.codigoEmergencia, otroPaciente.codigoEmergencia);
    }

    // El método toString nos permite obtener una representación en cadena de este paciente.
    // Esto es útil para imprimir información sobre el paciente.
    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + codigoEmergencia;
    }
}
