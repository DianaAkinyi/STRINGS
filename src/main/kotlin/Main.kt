fun main (){
    school("akirachix")
    println(nameAge("Diana",24))
    println(words("enough"))
    println(print("diana"))

}
fun school(school:String){
    var name ="akirachix"
    println(name[0])
    println(name[2])
    println(name[3])
}
fun nameAge(name:String,age:Int):String {
    var x = "name"
    var y = age
    return ("Hi,my name is $name and I am $age years old")

}
fun words(sent:String):Int{
    return(sent.length)
}
fun print(names:String) {
    var name = "diana"
    var name2 ="diana"
    if (name.equals("diana")) {
        println("This is me!")
    } else {
        println("I don't know who that is")
    }
    if (name2.equals("diana")){
        println("i don't know who this is")
    } else{
        println("This is me!")
    }
}