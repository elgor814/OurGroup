import java.io.FileNotFoundException;

public class Main implements Randomaized {
    public static void main(String[] args) {
//        InputConsol inputCon = new InputConsol();
//        int x = inputCon.inputDigit();
//        System.out.println(x);
//        String str = inputCon.inputWord();
//        System.out.println(str);
//        for (int i = 0; i < 5; i++){
//            System.out.println(Randomaized.getRndDig(8));
//        }
        InputFile inF = new InputFile();
        String[] arrStr = inF.arrStr;
//        for(int i = 0; i < arrStr.length; i++){
//            System.out.print(arrStr[i]);
//        }
        System.out.println(inF.inputDigit() + " " + inF.inputWord() + " " + inF.inputString());
    }
}