public class MediaLib
{
  public static String owner = "PLTW";
  private static int entries;
  private static int books;
  private static int movies;
  private static int songs;
  private String lastModified;
  private Book book;
  private Movie movie;
  private Song song;

  public MediaLib() {
    lastModified = LastModified.getDateTime();
  }
  
  public void addBook(Book b) {
    if (book == null) {
      book = b;
      entries++;
      books++;
      lastModified = LastModified.getDateTime();
    } 
    else {
      System.out.println("Cannot add a new book: A book already exists");
    }
  }
  
  public void addMovie(Movie m) {
    if (movie == null) {
      movie = m;
      entries++;
      movies++;
      lastModified = LastModified.getDateTime();
    }
    else {
      System.out.println("Cannot add a new movie: A movie already exists");
    }
  }
  
  public void addSong(Song s) {
    if (song == null) {
      song = s;
      entries++;
      songs++;
      lastModified = LastModified.getDateTime();
    }
    else {
      System.out.println("Cannot add a new song: A song already exists");
    }
  }

  public static String getOwner() {
    return owner;
  }

  public static void changeOwner(String o) {
    owner = o;
  }
  
  public static int getEntries() {
    return entries;
  }
  
  public static int getBooks() {
    return books;
  }
  
  public static int getMovies() {
    return movies;
  }
  
  public static int getSongs() {
    return songs;
  }
  
  public String toString() {
    String info = "";
    
    if (book != null) {
      info += "Book: " + book + "\n";
    }
    if (movie != null) {
      info += "Movie: " + movie + "\n";
    }    
    if (song != null) {
      info += "Song: " + song + "\n";
    }
    info += "Last Modified: " + lastModified + "\n";

    return info;
  }
}
