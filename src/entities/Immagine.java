package entities;

public class Immagine extends Titolo{
   private int luminosita;
         public  Immagine(String titolo, int luminosita){
            super(titolo);
            this.luminosita=luminosita;
         }
    public void alzaLuminosita() {
        if (luminosita<10){luminosita++;}
    }

    public void abbassaLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    public void show(){
        System.out.println(getTitolo()+ "*".repeat(luminosita));
    }


}
