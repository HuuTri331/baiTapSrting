import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sting {
    public static void main(String[] args) {
//       Kiểm tra regaex số dt có đầu số 032,033,034 và có 10 chữ số;
        String input = "0322525435";

        String regaex = "^(032|033|034)\\d{7}$";
        Pattern pattern = Pattern.compile(regaex);
        Matcher matcher = pattern.matcher(input);

        if ( matcher.find()) {
            System.out.println("Nhập thành công!");
        }else {
            System.out.println("Vui lòng kiểm tra số điện thoại!!");
        }
    }
}