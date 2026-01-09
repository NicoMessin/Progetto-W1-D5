

import entities.RegistrazioneAudio;
public class Main1 {
    public static void main(String[] args) {
        RegistrazioneAudio audio = new RegistrazioneAudio("Come mai", 4, 8);
        audio.abbassaVolume();
        audio.alzaVolume();
        audio.play();

    }
}
