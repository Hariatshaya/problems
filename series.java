public class series {
    public static void main(String[] args) {
        int n = 19; 
        int a = 0, b = 0;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { 
                result = a;
                a += 7;
            } else { 
                result = b;
                b += 6;
            }
        }
        
        System.out.println("The 15th element is: " + result);
    }
}
