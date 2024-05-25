package chapter_nineteen;

/**
 * 19.3 (Pair of objects of the same type) Create a Pair class that encapsulates two objects
 * of the same data type in an instance of Pair.
 *
 *
 * @ Mojtaba Sayadi
 * */
public class Problem$03
{
    public static void main(String[] args)
    {
        Pair<String> pair = new Pair<>("Mojtaba", "Sayadi");
        System.out.println(pair.getO1()); // Mojtaba
        System.out.println(pair.getO2()); // Sayadi
    }
}
