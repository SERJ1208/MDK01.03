import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in); //

        while (true) {
            System.out.println("Введите название фильма для просмотра (или 'выход' для завершения):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("выход")) {
                break;
            }

            if (movies.size() < 50) {
                movies.add(input);
            } else {
                System.out.println("Список фильмов полон. Максимум 50 фильмов.");
            }
        }

        if (!movies.isEmpty()) {
            System.out.println("Список фильмов для просмотра:");
            for (String movie : movies) {
                System.out.println(movie);
            }
        } else {
            System.out.println("Список фильмов пуст.");
        }
    }
}