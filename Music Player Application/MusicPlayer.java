package music.player.application;

import java.util.ArrayList;
import java.util.HashMap;

public class MusicPlayer {

    private ArrayList<Song> library;
    private HashMap<String, Playlist> playlists;

    private int volume = 50;

    public MusicPlayer() {
        library = new ArrayList<>();
        playlists = new HashMap<>();
    }

    // Add Song to Library
    public void addSongToLibrary(Song song) {
        library.add(song);
        System.out.println("Song added to library.");
    }

    // Display Library
    public void displayLibrary() {

        if (library.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("\nMusic Library:");

        for (Song song : library) {
            System.out.println(song);
        }
    }

    // Play Song
    public void playSong(int songId) {

        for (Song song : library) {

            if (song.getId() == songId) {
                System.out.println("Now Playing: " + song.getTitle());
                return;
            }
        }

        System.out.println("Song not found.");
    }

    // Pause Song
    public void pauseSong() {
        System.out.println("Music Paused.");
    }

    // Stop Song
    public void stopSong() {
        System.out.println("Music Stopped.");
    }

    // Volume Control
    public void setVolume(int volume) {

        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to: " + volume);
        } else {
            System.out.println("Invalid volume level.");
        }
    }

    // Create Playlist
    public void createPlaylist(String name) {

        if (playlists.containsKey(name)) {
            System.out.println("Playlist already exists.");
        } else {
            playlists.put(name, new Playlist(name));
            System.out.println("Playlist created successfully.");
        }
    }

    // Add Song to Playlist
    public void addSongToPlaylist(String playlistName, int songId) {

        Playlist playlist = playlists.get(playlistName);

        if (playlist == null) {
            System.out.println("Playlist not found.");
            return;
        }

        for (Song song : library) {

            if (song.getId() == songId) {
                playlist.addSong(song);
                return;
            }
        }

        System.out.println("Song not found in library.");
    }

    // View Playlists
    public void viewPlaylists() {

        if (playlists.isEmpty()) {
            System.out.println("No playlists available.");
            return;
        }

        System.out.println("\nAvailable Playlists:");

        for (String name : playlists.keySet()) {
            System.out.println("- " + name);
        }
    }

    // Display Playlist Songs
    public void displayPlaylistSongs(String playlistName) {

        Playlist playlist = playlists.get(playlistName);

        if (playlist != null) {
            playlist.displaySongs();
        } else {
            System.out.println("Playlist not found.");
        }
    }

    // Search Song
    public void searchSong(String keyword) {

        boolean found = false;

        for (Song song : library) {

            if (song.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || song.getArtist().toLowerCase().contains(keyword.toLowerCase())) {

                System.out.println(song);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching songs found.");
        }
    }
}
