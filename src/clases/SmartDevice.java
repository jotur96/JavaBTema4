package clases;

public abstract class SmartDevice {

    protected String fabricante;
    protected String modelo;
    protected String color;

    public double largo; // en mm Milimetros
    public double ancho;
    public double altura;
    public double peso;

    protected boolean bateria;

    private boolean encendido = false;

    Display display;

    public SmartDevice() {
    }


    public SmartDevice(String fabricante, String modelo, String color, double largo, double ancho, double altura,
            double peso, boolean bateria, Display display) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
        this.peso = peso;
        this.bateria = bateria;
        this.display = display;
    }



    public void encender() {
        this.encendido = true;
        System.out.println("Dispositivo encendido");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("Dispositivo apagado");
    }

    @Override
    public String toString() {
        return "SmartDevice [bateria=" + bateria + ", color=" + color
                + ", display=" + display + ", encendido=" + encendido + ", fabricante=" + fabricante + ", modelo="
                + modelo + "]";
    }    

}
