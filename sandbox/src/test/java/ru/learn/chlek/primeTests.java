package ru.learn.chlek;

import org.testng.Assert;
import org.testng.annotations.Test;

public class primeTests {

    @Test
    public void testPrimesFast () {
        Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
    }

    @Test (enabled = false)
    public void testPrimeLong () {
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrime(n));
    }

    @Test
    public void testNonPrime () {
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
    }
}
