bool isPowerOfThree(int n) {
    if (n == 1) return true;
    if (n % 3 != 0) return false;
    else if(n == 0) return false;
    n = n / 3;
    return isPowerOfThree(n);
}