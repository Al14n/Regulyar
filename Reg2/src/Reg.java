import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    public static void Regic(String a){
        Pattern pattern = Pattern.compile("([0-1][0-9])|([2][0-3])|[0-9]:[0-5][0-9]");
        Matcher matcher = pattern.matcher(a);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
