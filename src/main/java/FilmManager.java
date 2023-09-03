public class FilmManager {

    String[] films = {};

    private int returnNumber;
    private int input;

    public FilmManager() {
        returnNumber = 5;
        input = 0;
    }

    public FilmManager(int neededNumber) {
        returnNumber = neededNumber;
        input = 1;
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


        if (input == 1) {
            if (returnNumber > films.length) {
                returnNumber = films.length;
            }
        }
        result = returnNumber;

        String[] reversed = new String[result];

        for (int i = 0; i < returnNumber; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }
}