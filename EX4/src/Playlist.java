import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private String title;
    private User user;
    private ArrayList<Song> songList;

    public Playlist(String title, User user) {
        this.title = title;
        this.user = user;
        this.songList = new ArrayList<>();
    }
    public  ArrayList<Song> getSongList(){
        return songList;
    }
    public void listDisplay() {
        System.out.println(title + " - " + user.getUsername() + " Tracklist: ");
        for (Song song : songList) {
            System.out.println(song.getTitle());
        }
    }

    public void shuffle() {
        Collections.shuffle(songList);
    }

    public void addSong(Song song) {
        songList.add(song);
        System.out.println(song.getTitle() + " added to the playlist of User " + user.getUsername());
    }

    public void removeSong(Song song) {
        if (songList.contains(song)) {
            songList.remove(song);
            System.out.println(song.getTitle() + " removed from the playlist of User " + user.getUsername());
        } else {
            System.out.println(song.getTitle() + " not in the playlist of User " + user.getUsername());
        }
    }
}