import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Integer[] mas = {34, 14, 67, 86, 3, 12, 57, 4, 23};
        Integer[] mas2 = {34, 14, 67, 86, 3, 12, 57, 4, 43};

        MathBox mathBox = new MathBox(mas);

        MathBox mathBox2 = new MathBox(mas2);
        System.out.println(mathBox2.equals(mathBox));
        System.out.println(mathBox.equals(mathBox2));
        System.out.println();

        HashMap map = new HashMap();
        map.put(mathBox, 2);
        map.put(mathBox2, 2);

        System.out.println(map.values());
        System.out.println();

        mathBox.printSet();

        mathBox.delete(67);
        System.out.println();
        mathBox.printSet();

        System.out.println();
        System.out.println(mathBox.summator());

        System.out.println();
        System.out.println(mathBox.splitter(0));


    }
}
