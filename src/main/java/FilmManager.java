public class FilmManager {

    String[] films = {"Гадкий я", "Тачки", "Интерстеллар", "Марсианин", "Тролли", "Шрек"};

    private int returnNumber;

    public FilmManager() {
        returnNumber = 5;
    }

    public FilmManager(int neededNumber) {
        returnNumber = neededNumber;
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
        if (returnNumber == 5) {
            result = 5;
        } else {
            result = returnNumber;
        }

        String[] reversed = new String[result];

        for (int i = 0; i < returnNumber; i++) {
            reversed[i] = films[films.length - 1 - i];

        }
        return reversed;
    }
}