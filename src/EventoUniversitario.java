public class EventoUniversitario {
    private final String Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    private static int contador;

    static{
        cantidadEventos = 0;
        contador = 0;
    }

    public EventoUniversitario(String titulo, double costoBase, boolean gratuito) {
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
        this.Id = "EVT-"+cantidadEventos;
    }

    public EventoUniversitario(String Id, EventoUniversitario otro) {
        this.Id = otro.Id+"-CLON";
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
    }

    /*La funcion del segundo constructor es para "copiar" un objeto ya existente.
    * Un explicacion resumida seria: Que este nuevo contructor toma todo un objeto ya creado
    * como el objeto Fiesta o conferencia, y lo copia de forma excata, creando un objeto identico
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
        System.out.print("El costo estimado del evento "+titulo+" es de: ");
        return costoBase;
    }
    // CCE = Calculo de Costo Estimado

    public void AS(){
        System.out.println("Se asigna al evento "+titulo+" la sala: "+Id);
    }
    //AS = Asignar Sala

    public void CA(){
        System.out.println("La actividad del evento "+titulo+" fue creada");
        contador ++;
    }
    //CA = Crear Actividad

    public void mostrar(){
        System.out.println("El evento "+titulo+" con costo "+costoBase+" con id "+Id+" y con la cantidad de eventos de "+cantidadEventos);
        System.out.println("Actualmente el evento es gratuito? -"+gratuito);
        System.out.println("Actualmente el evento "+titulo+" cuenta con "+contador+" actividades");
    }
}