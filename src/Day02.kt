fun main() {
    data class SubmarineMovement(
        val direction: String,
        val amount: Int
    )

    fun part1(input: List<String>): Int {
        val movements = input.map {
            val (direction, amount) = it.split(" ")
            SubmarineMovement(direction, amount.toInt())
        }

        var horizontalPosition = 0
        var depth = 0

        movements.forEach { submarine ->
            when(submarine.direction) {
                "forward" -> {
                    horizontalPosition += submarine.amount
                }
                "down" -> {
                    depth += submarine.amount
                }
                "up" -> {
                    depth -= submarine.amount
                }
            }
        }

        return horizontalPosition * depth
    }

    fun part2(input: List<String>): Int {
        val movements = input.map {
            val (direction, amount) = it.split(" ")
            SubmarineMovement(direction, amount.toInt())
        }

        var horizontalPosition = 0
        var depth = 0
        var aim = 0

        movements.forEach { submarine ->
            when(submarine.direction) {
                "forward" -> {
                    horizontalPosition += submarine.amount
                    depth += aim * submarine.amount
                }
                "down" -> {
                    aim += submarine.amount
                }
                "up" -> {
                    aim -= submarine.amount
                }
            }
        }

        return horizontalPosition * depth
    }

    // test if implementation meets criteria from the description, like:
    val dayCount = "02"
    val testInput = readInput("Day${dayCount}_test")
    val input = readInput("Day${dayCount}")

    println("Day ${dayCount}\n")
    check(part1(testInput) == 150)
    println("Part 1 Test Output: ${part1(testInput)}")
    println("Part 1 Output\n${part1(input)}\n")

    println("Part 2 test")
    check(part2(testInput) == 900)
    println("Part 2 Test Output: ${part2(testInput)}")
    println("Part 2 Output\n${part2(input)}\n")
}
