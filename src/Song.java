public class Song {
    String title; // variables needed for song
    String artist;
    double length;

    public Song(String title, String artist, double length) { // constructor
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public String getTitle() { // Getters
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getLength() {
        return length;
    }

    public void setTitle(String title) { //Setters
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() { // Makes the Song a string
        return "songName: " + title + ", artist: " + artist + ", length: " + length;
    }

}
