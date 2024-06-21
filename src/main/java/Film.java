public class Film {
    private int filmId;
    private String filmTitle;
    private String directorName;
    private int yearOfRelease;
    private int lengthOfFilm;
    private String countryOfOrigin;
    private String language;
    private int imdbRating;
    private String imdbSummary;
    private int myRating;

    public Film(int filmId, String filmTitle, String directorName, int yearOfRelease, int lengthOfFilm, String countryOfOrigin, String language, int imdbRating, String imdbSummary, int myRating) {
        this.filmId = filmId;
        this.filmTitle = filmTitle;
        this.directorName = directorName;
        this.yearOfRelease = yearOfRelease;
        this.lengthOfFilm = lengthOfFilm;
        this.countryOfOrigin = countryOfOrigin;
        this.language = language;
        this.imdbRating = imdbRating;
        this.imdbSummary = imdbSummary;
        this.myRating = myRating;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getLengthOfFilm() {
        return lengthOfFilm;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getLanguage() {
        return language;
    }

    public int getImdbRating() {
        return imdbRating;
    }

    public String getImdbSummary() {
        return imdbSummary;
    }

    public int getMyRating() {
        return myRating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", filmTitle='" + filmTitle + '\'' +
                ", directorName='" + directorName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", lengthOfFilm=" + lengthOfFilm +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", language='" + language + '\'' +
                ", imdbRating=" + imdbRating +
                ", imdbSummary='" + imdbSummary + '\'' +
                ", myRating=" + myRating +
                '}';
    }
}