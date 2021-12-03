import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1 Задание
        String[] strings = new String[]{"first","second","third","fourth"};
        for(String str : strings)
        System.out.println(str);
        System.out.println();

        changeArValues(strings,0,1);
        for(String str : strings)
            System.out.println(str);

        //2 Задание
        System.out.println();
        ArrayList<String> list = toArrayList(strings);
        System.out.println(list.toString());

        //3 Задание
        System.out.println();
        Apple apple1 = new Apple(1.0f); //Яблоки
        Apple apple2 = new Apple(1.1f);
        Apple apple3 = new Apple(1.3f);
        Apple extraApple = new Apple(0.9f);

        Orange orange1 = new Orange(1.5f); //Апельсины
        Orange orange2 = new Orange(1.2f);
        Orange orange3 = new Orange(1.6f);

        Box<Apple> appleBox = new Box("appleBox"); //Коробки
        Box<Orange> orangeBox = new Box("orangeBox");

        appleBox.put(apple1); // Кладем фрукты в коробки
        appleBox.put(apple2);
        appleBox.put(apple3);

        orangeBox.put(orange1);
        orangeBox.put(orange2);
        orangeBox.put(orange3);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox)); //Сравниваем коробки

        appleBox.put(extraApple); //Кладем еще одно яблоко, чтобы уровнять вес

        System.out.println(appleBox.compare(orangeBox)); //Проверяем

        Box<Apple> anotherAppleBox = new Box<>("anotherAppleBox");
        anotherAppleBox.whatInBox();
        anotherAppleBox.put(apple1); //Кладем в другую коробку яблоко
        anotherAppleBox.whatInBox(); //Проверяем что яблоко в коробке
        appleBox.whatInBox(); //Проверяем что в коробке есть фрукты
        appleBox.shiftFruit(anotherAppleBox); //Кладем из одной коробки в другую фрукты
        appleBox.whatInBox(); //Проверяем что первая коробка пуста
        anotherAppleBox.whatInBox(); // Проверяем что фрукты в другой коробке

    }

    public static <T> T[] changeArValues(T[] ar, int first, int second){
        T temp = ar[first];
        ar[first] = ar[second];
        ar[second] = temp;
        return ar;
    }

    public static <T> ArrayList<T> toArrayList(T[] ar){
        ArrayList<T> list = new ArrayList<>();
        for(T obj : ar){
            list.add(obj);
        }
        return list;
    }
}
