fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val dayCount = "0X"
    val testInput = readInput("Day${dayCount}_test")
    val input = readInput("Day${dayCount}")

    println("Day ${dayCount}\n")
    check(part1(testInput) == -1)
    println("Part 1 Test Output: ${part1(testInput)}")
    println("Part 1 Output\n${part1(input)}\n")

    println("Part 2 test")
    check(part2(testInput) == -1)
    println("Part 2 Test Output: ${part2(testInput)}")
    println("Part 2 Output\n${part2(input)}\n")
}
