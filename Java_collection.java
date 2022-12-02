import java.util.ArrayList;

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
