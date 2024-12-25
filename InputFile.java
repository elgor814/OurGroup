import java.io.*;


public class InputFile extends Validate implements Inputer {
    String path = "C:\\Users\\Juras\\IdeaProjects\\SomeProject\\src\\SomeFile.txt";
    //забор информации из файла
    private String fileRead(String path) throws FileNotFoundException {
        StringBuilder strBuild = new StringBuilder();
        File f = new File(path);
        try(FileReader reader = new FileReader(f)) {
            int c;
            while((c=reader.read())!=-1){
                strBuild.append((char)c);
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return strBuild.toString();
    }
    private String fStr;
    {
        try {
            fStr = fileRead(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    String[] parts = fStr.split("/n");

    @Override
    public int inputDigit() {
        String str = this.parts[0];
        if(validNum(str)){
            System.out.print("Good");
        }else{
            System.out.print("Eror");
        }
        return Integer.parseInt(str);
    }

    @Override
    public String inputWord() {
        String str = this.parts[1];
        if(validWord(str)){
            System.out.print("Good");
        }else{
            System.out.print("Eror");
        }
        return str;
    }

    @Override
    public String inputString() {
        String str = this.parts[2];
        return str;
    }
}
