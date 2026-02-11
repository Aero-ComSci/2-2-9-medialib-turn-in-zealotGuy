public class MediaLibRunner {
  public static void main(String[] args) {
      MediaLib myLib = new MediaLib();
      myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
      myLib.addBook(new Book("1984", "Orwell"));
      myLib.addSong(new Song("In Your Eyes"));

      Book testBook = new Book("Dune", "Herbert");
      testBook.adjustRating(3);
      testBook.adjustRating(2);

      System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);
  }
}
