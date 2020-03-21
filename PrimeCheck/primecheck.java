class primecheck{
    public static void main(String[] args) {
        System.out.println(isPrime(9));
        
    }
    public static boolean isPrime(int n) {
        boolean check = true;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if(n % i == 0){
                check = false;
                break;
            }
        }
        return check;
    }
}