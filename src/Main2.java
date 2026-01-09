import entities.RiproduzioneVideo;
public class Main2 {
    public static void main(String[] args) {
        RiproduzioneVideo video = new RiproduzioneVideo("Video gatti",3,4,5);

        video.alzaVolume();
        video.abbassaVolume();
        video.alzaLuminosita();
        video.abbassaLuminosita();
        video.play();
    }
}
