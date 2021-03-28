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
}

private object Solution2 {
    fun countUniqueValues(list: List<Int>): Int {
        return list.toSet().size
    }
}

private object Solution3 {
    fun countUniqueValues(list: List<Int>): Int {
        return list.distinct().size
    }
}

private object Solution4 {
    fun countUniqueValues(list: List<Int>): Int {
        return list.groupBy { it }.size
    }
}

