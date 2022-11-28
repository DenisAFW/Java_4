// 1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.*;

public class Revert {
    public static void main(String[] args) {
        String[] array = {"2","f","Bob", "Чпоньк!", "WATSUUUUUUUUUP"};
        LinkedList<String> array2 = new LinkedList<>();
        for(int i = array.length-1; i >=0; i--){
            array2.add(array[i]);
        }
        System.out.println(array2);
    }
}
