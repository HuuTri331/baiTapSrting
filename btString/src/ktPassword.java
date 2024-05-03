import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ktPassword {
    public static void main(String[] args) {
        // Nhap password có 6-32 ký tự, không chứa khoảng trắng
        System.out.print("Nhập password: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regaex = "^(?=\\S+$).{6,32}$";

        Pattern pattern = Pattern.compile(regaex);
        Matcher matcher = pattern.matcher(input);


        if ( matcher.find()) {
            System.out.println("Nhập thành công!!");
        }else {
            System.out.println("Vui lòng kiểm tra password!");
        }
    }
}
