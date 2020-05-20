public class Problem10 {
    public static long sumOfAllPrimesBelow(int n){
        boolean[] isPrime = new boolean[n+1];
        long sum=0;
        for (int i=2; i<=n; i++){
            isPrime[i]=true;
        }
        for (int p=2; p*p<=n; p++){
            for (int i=p*2; i<=n; i+=p)
                isPrime[i]=false;
        }
        for (int i=1; i<=n; i++){
            if (isPrime[i]){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        final long start = System.currentTimeMillis();

        System.out.println(sumOfAllPrimesBelow(2000000));

        final long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
