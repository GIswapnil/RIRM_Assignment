public class Q1 {
    public static void main(String args[]){
        String Str = "212-456-7890";//true
        //String Str = "2124567890";//true
        //String Str = "(212)456-7890";//true
        //String Str = "(212)-456-7890";//true
        //String Str = "212.456.7890";//true
        //String Str = "212 456 7890";//true
        //String Str = "+12124567890";//true
        //String Str = "+12124567890";//true
        //String Str = "+1 212.456.7890";//true
        //String Str = "+212-456-7890";//false
        //String Str = "1-212-456-7890";//false


        System.out.println(Str.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"
                + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"
                + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$"));
    }
}
