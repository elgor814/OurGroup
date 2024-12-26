package third_task;

public class Car implements Comparable<Car> {
    private int power; // Мощность
    private String model; // Модель
    private int year; // Год производства

    private Car(Builder builder) {
        this.power = builder.power;
        this.model = builder.model;
        this.year = builder.year;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.power, other.power);
    }

    public static class Builder {
        private int power;
        private String model;
        private int year;

        public Builder setPower(int power) {
            this.power = power;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car [power=" + power + ", model=" + model + ", year=" + year + "]";
    }
}
