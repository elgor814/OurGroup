import java.util.Scanner;

public class MenuContext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            Menu.showStartMenu();
            choice = Menu.getUserChoice(scanner, 1, 6);

            switch (choice){
                case 1:
                    // Ввести данные вручную
                    break;
                case 2:
                    // Сгенерировать данные случайны образом
                    break;
                case 3:
                    // Загрузить данные из файла
                    break;
                case 4:
                    // Отсортировать данные
                    break;
                case 5:
                    // Найти элемент с помощью бинарного поиска
                    break;
                case 6:
                    System.out.println("Выход из программы...");
                    break;

            }

        }while (choice != 6);


    }
}