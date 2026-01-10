import entities.*;


import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Titolo[] elementi = new Titolo[5];


        for (int i = 0; i < 5; i++) {

            System.out.println("Elemento " + (i+1 ));
            System.out.print("Scegli tipologia (1=Audio, 2=Video, 3=Immagine): ");
            int tipologia = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Titolo: ");
            String titolo = scanner.nextLine();

            if (tipologia == 1) {
                System.out.print("Durata: ");
                int durata = scanner.nextInt();
                System.out.print("Volume: ");
                int volume = scanner.nextInt();
                elementi[i] = new RegistrazioneAudio(titolo, durata, volume);

            } else if (tipologia == 2) {
                System.out.print("Durata: ");
                int durata = scanner.nextInt();
                System.out.print("Volume: ");
                int volume = scanner.nextInt();
                System.out.print("Luminosità: ");
                int luminosita = scanner.nextInt();
                elementi[i] = new RiproduzioneVideo(titolo, durata, volume, luminosita);

            } else if (tipologia == 3) {
                System.out.print("Luminosità: ");
                int luminosita = scanner.nextInt();
                elementi[i] = new Immagine(titolo, luminosita);
            }
        }



        System.out.print("Quale elemento vuoi eseguire? (1-5, 0 per uscire): ");
        int scelta = scanner.nextInt();

        if (scelta == 1) {
            Titolo elemento = elementi[0];

            if (elemento instanceof Immagine) {
                ((Immagine) elemento).show();
            } else {
                ((RiproduzioneComune) elemento).play();
            }

        } else if (scelta == 2) {
            Titolo elemento = elementi[1];

            if (elemento instanceof Immagine) {
                ((Immagine) elemento).show();
            } else {
                ((RiproduzioneComune) elemento).play();
            }

        } else if (scelta == 3) {
            Titolo elemento = elementi[2];

            if (elemento instanceof Immagine) {
                ((Immagine) elemento).show();
            } else {
                ((RiproduzioneComune) elemento).play();
            }

        } else if (scelta == 4) {
            Titolo elemento = elementi[3];

            if (elemento instanceof Immagine) {
                ((Immagine) elemento).show();
            } else {
                ((RiproduzioneComune) elemento).play();
            }

        } else if (scelta == 5) {
            Titolo elemento = elementi[4];

            if (elemento instanceof Immagine) {
                ((Immagine) elemento).show();
            } else {
                ((RiproduzioneComune) elemento).play();
            }

        } else if (scelta == 0) {
            System.out.println("Uscita dal programma");
        }


        scanner.close();
    }
}
