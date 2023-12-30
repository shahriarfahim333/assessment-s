import java.util.Scanner
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    var mark:Int = reader.nextInt()

    if(mark>=100){
        println("A")
    }else if(mark>=80) {
        println("B")
    }else if(mark>=70) {
        println("C")
    }else if(mark>=60) {
        println("F")
    }else {
        println("tmi FAIL, ei next... ")
    }
}