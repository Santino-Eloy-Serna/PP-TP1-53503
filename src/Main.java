public class Main {
    public static void main(String[] args) {

        EventoUniversitario fiesta = new EventoUniversitario("Festival", 10900.0, false);

        fiesta.mostrar();

        EventoUniversitario conferencia = new EventoUniversitario("Concierto", 0.0, true);

        conferencia.mostrar();

    }

}