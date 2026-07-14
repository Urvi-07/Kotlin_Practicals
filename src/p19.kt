fun main(){

    val a1=arrayListOf(57,90,10,13,14)

    for(i in a1.indices)
    {
        println("a["+i+"]="+a1[i])
    }

    var max=a1[0]

    for(i in a1)
    {
        if(i>max)
            max=i
    }

    println("Largest element ="+max)
}