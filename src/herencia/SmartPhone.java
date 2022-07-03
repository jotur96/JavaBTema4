package herencia;

import clases.Display;
import clases.SmartDevice;

public class SmartPhone extends SmartDevice {


    public boolean entradaAuricular;
    public int memoriaRam; // en GB
    public boolean sdCard;
    public boolean dualSim;

    private int volumen = 0;
    private boolean wifi = false;

    

    public SmartPhone() {
    }

    public SmartPhone(String fabricante, String modelo, String color, double largo, double ancho, double altura,
            int peso, boolean bateria, Display display, boolean entradaAuricular, int memoriaRam,
            boolean sdCard, boolean dualSim) {
        super(fabricante, modelo, color, largo, ancho, altura, peso, bateria, display);
        this.entradaAuricular = entradaAuricular;
        this.memoriaRam = memoriaRam;
        this.sdCard = sdCard;
        this.dualSim = dualSim;
        
    }

    public void subirVolumen(int cantidad) {
        if ((this.volumen + cantidad) <= 10) {
            this.volumen += cantidad;
        } else {
            this.volumen = 10;
        }
        System.out.println("Volumen actual: "+this.volumen);
    }

    public void bajarVolumen(int cantidad) {
        if ((this.volumen - cantidad) >= 0) {
            this.volumen -= cantidad;
        } else {
            this.volumen = 0;
        }
        System.out.println("Volumen actual: "+this.volumen);
    }

    public void activarWifi() {
        this.wifi = true;
    }

    public void desactivarWifi() {
        this.wifi = false;
    }


    @Override
    public String toString() {
        return "SmartPhone [dualSim=" + dualSim + ", entradaAuricular=" + entradaAuricular + ", memoriaRam="
                + memoriaRam + ", sdCard=" + sdCard + ", volumen=" + volumen + ", wifi=" + wifi + "]";
    }

    
}
