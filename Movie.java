public class Movie
{
    private String title;
    private double duration;
    private int rating;

    public Movie(String t, double d)
    {
        title = t;
        duration = d;
        rating = 0;
    }

    public String getTitle()
    {
        return title;
    }

    public double getDuration()
    {
        return duration;
    }

    public int getRating()
    {
        return rating;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public void adjustRating(int amount)
    {
        int newRating = rating + amount;

        if (newRating >= 0 && newRating <= 10)
        {
            rating = newRating;
        }
    }

    public boolean equals(Movie m)
    {
        return this.title.equals(m.title) &&
               this.duration == m.duration;
    }

    public String toString()
    {
        String info = "\"" + title + "\", duration " + duration + " hrs";

        if (rating != 0)
        {
            info += ", rating is " + rating;
        }

        return info;
    }
}
