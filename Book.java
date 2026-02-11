public class Book
{
  private String title;
  private String author;
  private int rating;

  public Book(String t, String auth) {
    title = t;
    author = auth;
    rating = 0;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getRating() {
    return rating;
  }

  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String auth) {
    author = auth;
  }

  public void adjustRating(int amt)
  {
    System.out.println("Adjusting rating by " + amt);
    int newRating = rating + amt;

    if (newRating >= 0 && newRating <= 10)
      rating = newRating;

    amt = 0;
  }

  public boolean equals(Book b) {
    return this.title.equals(b.title) &&
           this.author.equals(b.author);
  }

  public String toString()
  {
    String info = "\"" + title + "\", written by " + author;

    if (rating != 0)
      info += ", rating is " + rating;

    return info;
  }
}
