import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
//    var str : String = "안녕하세요"
//
//    if(str.equals("안녕하세요")){
//        println("같은 문장 입니다.")
//    }
//    else
//        println("다른 문장 입니다.")
    ////////////////////////////////////////////////////////////////////////////////

    var now : Date = Date()
    var sFormat : SimpleDateFormat

    sFormat = SimpleDateFormat("yyyyMMdd")
    println(sFormat.format(now)) // 20230722 형식

    sFormat =SimpleDateFormat("HH:mm:ss")
    println(sFormat.format(now)) // 15:42:58 형식

}