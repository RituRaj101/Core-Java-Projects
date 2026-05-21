package music.player.application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MusicPlayer player = new MusicPlayer();

        // Sample Songs
        player.addSongToLibrary(new Song(1, "Shape of You", "Ed Sheeran", "Divide", 4.2));
        player.addSongToLibrary(new Song(2, "Believer", "Imagine Dragons", "Evolve", 3.5));
        player.addSongToLibrary(new Song(3, "Perfect", "Ed Sheeran", "Divide", 4.5));

        int choice;

        do {

            System.out.println("\n===== MUSIC PLAYER =====");

            System.out.println("1. View Music Library");
            System.out.println("2. Play Song");
            System.out.println("3. Pause Song");
            System.out.println("4. Stop Song");
            System.out.println("5. Set Volume");
            System.out.println("6. Create Playlist");
            System.out.println("7. Add Song to Playlist");
            System.out.println("8. View Playlists");
            System.out.println("9. View Playlist Songs");
            System.out.println("10. Search Song");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    player.displayLibrary();
                    break;

                case 2:
                    System.out.print("Enter Song ID: ");
                    int playId = sc.nextInt();
                    player.playSong(playId);
                    break;

                case 3:
                    player.pauseSong();
                    break;

                case 4:
                    player.stopSong();
                    break;

                case 5:
                    System.out.print("Enter Volume (0-100): ");
                    int volume = sc.nextInt();
                    player.setVolume(volume);
                    break;

                case 6:
                    sc.nextLine();

                    System.out.print("Enter Playlist Name: ");
                    String playlistName = sc.nextLine();

                    player.createPlaylist(playlistName);
                    break;

                case 7:
                    sc.nextLine();

                    System.out.print("Enter Playlist Name: ");
                    String pName = sc.nextLine();

                    System.out.print("Enter Song ID: ");
                    int songId = sc.nextInt();

                    player.addSongToPlaylist(pName, songId);
                    break;

                case 8:
                    player.viewPlaylists();
                    break;

                case 9:
                    sc.nextLine();

                    System.out.print("Enter Playlist Name: ");
                    String viewPlaylist = sc.nextLine();

                    player.displayPlaylistSongs(viewPlaylist);
                    break;

                case 10:
                    sc.nextLine();

                    System.out.print("Enter Song Title/Artist: ");
                    String keyword = sc.nextLine();

                    player.searchSong(keyword);
                    break;

                case 0:
                    System.out.println("Exiting Music Player...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
