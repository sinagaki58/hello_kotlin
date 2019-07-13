class Rational(n: Int, d: Int) {
    init {
        require(d != 0, {"denominator must be null"})
    }
    private val g = gcd(Math.abs(n), Math.abs(d))
    val numerator: Int = n/g
    val denominator: Int = d/g

    override fun toString():String = "${numerator}/${denominator}"
    tailrec  private fun gcd(a: Int, b: Int):Int =
        if(b ==0) a
        else gcd(b, a%b)
}

fun main(args: Array<String>) {
    val rational = Rational(2,4)
    println(rational)
}