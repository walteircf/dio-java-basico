package edu.walteir.tema.metodos.praticando;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("TV Ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV Desligada");
    }

    public void aumentarVolume() {
        if (volume == 100){
            System.out.println("Volume Máximo!!");
        }
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        if (volume == 0) {
            System.out.println("Mudo!!");
        }
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void diminuirCanal() {
        if (canal == 1) {
            System.out.println("Não há mais canais");
        }
        canal--;
        System.out.println("Canal: " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }
}
