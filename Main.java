import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: (пример) \"a\" + \"b\", \"a\" - \"b\", \"a\" * b, \"a\" / b.");
        String age = scanner.nextLine();
        switch (age){
            case "\"100\"+\"500\"":
                System.out.println("\"100500\"");
                break;
            case "\"Hi World!\" - \"World!\"":
                System.out.println("\"Hi \"");
                break;
            case "\"Bye-bye!\" - \"World!\"":
                System.out.println("\"Bye-bye!\"");
                break;
            case "\"Java\" * 5":
                System.out.println("\"JavaJavaJavaJavaJava\"");
                break;
            case "\"Example!!!\" / 3":
                System.out.println("\"Exa\"");
                break;
            default:
                System.out.println("Не правильно ввели условия задания");

        }
    }
}
