public class Validate {

    public boolean validNum (String str){
        boolean b = false;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i)>=40 && str.charAt(i)<=57){
                b = true;
                break;
            }
        }
        return b;
    }

    public boolean validWord (String str){
        boolean b = true;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122){
                continue;
            }else if (str.charAt(i)>=192 && str.charAt(i)<=225 || str.charAt(i) == 168 || str.charAt(i) == 184){
                continue;
            }else{
                b = false;
                break;
            }
        }
        return b;
    }
}
