import scala.collection.mutable

def isEven(n: BigInt): Boolean = (n % 2 == 0)

var fibs = mutable.Map[Int, BigInt]()
def fib(n: Int): BigInt = {
  if (fibs.isDefinedAt(n)) return fibs(n)
  if (n <= 2) return 1;
  fibs(n) = fib(n - 1) + fib(n - 2)
  return fibs(n)
}

var result = (1 to 28).map(n => fib(n)).reduceLeft { (a, b) => if (isEven(b)) println(a, b); if (isEven(b)) a + b else a + 0 }
println(result)
//(1,2)
//(3,8)
//(11,34)
//(45,144)
//(189,610)
//(799,2584)
//(3383,10946)
//(14329,46368)
//(60697,196418)
//257115
