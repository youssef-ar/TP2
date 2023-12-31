
import java.util.ArrayList;

public class Album {
    private String title;
    private Artist artist;
    private String albumReleaseDate;
    private ArrayList<Song> songList;

    public Album(String title, Artist artist, String releaseDate) {
        this.title = title;
        this.artist = artist;
        this.albumReleaseDate = releaseDate;
        this.songList = new ArrayList<>();
    }
    public String getTitle(){
        return title;
    }

    public void addSong(Song song) {
        songList.add(song);
    }

    public void listDisplay() {
        System.out.println("Artist: " + artist.getName());
        System.out.println("Album Title: " + title);
        System.out.println("Release Date: " + albumReleaseDate);
        System.out.println("Tracklist:");
        for (Song song : songList) {
            System.out.println(song.getTitle());
        }
    }
}