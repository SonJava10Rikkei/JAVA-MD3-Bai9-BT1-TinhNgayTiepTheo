import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NextDayCalculator {
    public static void main(String[] args) {
        System.out.println("Nhập năm, tháng, ngày muốn kiểm tra! ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Nhập năm: ");
        int year = scanner.nextInt();
        System.out.println("- Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.println("- Nhập ngày: ");
        int day = scanner.nextInt();

        LocalDate localDate = LocalDate.of(year, month, day);

        System.out.println("__________________________________________________");
        LocalDate nextDay = nextDay(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = localDate.format(formatter);
        String formattedNextDay = nextDay.format(formatter);
        System.out.println("Ngày tiếp theo của ngày " + formattedDate + " là: \n" + "Ngày: " + formattedNextDay);
    }

    public static LocalDate nextDay(int year, int month, int day) {
        LocalDate ngayNhapVao = LocalDate.of(year, month, day);
        LocalDate nextDay1 = ngayNhapVao.plusDays(1);
        return nextDay1;
    }

}
