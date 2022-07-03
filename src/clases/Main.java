package clases;

import herencia.SmartPhone;
import herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartDevice iphone = new SmartPhone();
        SmartDevice watch = new SmartWatch();

        Display displayXiaomi = new Display(6.67, "Gorilla Glass");

        SmartPhone xiaomiPoco = new SmartPhone("Xiaomi", "POCO X4", "Negro",
                165.3, 76.8, 9.4, 215, true, displayXiaomi, true,
                8, true, true);

        Display displayMiband = new Display(1.56, "AMOLED");

        SmartWatch miBand = new SmartWatch("Xiaomi", "MiBand 6", "Negro", 47.4,
                18.6, 12.7, 12.8, true, displayMiband, false, true, false);


        xiaomiPoco.encender();
        xiaomiPoco.subirVolumen(10);
        xiaomiPoco.activarWifi();

        miBand.encender();
        miBand.caminar(100);
        miBand.verPasos();
        miBand.verConexion();
        if(miBand.estadoConexion()){
            miBand.desconectarDispositivo();
        }else{
            miBand.conectarDispositivo();
        }
        miBand.verConexion();

        xiaomiPoco.apagar();
        miBand.apagar();

    }
}
