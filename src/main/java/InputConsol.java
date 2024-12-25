import java.util.Scanner;

public class InputConsol extends Validate implements Inputer{
    Scanner input = new Scanner(System.in);

    @Override
    public int inputDigit() {
        String str = null;
        System.out.print("Please, enter: ");
        while(true){
            str = input.nextLine();
            if(validNum(str)){
                break;
            }else{
                System.out.print("No, please again: ");
            }
        }
        return Integer.parseInt(str);
    }

    @Override
    public String inputWord() {
        String str = null;
        System.out.print("Please, enter: ");
        while(true){
            str = input.nextLine();
            if(validWord(str)){
                break;
            }else{
                System.out.print("No, please again: ");
            }
        }
        return str;
    }

    @Override
    public String inputString() {
        String str= input.nextLine();
        return str;
    }
}

