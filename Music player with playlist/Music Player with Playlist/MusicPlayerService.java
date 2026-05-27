package music.player;

import java.sql.*;
import java.util.Scanner;

public class MusicPlayerService {

    Scanner sc = new Scanner(System.in);

    // Add Song
    public void addSong() {

        try {

            Connection con =
                    DBConnection.getConnection();

            System.out.print("Enter Song ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Artist: ");
            String artist = sc.nextLine();

            System.out.print("Enter Album: ");
            String album = sc.nextLine();

            System.out.print("Enter Genre: ");
            String genre = sc.nextLine();

            System.out.print("Enter Duration: ");
            double duration = sc.nextDouble();

            String query =
                    "INSERT INTO songs VALUES(?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, artist);
            ps.setString(4, album);
            ps.setString(5, genre);
            ps.setDouble(6, duration);

            ps.executeUpdate();

            System.out.println("Song Added Successfully");

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // View Songs
    public void viewSongs() {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "SELECT * FROM songs";

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(query);

            while (rs.next()) {

                System.out.print(
                        rs.getInt("song_id")
                                + " | "
                                + rs.getString("title")
                                + " | "
                                + rs.getString("artist")
                                + " | "
                                + rs.getString("album")
                                + " | "
                                + rs.getString("genre")
                                + " | "
                                + rs.getDouble("duration")
                );
                System.out.println("\tmin(s)");
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // Create Playlist
    public void createPlaylist() {

        try {

            Connection con =
                    DBConnection.getConnection();

            System.out.print("Enter Playlist ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Playlist Name: ");
            String name = sc.nextLine();

            String query =
                    "INSERT INTO playlists VALUES(?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);

            ps.executeUpdate();

            System.out.println("Playlist Created");

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // Add Song To Playlist
    public void addSongToPlaylist() {

        try {

            Connection con =
                    DBConnection.getConnection();

            System.out.print("Enter Playlist ID: ");
            int playlistId = sc.nextInt();

            System.out.print("Enter Song ID: ");
            int songId = sc.nextInt();

            String query =
                    "INSERT INTO playlist_songs VALUES(?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, playlistId);
            ps.setInt(2, songId);

            ps.executeUpdate();

            System.out.println(
                    "Song Added To Playlist"
            );

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // View Playlist Songs
    public void viewPlaylistSongs() {

        try {

            Connection con =
                    DBConnection.getConnection();

            System.out.print("Enter Playlist ID: ");

            int playlistId = sc.nextInt();

            String query =
                    "SELECT s.song_id, s.title, s.artist " +
                    "FROM songs s " +
                    "JOIN playlist_songs ps " +
                    "ON s.song_id = ps.song_id " +
                    "WHERE ps.playlist_id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, playlistId);

            ResultSet rs =
                    ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("song_id")
                                + " | "
                                + rs.getString("title")
                                + " | "
                                + rs.getString("artist")
                );
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // Remove Song From Playlist
    public void removeSongFromPlaylist() {

        try {

            Connection con =
                    DBConnection.getConnection();

            System.out.print("Enter Playlist ID: ");
            int playlistId = sc.nextInt();

            System.out.print("Enter Song ID: ");
            int songId = sc.nextInt();

            String query =
                    "DELETE FROM playlist_songs " +
                    "WHERE playlist_id=? AND song_id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, playlistId);
            ps.setInt(2, songId);

            ps.executeUpdate();

            System.out.println(
                    "Song Removed From Playlist"
            );

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // Search Songs By Artist
    public void searchByArtist() {

        try {

            Connection con =
                    DBConnection.getConnection();

            sc.nextLine();

            System.out.print("Enter Artist Name: ");

            String artist = sc.nextLine();

            String query =
                    "SELECT * FROM songs WHERE artist=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, artist);

            ResultSet rs =
                    ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getString("title")
                );
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // Music Playback Simulation
    public void playSong() {

        System.out.println("Playing Song...");
    }

    public void pauseSong() {

        System.out.println("Song Paused...");
    }

    public void stopSong() {

        System.out.println("Song Stopped...");
    }

    public void skipSong() {

        System.out.println("Skipping Song...");
    }
}