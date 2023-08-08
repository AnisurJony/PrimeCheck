fun isPrime(n: Int): Int {
    if (n <= 1) {
        return 0
    }
    
    for (i in 2 until n) {
        if (n % i == 0) {
            return 0
        }
    }
    
    return 1
}

fun main() {
    val n = readLine()!!.toInt()
    print(isPrime(n))
}
