package herencia;

import clases.Display;
import clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    public boolean simCard;

    public boolean ip68; // proteccion anti agua y polvo

    public boolean manosLibres;

    private boolean estadoConexion = false;
    private int pasos = 0;

    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String modelo, String color, double largo, double ancho, double altura,
            double peso, boolean bateria, Display display, boolean simCard, boolean ip68, boolean manosLibres) {
        super(fabricante, modelo, color, largo, ancho, altura, peso, bateria, display);
        this.simCard = simCard;
        this.ip68 = ip68;
        this.manosLibres = manosLibres;
    }

    public void caminar(int pasos) {
        this.pasos += pasos;
    }

    public int verPasos() {
        return this.pasos;
    }

    public void conectarDispositivo() {
        this.estadoConexion = true;
        System.out.println("Conectando...");
    }

    public void desconectarDispositivo() {
        this.estadoConexion = false;
        System.out.println("Desconectando...");
    }

    public void verConexion(){
        if(estadoConexion){
            System.out.println("Conectado.");
        }
        System.out.println("Desconectado.");
    }

    public boolean estadoConexion(){
        return estadoConexion;
    }

    @Override
    public String toString() {
        return "SmartWatch [estadoConexion=" + estadoConexion + ", ip68=" + ip68 + ", manosLibres=" + manosLibres
                + ", pasos=" + pasos + ", simCard=" + simCard + "]";
    }

}
