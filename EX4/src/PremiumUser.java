public class PremiumUser implements User {
    private String username;
    private Playlist playlist;

    public PremiumUser(String username, String playlistName) {
        this.username = username;
        this.playlist = new Playlist(playlistName, this);
    }

    public void listen(Song song) {
        song.playSong();
    }

    public void listen() {
        playlist.shuffle();
        System.out.println("Now playing songs for Premium User " + username + ":");
        for (Song song : playlist.getSongList()) {
            song.playSong();
        }
    }

    public void addToPlaylist(Song song) {
        playlist.addSong(song);
        System.out.println(song.getTitle() + " added to the playlist of Premium User " + username);
    }

    public String getUsername() {
        return username;
    }

    public void removeFromPlaylist(Song song) {
        if (playlist.getSongList().contains(song)) {
            playlist.removeSong(song);
            System.out.println(song.getTitle() + " removed from the playlist of Premium User " + username);
        } else {
            System.out.println(song.getTitle() + " not in the playlist of Premium User " + username);
        }
    }
}