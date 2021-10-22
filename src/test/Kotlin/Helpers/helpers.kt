package Helpers


import java.lang.InterruptedException

class helpers {
    fun sleepSeconds(seconds: Int) {
        try {
            Thread.sleep((seconds * 1000).toLong())
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}