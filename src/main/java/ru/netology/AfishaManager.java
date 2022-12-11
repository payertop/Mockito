package ru.netology;


public class AfishaManager {
    private Movie[] movies = new Movie[0];
    private int currentMoviesLenght = 10;
    public int limit;


    public AfishaManager() {
        this.currentMoviesLenght = currentMoviesLenght;
    }

    {
        limit = 10;
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }


    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastCell = tmp.length - 1;
        tmp[lastCell] = movie;
        movies = tmp;
    }

    public Movie[] showMovies() {
        int resultLenght = currentMoviesLenght;
        if (movies.length < resultLenght) {
            resultLenght = movies.length;
        }
        Movie[] result = new Movie[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            int cell = movies.length - i - 1;
            result[i] = movies[cell];
        }
        return result;

    }

    public Movie[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int length;
        if (movies.length < 10) {
            length = movies.length;
        } else {
            length = 10;
        }
        String[] tmp = new String[length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = String.valueOf(movies[movies.length - 1 - i]);

        }
        return tmp;
    }
}