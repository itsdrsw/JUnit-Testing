package com.example.juniit_testing

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest { //deklarasi sebuah kelas Kotlin bernama 'ExampleUnitTest'
    @Test //anotasi JUnit yang menandakan metode pengujian (unit test).
    fun addition_isCorrect() {  //method pengujian

        //assertEquals adalah metode yang membandingkan dua nilai
        assertEquals(10, 8 + 2)
        /**
        Jika hasil ekspresi sebelah kanan (8+2) sama dengan 4, maka
        pengujian akan berhasil; jika tidak, maka pengujian akan gagal.
        */
    }
}