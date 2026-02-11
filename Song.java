public class Song {

    private String title;
    private int rating;

    public Song(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public Song(String title) {
        this.title = title;
        this.rating = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public boolean equals(Song other) {
        if (other == null) {
            return false;
        }
        return title.equals(other.title) && rating == other.rating;
    }

    public String toString() {
        return "Song: " + title + ", Rating: " + rating;
    }
}
