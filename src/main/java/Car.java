public class Car implements Comparable<Car>{

    private String model;
    private int power;
    private int year;

    //region getters
    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    //endregion

    public Car(CarBuilder carBuilder){
        this.model = carBuilder.model;
        this.power = carBuilder.power;
        this.year = carBuilder.year;
    }

    @Override
    public int compareTo(Car o) {
        if (!this.model.equals(o.model))
            return (int)this.model.charAt(0) - (int)o.model.charAt(0);
        if (this.year != o.year)
            return this.year - o.year;
        return this.power - o.power;
    }

    public static class CarBuilder{

        private String model;
        private int power;
        private int year;

        public CarBuilder(String model){
            this.model = model;
        }

        public CarBuilder setPower(int power){
            this.power = power;
            return this;
        }

        public CarBuilder setYear(int year){
            this.year = year;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
