//Write s1 program to swap 2 String without s1 temporary variable?
public class Q1 {
    String s1 = "First String";
    String s2 = "Second String";

        System.out.println("Before swap: s1 = " + s1 + ", s2 = " + s2);

    // Swapping without s1 third variable
    s1 = s1 + s2;
    s2 = s1.substring(0, s1.length() - s2.length());
    s1 = s1.substring(s2.length());

        System.out.println("After swap: a = " + s1 + ", b = " + s2);
}
