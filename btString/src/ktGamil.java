import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ktGamil {
    public static void main(String[] args) {
        // Nhap gamil co dang: tringuyen@gmail.com
        System.out.print("Nhập gmail: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regaex = "^[a-zA-Z]+[a-zA-Z0-9]+@{1}+gmail.com$";

        Pattern pattern = Pattern.compile(regaex);
        Matcher matcher = pattern.matcher(input);


        if ( matcher.find()) {
            System.out.println("Nhập thành công!!");
        }else {
            System.out.println("Vui lòng kiểm tra gamil!");
        }
    }
}
