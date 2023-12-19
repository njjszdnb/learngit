//
//package xiangmuguangli;
import java.util.Scanner;

public class EEE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        while (option != 3) {
            System.out.println("请选择操作:");
            System.out.println("1. 加密");
            System.out.println("2. 解密");
            System.out.println("3. 退出");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    encryptPassword(scanner);
                    break;
                case 2:
                    decryptPassword(scanner);
                    break;
                case 3:
                    System.out.println("谢谢使用，再见!");
                    break;
                default:
                    System.out.println("无效的选项，请重新输入。");
                    break;
            }
        }

        scanner.close();
    }

    private static void encryptPassword(Scanner scanner) {
        System.out.println("请输入数字密码:");
        int password = scanner.nextInt();

        if (password <= 0) {
            System.out.println("非法的数字密码。");
            return;
        }

        int encryptedPassword = 0;
        while (password > 0) {
            int digit = password % 10;
            encryptedPassword = (encryptedPassword * 10) + (((digit + 5) % 10) * 2);
            password /= 10;
        }

        System.out.println("加密后的密码: " + encryptedPassword);
    }

    private static void decryptPassword(Scanner scanner) {
        System.out.println("请输入加密后的密码:");
        int encryptedPassword = scanner.nextInt();

        int decryptedPassword = 0;
        while (encryptedPassword > 0) {
            int digit = encryptedPassword % 10;
            decryptedPassword = (decryptedPassword * 10) + (((digit / 2) + 5) % 10);
            encryptedPassword /= 10;
        }

        System.out.println("解密后的密码: " + decryptedPassword);
    }
}
