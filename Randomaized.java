import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Randomaized {

    //region lists
    String [] books = {"Война и мир", "Фрегат Паллада", "Преступление и наказание",
            "Отцы и дети", "Евгений Онегин"};
    String [] authors = {"Пушкин", "Толстой", "Тургенев", "Гончаров", "Достоевский"};
    String [] cars = {"Lada", "BMW", "Ford", "Mercedes-Benz ", "Nissan"};
    String [] vegetables = {"Свекла", "Морковь", "Картофель", "Тыква", "Помидор"};
    String [] colors = {"Красный", "Желтый", "Оранжевый", "Белый", "Лиловый"};
    //endregion
    Random rnd = new Random();

    public ArrayList<?> getList(){
        System.out.println("Выберете тип объекта:");
        System.out.println("1 - Книга");
        System.out.println("2 - Машина");
        System.out.println("3 - Овощ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1){
            ArrayList<Book> arrayList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                arrayList.add(new Book.BookBuilder(books[rnd.nextInt(0, 4)])
                        .setAuthor(authors[rnd.nextInt(0, 4)])
                        .setPages(rnd.nextInt(50, 400)).build());
            }
            return arrayList;
        }
        else if (choice==2) {
            ArrayList<Car> arrayList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                arrayList.add(new Car.CarBuilder(cars[rnd.nextInt(0, 4)])
                        .setPower(rnd.nextInt(100, 200))
                        .setYear(rnd.nextInt(1999, 2024))
                        .build());
            }
            return arrayList;
        }
        else if (choice==3) {
            ArrayList<RootVegetable> arrayList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                arrayList.add(new RootVegetable.RootVegetableBuilder(vegetables[rnd.nextInt(0, 5)])
                        .setColour(colors[rnd.nextInt(0, 5)])
                        .setWeight(rnd.nextInt(5, 40))
                        .build());
            }
            return arrayList;
        }

        System.out.println("Ошибка ввода");
        return new ArrayList<>();
    }



    static int getRndDig(int dig){
        return (int) (Math.random() * dig);
    }
}
