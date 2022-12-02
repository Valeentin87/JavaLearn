public class Java_collection {
    public static void main(String[] args) {
        Object number = 1.25;
        Object string = "Валентин";
        System.out.println(number);
        System.out.println(string);
        People man = new People(35,"Stas");
        System.out.println(man);
        System.out.println(man.toString());
    }
}
class People {
    int age;
    String name;
    People(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
