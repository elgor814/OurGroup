public interface Sortable<T> {
    void sortByFirstField(); // сортировка по первому полю (Мощность, автор, тип)

    void sortBySecondField(); // сортировка по второму полю (модель, название, вес)

    void sortByThirdField(); // сортировка по третьему полю (год производства, количество страниц, цвет)

}