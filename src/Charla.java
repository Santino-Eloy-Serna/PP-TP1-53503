public class Charla extends Actividad{
    private String disertante;

    public String getDisertante() {
        return disertante;
    }

    public void setDisertante(String disertante) {
        this.disertante = disertante;
    }

    @Override
    public double calcularCM(){
        //CM = Costo Materiales
        return 0;
    }

    @Override
    public String getTipo(){
        return "Charla";
    }
}
