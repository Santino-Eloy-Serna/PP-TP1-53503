public class EventoUniversitario {
    private final String Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    static int num;

    public EventoUniversitario(String titulo, double costoBase, boolean gratuito) {
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
        num++;
        this.Id = "Ev-#"+1000+num;
    }

    public String getId() {
        return Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }

    public static void setCantidadEventos(int cantidadEventos) {
        EventoUniversitario.cantidadEventos = cantidadEventos;
    }

    public void mostrar(){
        System.out.println("El evento "+titulo+" con costo "+costoBase+" con id "+Id+" y con la cantidad de eventos de "+cantidadEventos);
        System.out.println("Actualmente el evento es gratuito? -"+gratuito);
    }

}
