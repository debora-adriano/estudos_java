public class Estufa {
    public String local;
    public double temperatura;

    public Estufa() {
    }

    public Estufa(String local, double temperatura) {
        this.local = local;
        this.temperatura = temperatura;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void localSensor(){
        System.out.printf("Sensor no local: %s%nTemperatura: %.1f ºC%n", this.local, this.temperatura);

        if (this.temperatura >= 37.5){
            System.out.println("Alerta: Temperatura acima do limite!");
        } else System.out.println("Temperatura dentro do limite.");
    }
}
