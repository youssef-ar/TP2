import java.util.List;
import java.util.ArrayList;

public class Artist {
    private List<Album> discography = new ArrayList<>();
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAlbum(Album album) {
        discography.add(album);
    }

    public void removeAlbum(Album album) {
        if (!discography.contains(album)) {
            System.out.println("Album '" + album.getTitle() + "' is not in " + name + "'s discography");
        } else {
            discography.remove(album);
            System.out.println("Album '" + album.getTitle() + "' removed from " + name + "'s discography");
        }
    }

    public void listAlbums() {
        System.out.println(name + "'s Discography: ");
        for (Album album : discography) {
            System.out.println(" - " + album.getTitle());
        }
    }
}