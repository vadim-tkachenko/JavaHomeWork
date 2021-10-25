import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число. Для завершения игры напишите: Пока.");

        int range = 100;
        int number = (int)(Math.random() * range);
        int x = 0;
        System.out.println("Угадайте число от 0 до " + range);
        while (true){
            String input = scanner.next();
            if (input.equals("Пока")) {break;}
            if (Integer.parseInt(input) == number){
                System.out.println("Вы угадали. Использовано попыток: " +x);
                break;
            } else if (Integer.parseInt(input) > number){
                System.out.println("Загаданное число меньше");
                x++;
            } else if(Integer.parseInt(input) < number) {
                System.out.println("Загаданное число больше");
                x++;
            }
        }
        scanner.close();
    }
}