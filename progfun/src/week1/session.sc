package week1

object session {
	1 + 4                                     //> res0: Int(5) = 5
	def abs(x: Double) = if (x < 0) -x else x //> abs: (x: Double)Double
	
	def sqrt(x: Double) = {
		def sqrtIter(guess: Double, x: Double): Double =
			if (isGoodEnough(guess, x)) guess
			else sqrtIter(improve(guess,x),x)
			
		def isGoodEnough(guess: Double, x: Double) =
			abs(guess * guess - x) / x < 0.001
			
		def improve(guess: Double, x: Double) =
			(guess + x / guess ) / 2
	
	sqrtIter(1.0, x)
	}                                         //> sqrt: (x: Double)Double

sqrt(2)                                           //> res1: Double = 1.4142156862745097
sqrt(4)                                           //> res2: Double = 2.000609756097561
}