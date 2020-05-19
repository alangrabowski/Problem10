public class Problem10 {
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2; i<=n/2; i++){
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
        long sum=2;
        for (int i=1; i<2000000; i+=2){
            if (isPrime(i))
                sum+=i;
        }
        System.out.println(sum);
        final long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
