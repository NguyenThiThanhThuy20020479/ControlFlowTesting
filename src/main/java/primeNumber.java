public class primeNumber {
    public String testingPrime(int a) {
        String str = "";
        if (a == 1) {
            str = "Đây không phải số nguyên tố";
        } else {
            if (a < 4) {
                str = "Đây là số nguyên tố";
            } else {
                for(int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        str = "Đây không phải số nguyên tố";
                        break;
                    }
                }
            }
        }
        return str;
    }

}
