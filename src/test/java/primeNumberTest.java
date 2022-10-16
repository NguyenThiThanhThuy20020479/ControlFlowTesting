import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class primeNumberTest {
    primeNumber p = new primeNumber();
    @Test
    void test() {
        assertEquals("Đây không phải số nguyên tố", p.testingPrime(12) );
    }
    @Test
    void test1(){
        assertEquals("Đây là số nguyên tố", p.testingPrime(2));
    }

}