package music.player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MusicPlayerService service =
                new MusicPlayerService();

        int choice;

        do {

            System.out.println(
                    "\n===== MUSIC PLAYER ====="
            );

            System.out.println("1. Add Song");
            System.out.println("2. View Songs");
            System.out.println("3. Create Playlist");
            System.out.println("4. Add Song To Playlist");
            System.out.println("5. View Playlist Songs");
            System.out.println("6. Remove Song From Playlist");
            System.out.println("7. Search By Artist");
            System.out.println("8. Play Song");
            System.out.println("9. Pause Song");
            System.out.println("10. Stop Song");
            System.out.println("11. Skip Song");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.addSong();
                    break;

                case 2:
                    service.viewSongs();
                    break;

                case 3:
                    service.createPlaylist();
                    break;

                case 4:
                    service.addSongToPlaylist();
                    break;

                case 5:
                    service.viewPlaylistSongs();
                    break;

                case 6:
                    service.removeSongFromPlaylist();
                    break;

                case 7:
                    service.searchByArtist();
                    break;

                case 8:
                    service.playSong();
                    break;

                case 9:
                    service.pauseSong();
                    break;

                case 10:
                    service.stopSong();
                    break;

                case 11:
                    service.skipSong();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
