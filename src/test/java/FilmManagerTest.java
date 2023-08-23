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
    public void Test2() {
        FilmManager filmManager = new FilmManager();
        filmManager.newFilm("Чужой");
        filmManager.findAll();
        String[] expected = {"Гадкий я", "Тачки", "Интерстеллар", "Марсианин", "Тролли", "Шрек", "Чужой"};
        String[] actual = filmManager.films;

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void Test3() {
        FilmManager filmManager = new FilmManager();
        filmManager.newFilm("Свой");
        String[] expected = {"Свой", "Шрек", "Тролли", "Марсианин", "Интерстеллар"};
        String[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test4() {
        FilmManager filmManager = new FilmManager(2);
        filmManager.newFilm("Свой");
        String[] expected = {"Свой", "Шрек"};
        String[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
