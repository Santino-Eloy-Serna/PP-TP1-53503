public class Main {
    public static void main(String[] args) {

        EventoUniversitario fiesta1 = new EventoUniversitario("Fiesta", 10900.0, false);

        fiesta1.mostrar();

        EventoUniversitario fiesta2 = new EventoUniversitario(null,fiesta1);

        fiesta2.mostrar();

        EventoUniversitario conferencia1 = new EventoUniversitario("Conferencia", 0.0, true);

        conferencia1.mostrar();

        EventoUniversitario conferencia2 = new EventoUniversitario(null,conferencia1);

        conferencia2.mostrar();

        fiesta1.AS();
        fiesta1.CA();
        fiesta1.CCE();
        fiesta2.AS();
        fiesta2.CA();
        fiesta2.CCE();

        conferencia1.AS();
        conferencia1.CA();
        conferencia1.CCE();
        conferencia2.AS();
        conferencia2.CA();
        conferencia2.CCE();

        fiesta1.mostrar();
        fiesta2.mostrar();
        conferencia1.mostrar();
        conferencia2.mostrar();

    }

}

// CCE = Calculo de Costo Estimado
//AS = Asignar Sala
//CA = Crear Actividad