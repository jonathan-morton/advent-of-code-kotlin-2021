fun main() {
    fun part1(input: List<Int>): Int {
        return input.windowed(2).count { (first, second) ->
            first < second
        }
    }

    fun part2(input: List<Int>): Int {
        return input.windowed(3).windowed(2).count { (firstGroup, secondGroup) ->
            firstGroup.sum() < secondGroup.sum()
        }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInputAsInt("Day01_test")
    println("Day 01 tests")
    println("Part 1 test")
    check(part1(testInput) == 7)
    println("Part 1 Output: ${part1(testInput)}\n")

    println("Part 2 test")
    check(part2(testInput) == 5)
    println("Part 2 Output: ${part2(testInput)}\n")

    val input = readInputAsInt("Day01")
    println(part1(input))
    println(part2(input))
}
