public interface Randomaized {
    static int getRndDig(int dig){
        return (int) (Math.random() * dig);
    }
}
