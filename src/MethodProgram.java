public class MethodProgram {
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        c = getX(a, b);
        System.out.println(c);
        nonReturn(c, a);

    }
    public static int getX(int a, int b) {
        return a + b;
    }
    public static void nonReturn(int a, int b){
        System.out.println("This is printed from method: " + (a + b));
    }
}
