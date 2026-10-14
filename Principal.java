public class Principal {
    public static void main(String[] args) {
        
        // 1. Instanciar el primer objeto de tipo Estudiante
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Leyber";
        estudiante1.apellido = "Peñafiel";
        estudiante1.edad = 20; 
        estudiante1.carrera = "Ingeniería de Software";
        estudiante1.semestre = 3;

        // 2. Instanciar el segundo objeto de tipo Estudiante
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Joseph";
        estudiante2.apellido = "Castro";
        estudiante2.edad = 19;
        estudiante2.carrera = "Ingeniería de Software";
        estudiante2.semestre = 3;

        // 3. Instanciar el tercer objeto de tipo Estudiante
        Estudiante estudiante3 = new Estudiante();
        estudiante3.nombre = "Matias";
        estudiante3.apellido = "Pico";
        estudiante3.edad = 21;
        estudiante3.carrera = "Ingeniería de Software";
        estudiante3.semestre = 3;

        // 4. Imprimir la información usando System.out.println
        System.out.println("=== Registro de Estudiantes UTA ===");
        
        System.out.println("\nEstudiante 1:");
        System.out.println("Nombre: " + estudiante1.nombre + " " + estudiante1.apellido);
        System.out.println("Edad: " + estudiante1.edad);
        System.out.println("Carrera: " + estudiante1.carrera);
        System.out.println("Semestre: " + estudiante1.semestre);

        System.out.println("\nEstudiante 2:");
        System.out.println("Nombre: " + estudiante2.nombre + " " + estudiante2.apellido);
        System.out.println("Edad: " + estudiante2.edad);
        System.out.println("Carrera: " + estudiante2.carrera);
        System.out.println("Semestre: " + estudiante2.semestre);

        System.out.println("\nEstudiante 3:");
        System.out.println("Nombre: " + estudiante3.nombre + " " + estudiante3.apellido);
        System.out.println("Edad: " + estudiante3.edad);
        System.out.println("Carrera: " + estudiante3.carrera);
        System.out.println("Semestre: " + estudiante3.semestre);
    }
}