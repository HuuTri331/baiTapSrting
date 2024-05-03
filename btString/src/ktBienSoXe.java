import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ktBienSoXe {
    public static void main(String[] args) {
        // kiểm tra biển số xe dang: 34-b3-61199
        System.out.print("Nhập biển số: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regaex = "^[0-9]{2}-[a-zA-Z0-9]{1,2}-[0-9]{5}$";

        Pattern pattern = Pattern.compile(regaex);
        Matcher matcher = pattern.matcher(input);


        if ( matcher.find()) {
            System.out.println("Nhập thành công!!");
        }else {
            System.out.println("Vui lòng kiểm tra biển số!");
        }
    }
}
