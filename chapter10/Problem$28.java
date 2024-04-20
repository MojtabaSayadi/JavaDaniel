package chapter_ten;

/**
 * **10.28 (Implement the StringBuilder class) The StringBuilder class is provided
 * in the Java library. Provide your own implementation for the following methods
 * (name the new class MyStringBuilder2):
 * public MyStringBuilder2();
 * public MyStringBuilder2(char[] chars);
 * public MyStringBuilder2(String s);
 * public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
 * public MyStringBuilder2 reverse();
 * public MyStringBuilder2 substring(int begin);
 * public MyStringBuilder2 toUpperCase();
 *
 * @ Mojtaba Sayadi
 * */

public class Problem$28
{
    public static void main(String[] args)
    {
        MyStringBuilder2 string1 = new MyStringBuilder2("Sayadi");
        MyStringBuilder2 string2 = new MyStringBuilder2();

        MyStringBuilder2 string3 = new MyStringBuilder2(
                new char[] {'M', 'o', 'j', 't', 'a', 'b','a'});

        System.out.println(string1.insert(string1.length(), string3)); // 
        System.out.println(string1.reverse()); // 
        string1.reverse();
        System.out.println(string1.substring(6)); // 
        System.out.println(string1.toUpperCase()); // 
    }
}

