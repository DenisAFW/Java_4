
/*
* 2 Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида
 * text~num
 * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 * Если ввод не содержит символа ~, то завершает программу с ошибкой.
 * Если введено -1, то выходим
 *
 * string~3
 * java~5
 * print~0 => ""
 * print~3 => string
 *
 */
import java.util.*;

public class Soft {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.printf("Вводите данные в формате 'данные~число' ");
        String current = "";
        Map<String, String> map = new HashMap<>();
        String[] array;
        while (!current.equals("-1")) {
            current = f.nextLine();
            if (current.contains("~")) {
                if (current.contains("print")) {
                    array = current.replace("~", " ").split(" ");
                    String result = map.get(array[1]);
                    System.out.println(result);
                }else{
                    array = current.replace("~", " ").split(" ");
                map.put(array[1], array[0]);
                }
            } else if (!current.equals("-1")) {
                System.out.println("Все не работает, вводи по новой!");
                break;
            } else {
                System.out.println("Конец работы");
            }
        }

        f.close();
    }
}
