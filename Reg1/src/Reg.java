import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
     public static void Regik(String input){
       int a = 0;
        Pattern pattern = Pattern.compile("\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)");
        Matcher matcher = pattern.matcher(input);

           while (matcher.find()) {
               a++;
               if(a == 1){System.out.println(matcher.group());}
           }
           System.out.println("Число повторений: " + a);

    }
}
