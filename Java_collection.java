import java.util.*;

public class Java_collection {
    public static void main(String[] args) {
        Object number = 1.25;
        Object string = "Валентин";
        System.out.println(number);
        System.out.println(string);
        People man = new People(35,"Stas");
        System.out.println(man);
        System.out.println(man.toString());

        ArrayList<Integer> arrayList = new ArrayList<Integer>(); // инициализация объекта arrayList класса ArrayList

        arrayList.add(2808);

        for (Object element: arrayList) {
            System.out.println(element);
        }
        List<Integer> col = List.of(1,2,3,4); //создание итерируемого объекта
        Iterator<Integer> iterator = col.iterator(); //создание итератора iterator для итерируемого объекта col типа List
                                                        // обязательно указаываем тип итератора, он должен соответствовать т
                                                        // типу итерируемого объекта
        while(iterator.hasNext()) { // пока имеется следующий элемент
            System.out.println(iterator.next()); // печатаем этот следующий элемент
        }



    }
}
class People {
    int age;
    String name;
    People(int age, String name) {
        this.age = age;
        this.name = name;
    }
    // переопределили классический унаследованный от Object метод toString c целью вывода на экран не hash кода а нужной
    //информации
    public String toString() {
        return name+","+age;

    }
}
