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

        ArrayList list1 = new ArrayList();//список сырых объектов, без указания типов хранимых элементов
        ArrayList<Integer> list2 = new ArrayList<Integer>(); //список целочисленных элементов
        list2.add(536); //добавление в список элемента со значением 536
        list2.add(12,453); //добавление элемента со значением 453 на позицию 12
        int tmp = list2.get(12); // получение 12-го элемента из листа
        list2.set(3,67); // присваивание (замена) значения 3-го элемента списка на 67, если 3-го элемента не было, то
                         // он его не создаст
        list2.remove(7); // удаляет 7-й элемент из списка
        list2.remove(new Integer(7)); // удаляет из списка элемент со значением 7
        list2.size(); // возвращает размер списка (не длину, а именно количество элементов к которым мы обращались
        list2.clear();// очищает список(пробегается по всем элементам, удаляет ссылки на значения, присваивает размеру
                      // списка значение 0 и через некоторое время сборщик мусора из кучи удалит значения, потому что на
                      // них ни кто не ссылается.
        List list3 = list1.subList(2,list1.size()-1); // создаст лист целосисленных значений путём вырезания из list1
                                                      // элементов с 2-го до предпоследнего
        //-----------варианты перебора элементов списка-------------
        //1.
                for(int i=0;i<25;i++){
                    list2.add(new Random().nextInt(100)); //добавление 25 случайных значений в список
                }
        //2.
                 for (Object element: list1){  // при использовании цикла foreach удалять элементы из списка нельзя
                        System.out.println(element);
                 }
        //3.
                Iterator<Integer> iterator1 = list2.iterator(); //итератор хранит список ссылок на элементы массива
                 while (iterator1.hasNext()){
                     int i = iterator1.next();
                     i = 7;
                     System.out.println(i);
                     iterator1.remove(); //при переборе списка итератором можно удалить элемент из списка через итератор
                 }
        //4.
                 ListIterator<Integer> iterator2 = list2.listIterator(6); //применяется для листов
                    // в качестве аргумента можно передать количество элементов, которые надо перебирать
                 while (iterator2.hasPrevious()){ //проверка есть ли предыдущий элемент(здесь начнется с 6-го и в начало
                     int i = iterator2.previous();
                     System.out.println();
                 }
        //5.
                list2.forEach(element -> System.out.println(element));// перебор через встроенный forEach метод
                list2.forEach(element -> element*=5);//умножим каждый элемент списка на 5
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

class JavaCollection {
    ArrayList list1 = new ArrayList();//список сырых объектов, без указания типов хранимых элементов
    ArrayList<Integer> list2 = new ArrayList<Integer>(); //список целочисленных элементов
    list2.
}


