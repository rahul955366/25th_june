class HelloWorld {
   public void findPrimes(int n) {
    for (int i = 2; i <= n; i++) {
      boolean isPrime = true; // Assume prime initially
      for (int j = 2; j < i; j++) { // Check divisibility from 2 to i-1
        if (i % j == 0) {
          isPrime = false; // Not prime if divisible
          break;
        }
      }
      if (isPrime) {
        System.out.println(i);
      }
    }
  }
}
class Main {
    
    public static void main(String[] args) {
    int n = 10; // Change n to your desired upper limit
    
    HelloWorld o = new HelloWorld();
    o.findPrimes(n);
}
}