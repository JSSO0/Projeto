import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class WhatsAppNumberValidator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        String num = sc.next();
        
        String pattern = "^\\d+$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(num);

        if (m.find() && num.length() == 11) {
            System.out.println("https://wa.me/55" + num);
        } else {
            if (num.length()==13) {
                System.out.println("https://wa.me/" + num);
            } else {
                System.out.println("Formato invalido");
            }
    }  
} 

}
