public class EventoUniversitario {
    private final String Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;

    static{
        cantidadEventos = 0;
    }

    public EventoUniversitario(String titulo, double costoBase, boolean gratuito) {
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
        this.Id = "EVT-"+cantidadEventos;
    }

    public EventoUniversitario(String Id, EventoUniversitario otro) {
        this.Id = otro.Id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        cantidadEventos++;
    }

    /*La funcion del segundo constructor es para "copiar" un objeto ya existente.
    * Un explicacion resumida seria: Que este nuevo contructor toma todo un objeto ya creado
    * como el onjeto Fiesta o conferencia, y lo copia de forma excata, creando un objeto identico
    * DEBO PROFUNDIZAR MAS EN ESTA "TECNICA"*/

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

    public double CCE(){
        System.out.print("El costo estimado es de: ");
        return costoBase;
    }
    // CCE = Calculo de Costo Estimado

    public void AS(){
        System.out.println("Se asigna a este evento la sala: "+Id);
    }
    //AS = Asignar Sala

    public void mostrar(){
        System.out.println("El evento "+titulo+" con costo "+costoBase+" con id "+Id+" y con la cantidad de eventos de "+cantidadEventos);
        System.out.println("Actualmente el evento es gratuito? -"+gratuito);
    }

    public int getcantidadEventos() {
        return cantidadEventos;
    }
}
