fun main() {
    val songFunction = Song("Dima","Dallas", 2023,3000)
    songFunction.printDescription()
    println(songFunction.isPopular)
}

class Song (val title:String, val artist:String, val yearPublished:Int, val playCount: Int){
   val isPopular:Boolean
    	get()= playCount >= 1000
    fun printDescription(){
        println("$title, performed by $artist, was relesed in $yearPublished.")
    }
    
}
