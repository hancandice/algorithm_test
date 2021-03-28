import kotlin.math.pow

private object Solution1 {

    fun countUniqueValues(list: List<Int>): Int {
        val map = mutableMapOf<Int, Int>()

        list.forEach {
            var value = map.getOrDefault(it, 0)
            value++
            map[it] = value
        }
        return map.count()
    }

    fun printNumber(n: Int): List<Int> {
        return (n downTo 1).toList()
    }

    fun printNumberWithStep(n: Int, step: Int = 1): List<Int> =
            (n downTo 1 step step).toList()

    fun power(base: Int, exponent: Int): Int {
        if (exponent == 1) {
            return base
        }
        return base * power(base, exponent - 1)
    }
}


private object Solution2 {
    fun countUniqueValues(list: List<Int>): Int {
        return list.toSet().size
    }

    fun printNumberWithStep(n: Int, step: Int = 1): List<Int> {
        fun printNumberRec(n: Int): List<Int> =
                when {
                    n <= 0 -> emptyList()
                    else -> listOf(n) + printNumberRec(n - step)
                }
        return printNumberRec(n)
    }

    fun power(base: Int, exponent: Int): Int {
        return base.toDouble().pow(exponent).toInt()
    }
}

private object Solution3 {
    fun countUniqueValues(list: List<Int>): Int {
        return list.distinct().size
    }

    private fun printNumberWithStep(n: Int, step: Int = 1): List<Int> {
        val list = mutableListOf<Int>()

        if (n <= 0) return emptyList()
        else list.add(n)

        list.addAll(printNumberWithStep(n - step, step))
        return list
    }
}

private object Solution4 {
    fun countUniqueValues(list: List<Int>): Int {
        return list.groupBy { it }.size
    }
}

