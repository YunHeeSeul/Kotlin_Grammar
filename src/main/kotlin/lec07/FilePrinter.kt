package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    //2. checked/unchecked exception
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }


    //3. try with resources
    fun readFile1(path: String){
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}