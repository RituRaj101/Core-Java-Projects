package music.player;

public class Playlist {

    private int playlistId;
    private String playlistName;

    public Playlist(int playlistId,
                    String playlistName) {

        this.playlistId = playlistId;
        this.playlistName = playlistName;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public String getPlaylistName() {
        return playlistName;
    }
}
