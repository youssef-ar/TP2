public class Song {
    private int songLength;
    private String genre;
    private String title;
    private int playCount;
    private Artist artist;
    private Album album;
    private String releaseDate;

    public Song(int songLength, String title, String genre, int playCount, Artist artist, Album album, String releaseDate) {
        this.songLength = songLength;
        this.title = title;
        this.genre = genre;
        this.playCount = playCount;
        this.artist = artist;
        this.album = album;
        this.releaseDate = releaseDate;
    }

    public void playSong() {
        System.out.println("Now playing: " + title + " - " + artist.getName());
        playCount++;
    }

    public int getSongLength() {
        return songLength;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtistName() {
        return artist.getName();
    }

    public String getAlbumName() {
        return album.getTitle();
    }

    public int getPlayCount() {
        return playCount;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}