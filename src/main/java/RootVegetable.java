public class RootVegetable implements Comparable<RootVegetable>{

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

    @Override
    public int compareTo(RootVegetable o) {
        if (!this.type.equals(o.type))
            return (int)this.type.charAt(0) - (int)o.type.charAt(0);
        if (this.weight!=o.weight)
            return (int) ((this.weight - o.weight) * 100);
        if (this.colour != null && o.colour != null)
            return (int)this.colour.charAt(0) - (int)o.colour.charAt(0);
        return (this.colour == null ? 0 : 1) - (o.colour == null ? 0 : 1);
    }

    @Override
    public String toString() {
        return "\n" + "RootVegetable{" +
                "type = " + type +
                ", weight = " + weight +
                ", colour = " + colour +
                '}';
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
