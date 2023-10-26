fun abs(n: Int): Int =
    if (n < 0) -n else n

fun factorial(n: Int): Int =
    if (n > 1) factorial(n - 1) * n else n

fun factorial2(i: Int): Int {
    //    tail recursion is a type of recursive function which recursion only happens at the last of the function.
//    something like `1 + rec(5)` is not tail recursive function since the output of recursion is not the final
//    operation of the function (1 + recursion output)
//    tailrec makes recursive function unrolled to produce same byte code as while loop
    tailrec fun inner(n: Int, acc: Int): Int =
        if (n <= 1) acc else inner(n - 1, n * acc)

    return inner(i, 1)
}

fun fib(i: Int): Int {
    tailrec fun inner(n: Int, a1: Int, a2: Int): Int =
        if (n >= i - 1) a1 + a2 else inner(n + 1, a2, a1 + a2)

    return inner(1, 0, 1)
}