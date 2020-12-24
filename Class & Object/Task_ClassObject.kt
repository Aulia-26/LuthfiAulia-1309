fun main () {
    //variabel
    val firstName1 = "andi"
    val lastName1 = "budiman"
    val age1 = 34

    println(firstName1)
    println(lastName1)
    println(age1)

    val firstName2 = "rudi"
    val lastName2 = "setiawan"
    val age2 = 25
    println(firstName2)
    println(lastName2)
    println(age2)

    //array
    val firstName = arrayListOf<String>()
    val lastName = arrayListOf<String>()
    val age = arrayListOf<Int>()

    firstName.add("Brandon")
    lastName.add("Salim")
    age.add(17)

    firstName.add("ciara")
    lastName.add("amberlee")
    age.add(19)

    for(first in firstName){
        println(first)
    }
    for(last in lastName) {
        println(last)
    }
    for(a in age){
        println(a)
    }

    //array 2
    val andiArray = arrayListOf<Any>()
    andiArray.add("Andi")
    andiArray.add("Budiman")
    andiArray.add("34")
    for (andi in andiArray){
        println(andi)
    }
    //array 3
    val mhsArray = arrayListOf<ArrayList<Any>>()
    mhsArray.add(andiArray)
    mhsArray.add(arrayListOf("rudi", "setiawan", 25))
    for (item in mhsArray){
        for (i in item){
            println(i)
        }
    }

    //data class
    val andi = user("andi", "budiman", 34)
    val rudi = user(age = 25, lastName = "setiawan", firstName = "rudi")
    val dedi = user()
    dedi.age =35
    dedi.firstName ="dedi"

    val andi2 = andi.copy(age = 40)

    println(andi)
    println(rudi)
    println(dedi)

    println(andi.lastName)
    println(andi2)

    //data class array
    val mhsAmikom = arrayListOf<user>()
    mhsAmikom.add(andi)
    mhsAmikom.add(rudi)
    mhsAmikom.add(dedi)

    mhsAmikom.add(user("feerdi", "setiawan", 45))

    for (mhs in mhsAmikom){
        println(mhs)
    }

}