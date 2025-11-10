public class Main {
    static int h = 7;
    static double[] arr = { 4.5, 6, 9.0, 8};
    static boolean[] arrBoo = new boolean[100];
    public static void main(String[] args) {
        System.out.println("Hello World");

        int x  = 10;
        System.out.println(x+h);
        System.out.println(x%2 == 0);

        System.out.println(arr.length);

        System.out.println(arrBoo[0]);
        arrBoo[3] = true;
        System.out.println(arrBoo[0] || arrBoo[3]);
        System.out.println(arrBoo.length);
    }
}
