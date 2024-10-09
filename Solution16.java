// Smith Number

class Solution16 {
    static int sumOfDigits(int num) {
        int sum = 0;
        
        while(num > 0) {
            sum += (num % 10);
            num /= 10;
        } 
        
        return sum;
    }

    static int sumPrimes(int n) {
        int sum = 0, factors = 0, k = 2;
        while(n > 1) {
            if(n % k == 0) {
                sum += sumOfDigits(k);
                factors++;
                n /= k;
            } else
                k++;
        }
        
        return factors <= 1 ? 0 : sum; // composite number must have more than 1 factors;
    }

    static int smithNum(int n) {
        int sumOfN = sumOfDigits(n);
        int sumOfPrimes = sumPrimes(n);
        return sumOfN == sumOfPrimes ? 1 : 0;
    }
}
