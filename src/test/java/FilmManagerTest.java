import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void Test1() {
        FilmManager filmManager = new FilmManager();
        filmManager.newFilm("Чужой");
        int n = filmManager.films.length;
        String expected = "Чужой";
        String actual = filmManager.films[n - 1];

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestReturnAll() {
        FilmManager filmManager = new FilmManager();
        filmManager.newFilm("Чужой");
        filmManager.newFilm("Свой");
        filmManager.findAll();
        String[] expected = {"Чужой", "Свой"};
        String[] actual = filmManager.films;

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void TestReturnLast5() {
        FilmManager filmManager = new FilmManager();
        filmManager.newFilm("Свой");
        filmManager.newFilm("Чужой");
        filmManager.newFilm("Шрек");
        filmManager.newFilm("Тачки");
        filmManager.newFilm("Тачки 2");
        filmManager.newFilm("Валли");
        filmManager.newFilm("Тролли");
        String[] expected = {"Тролли", "Валли", "Тачки 2", "Тачки", "Шрек"};
        String[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestReturnLast5Input() {
        FilmManager filmManager = new FilmManager(5);
        filmManager.newFilm("Свой");
        filmManager.newFilm("Чужой");
        filmManager.newFilm("Шрек");
        filmManager.newFilm("Тачки");
        filmManager.newFilm("Тачки 2");
        filmManager.newFilm("Валли");
        filmManager.newFilm("Тролли");
        String[] expected = {"Тролли", "Валли", "Тачки 2", "Тачки", "Шрек"};
        String[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestReturnLast5InputEqual() {
        FilmManager filmManager = new FilmManager(5);
        filmManager.newFilm("Шрек");
        filmManager.newFilm("Тачки");
        filmManager.newFilm("Валли");
        filmManager.newFilm("Тачки 2");
        filmManager.newFilm("Шрек2");
        String[] expected = {"Шрек2", "Тачки 2", "Валли", "Тачки", "Шрек"};
        String[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestReturnLast3More() {
        FilmManager filmManager = new FilmManager(3);
        filmManager.newFilm("Тачки");
        filmManager.newFilm("Тачки 2");
        filmManager.newFilm("Шрек");
        filmManager.newFilm("Свой");
        String[] expected = {"Свой", "Шрек", "Тачки 2"};
        String[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestReturnLast3Less() {
        FilmManager filmManager = new FilmManager(3);
        filmManager.newFilm("Шрек");
        filmManager.newFilm("Свой");
        String[] expected = {"Свой", "Шрек"};
        String[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
