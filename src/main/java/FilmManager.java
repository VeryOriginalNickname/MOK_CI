public class FilmManager {

    private String[] films = {};

    public String[] getFilms() {
        return films;
    }

    private int limit;


    public FilmManager() {
        limit = 5;
    }

    public FilmManager(int neededNumber) {
        limit = neededNumber;
    }


    public String[] newFilm(String name) {

        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = name;
        films = tmp;
        return films;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int result;

        result = limit;
        if (limit > films.length) {
            result = films.length;
        }

        String[] reversed = new String[result];

        for (int i = 0; i < result; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }
}