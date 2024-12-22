public class RootVegetable {

    private String type;
    private double weight;
    private String colour;


    //region getters
    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }
    //endregiongit

    public RootVegetable(RootVegetableBuilder rootVegetableBuilder){
        this.type = rootVegetableBuilder.type;
        this.weight = rootVegetableBuilder.weight;;
        this.colour = rootVegetableBuilder.colour;
    }

    public static class RootVegetableBuilder{

        private String type;
        private double weight;
        private String colour;

        public RootVegetableBuilder(String type){
            this.type = type;
        }

        public RootVegetableBuilder setWeight(double weight){
            this.weight = weight;
            return this;
        }

        public RootVegetableBuilder setColour(String colour){
            this.colour = colour;
            return this;
        }

        public RootVegetable build(){
            return new RootVegetable(this);
        }
    }
}
