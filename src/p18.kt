fun main(){

    println("Create Array-1 by using arrayOf() method:")
    val a1=arrayOf(10,90,60,80,100)
    println(a1.contentToString())
    println()

    println("Create Array-2 by using Array<>():")
    val a2=Array<Int>(5){0}
    println(a2.contentToString())
    println()

    println("Create Array-3 by using Array<>() and lambda function:")
    val a3=Array<Int>(8){i->i}
    println(a3.contentToString())
    println()

    println("Create Array-4 by using IntArray():")
    val a4=IntArray(5)
    println(a4.contentToString())
    println()

    println("Create Array-5 by using intArrayOf():")
    val a5=intArrayOf(12,10,5,18,19)
    println(a5.contentToString())
    println()

    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    val a6=arrayOf(
        intArrayOf(1,3),
        intArrayOf(4,5),
        intArrayOf(6,7)
    )
    println(a6.contentDeepToString())
    println()

    println("Please enter Array value:")
    val a=IntArray(5)

    for(i in 0 until 5){
        print("a["+i+"]=")
        a[i]=readln().toInt()
    }

    println("Entered Array:")
    println(a.contentToString())
    println()

    println("*".repeat(45)+"With Built-in Function"+"*".repeat(45))

    val b=a.copyOf()

    println("After sorting by built-in function:")
    b.sort()
    println(b.contentToString())
    println()

    println("*".repeat(44)+"Without Built-in Function"+"*".repeat(45))

    val c=a.copyOf()

    println("Before Sorting:")
    println(c.contentToString())
    println()

    for(i in 0 until c.size){

        for(j in 0 until c.size-1-i){

            if(c[j]>c[j+1]){

                val temp=c[j]
                c[j]=c[j+1]
                c[j+1]=temp
            }
        }
    }

    println("After Sorting without built-in function:")
    println(c.contentToString())
    println()
}