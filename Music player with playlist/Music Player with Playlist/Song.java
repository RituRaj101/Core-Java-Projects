package music.player;

public class Song {

    private int songId;
    private String title;
    private String artist;
    private String album;
    private String genre;
    private double duration;

    public Song(int songId,
                String title,
                String artist,
                String album,
                String genre,
                double duration) {

        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.duration = duration;
    }

    public int getSongId() {
        return songId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public double getDuration() {
        return duration;
    }
}
