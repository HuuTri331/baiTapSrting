import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ktIp {

    public static void main(String[] args) {
        // Nhap ip co dang: "192.168.0.1"; bắt đầu từ 0.0.0.0 và kết thúc ở 255.255.255.255.
        System.out.print("Nhập gmail: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regaex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        Pattern pattern = Pattern.compile(regaex);
        Matcher matcher = pattern.matcher(input);


        if ( matcher.find()) {
            System.out.println("Nhập thành công!!");
        }else {
            System.out.println("Vui lòng kiểm tra ip!");
        }
    }
}
