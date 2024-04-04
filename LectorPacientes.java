import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorPacientes {
    /**
     * Este método carga los pacientes desde un archivo de texto y los agrega al hospital.
     * @param hospital El hospital al que se agregarán los pacientes.
     * @param rutaArchivo La ruta al archivo de texto que contiene los datos de los pacientes.
     */
    public static void cargarPacientes(Hospital hospital, String rutaArchivo) {
        // Usamos un try-with-resources para asegurarnos de que el BufferedReader se cierre automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            // Leemos cada línea del archivo hasta que no queden más
            while ((linea = br.readLine()) != null) {
                // Dividimos la línea en partes usando la coma como separador
                String[] partes = linea.split(",");
                
                // Extraemos los datos del paciente de las partes
                String nombre = partes[0].trim();
                String sintoma = partes[1].trim();
                char codigoEmergencia = partes[2].trim().charAt(0);
                
                // Creamos un nuevo objeto Paciente con los datos extraídos
                Paciente paciente = new Paciente(nombre, sintoma, codigoEmergencia);
                
                // Agregamos el paciente al hospital
                hospital.agregarPaciente(paciente);
            }
        } catch (IOException e) {
            // Si ocurre un error al leer el archivo, imprimimos la traza de la pila de la excepción
            e.printStackTrace();
        }
    }
}
