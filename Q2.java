public class Q2 {
    public static void main(String[] args) {
        String str = "https://ful.io";
        String fb = "https://www.facebook.com/";
        String lk = "https://www.linkedin.com/company/";
        String companyName = str.substring(str.indexOf("https://")+8);
        System.out.println("Social links -");
        System.out.println(fb+companyName.replace(".", "")+"Tech/");
        System.out.println(lk+companyName.replace(".", "-")+"/\n");

        System.out.println("Email/s-");
        System.out.println("support@"+companyName+"\n");
        System.out.println("Contact:");
        System.out.println("+1 343 303 6668");
    }
}
