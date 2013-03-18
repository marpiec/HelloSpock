package pl.marpiec.calculator

import spock.lang.Specification
import spock.lang.Unroll

class CalculatorSpec extends Specification {

    def "Adding of two integers"() {
        given:
        def calculator = new Calculator(a, b)

        expect:
        calculator.add() == sum

        where:
         a    |  b    ||  sum
        -5    |  3    || -2
         2    |  4    ||  6
         8    | -4    ||  4
         5    |  0    ||  5
    }

    def "Subtracting of two integers"() {
        expect:
        new Calculator(a, b).subtract() == difference

        where:
         a   |  b   ||  difference
        -5   |  3   || -8
         2   |  4   || -2
         8   | -4   ||  12
         5   |  0   ||  5
    }

    @Unroll
    def "Multiplying of two integers (#a * #b = #product)"() {
        given:
        def calculator = new Calculator(a, b)

        expect:
        calculator.multiply() == product

        where:
         a   |  b   ||  product
        -5   |  3   || -15
         2   |  4   ||  8
         8   | -4   || -32
         5   |  0   ||  0
    }
}
