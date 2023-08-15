import arrow.core.Either
import arrow.core.raise.either

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val either:Either<String, Int> = Either.Left("this is left")
    val either2:Either<String, Int> = Either.Right(10000)

    println(either)
    println(either2)
}