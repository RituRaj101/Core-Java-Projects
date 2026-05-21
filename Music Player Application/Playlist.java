package music.player.application;

import java.util.ArrayList;

public class Playlist {

    private String playlistName;
    private ArrayList<Song> songs;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        songs = new ArrayList<>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added to playlist.");
    }

    public void removeSong(int songId) {

        boolean found = false;

        for (Song song : songs) {

            if (song.getId() == songId) {
                songs.remove(song);
                found = true;
                System.out.println("Song removed from playlist.");
                break;
            }
        }

        if (!found) {
            System.out.println("Song not found.");
        }
    }

    public void displaySongs() {

        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("\nSongs in Playlist: " + playlistName);

        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
