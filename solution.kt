private object Solution1 {
    private fun countUpAndDown(n: Int): List<Int> {
        val size = (n * 2) + 1

        return List(size) {
            when {
                it <= n -> it
                else -> (n * 2) - it
            }
        }
    }
}

private object Solution2 {
    private fun countUpAndDown(n: Int): List<Int> {
        return (0 until n) + (n downTo 0)
    }
}
