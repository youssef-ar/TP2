public class FreeUser implements User {
    private String username;
    private Playlist playlist;

    public FreeUser(String username, String playlistName) {
        this.username = username;
        this.playlist = new Playlist(playlistName, this);
    }

    public void listen() {
        playlist.shuffle();
        System.out.println("Now playing songs for Free User " + username + ":");
        for (Song song : playlist.getSongList()) {
            song.playSong();
        }
    }

    public void addToPlaylist(Song song) {
        if (playlist.getSongList().size() < 100) {
            playlist.addSong(song);
            System.out.println(song.getTitle() + " added to the playlist of Free User " + username);
        } else {
            System.out.println("Playlist is full. Upgrade to Premium to add unlimited songs.");
        }
    }

    public String getUsername() {
        return username;
    }

    public void removeFromPlaylist(Song song) {
        if (playlist.getSongList().contains(song)) {
            playlist.removeSong(song);
            System.out.println(song.getTitle() + " removed from the playlist of Free User " + username);
        } else {
            System.out.println(song.getTitle() + " not in the playlist of Free User " + username);
        }
    }
}
