package entities;

public class RiproduzioneVideo extends Titolo implements RiproduzioneComune {
     private int durata;
        private int volume;
        private int luminosita;

        public RiproduzioneVideo(String titolo, int durata, int volume, int luminosita){
            super(titolo);
            this.durata=durata;
            this.volume=volume;
            this.luminosita=luminosita;
        }

    public void alzaVolume() {
       if (volume<10) {volume++;}
    }

    public void abbassaVolume() {
        if (volume > 0) {
            {volume--;}
        }
    }

    public void alzaLuminosita() {
        if (luminosita<10){luminosita++;}
    }

    public void abbassaLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {

            System.out.println(getTitolo() + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }
}
