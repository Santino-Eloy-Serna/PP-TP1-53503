public class Main {
    public static void main(String[] args) {

        //Creo eventos universitarios y sus "copias"
        EventoUniversitario fiesta1 = new EventoUniversitario("Fiesta", 10900.0, false);
        EventoUniversitario fiesta2 = new EventoUniversitario(null,fiesta1);
        EventoUniversitario conferencia1 = new EventoUniversitario("Conferencia", 0.0, true);
        EventoUniversitario conferencia2 = new EventoUniversitario(null,conferencia1);

        //Creo Estudiantes
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setLegajo("0001");
        estudiante1.setNombre("Judas");
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setLegajo("0002");
        estudiante2.setNombre("Jesus");
        Estudiante estudiante3 = new Estudiante();
        estudiante3.setLegajo("0003");
        estudiante3.setNombre("Pedro");
        Estudiante estudiante4 = new Estudiante();
        estudiante4.setLegajo("0004");
        estudiante4.setNombre("Tomas");

        //Creo Salas
        Sala sala1 = new Sala();
        sala1.setId(1);
        sala1.setNombre("Laboratorio Fisica");
        Sala sala2 = new Sala();
        sala2.setId(2);
        sala2.setNombre("Laboratorio Quimica");

        //Creo Actividad
        Actividad actividad1 = new Actividad();
        actividad1.setId(10001); //Debido a mi gusto del uso de ceros, dejaré esta actividad asi
        actividad1.setCupoMax(50);
        actividad1.setTitulo("Cumpleaños"); //No soy tan creativo
        Actividad actividad2 = new Actividad();
        actividad2.setId(20001);
        actividad2.setCupoMax(35);
        actividad2.setTitulo("Seguridad e Higiene");

        //Ahora inscribo Estudiantes a mi actividad
        actividad1.inscribir(estudiante1);
        actividad1.inscribir(estudiante2);
        actividad2.inscribir(estudiante3);
        actividad2.inscribir(estudiante4);

        //Muestro datos general, para mayor "orden" a la hora de ver el resultado
        //agrego saltos de linea en medio de cada mostrar
        actividad1.mostrarInscripciones();
        actividad2.mostrarInscripciones();

        fiesta1.AS(sala1);
        fiesta1.CA(actividad1);
        System.out.println(fiesta1.CCE());
        System.out.println();
        fiesta2.AS(sala1);
        fiesta2.CA(actividad1);
        System.out.println(fiesta2.CCE());
        System.out.println();

        conferencia1.AS(sala2);
        conferencia1.CA(actividad2);
        System.out.println(conferencia1.CCE());
        System.out.println();
        conferencia2.AS(sala2);
        conferencia2.CA(actividad2);
        System.out.println(conferencia2.CCE());
        System.out.println();

        fiesta1.mostrar();
        System.out.println();
        fiesta2.mostrar();
        System.out.println();
        conferencia1.mostrar();
        System.out.println();
        conferencia2.mostrar();
        System.out.println();
        System.out.println("La cantidad de eventos son: "+EventoUniversitario.getCantidadEventos());

    }

}

// CCE = Calculo de Costo Estimado
//AS = Asignar Sala
//CA = Crear Actividad
//Comentario de Prueba