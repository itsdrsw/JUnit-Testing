package com.example.juniit_testing

import org.junit.Assert //mengimpor kelas-kelas yang diperlukan dari pustaka JUnit
import org.junit.Test //mengimpor anotasi Test dari pustaka JUnit

internal class SampleTest { //mendeklarasikan kelas dan keyword 'internal' berarti kelas ini dapat diakses oleh kode dalam modul yang sama
    private val testSample: Sample = Sample() //membuat objek Sample() dari kelas Sample

    @Test //anotasi method pengujian
    fun testSum(){ //method ini melakukan pengujian pada method sum dari kelas Sample.
        val expected = 90 //inisiasi variabel expected
        Assert.assertEquals(expected, testSample.sum(80, 10))
        /**
        pernyataan pengujian aktual, method assertEquals dari kelas Assert digunakan untuk
        memeriksa apakah hasil yang diharapkan (expected) sama dengan hasil yang dikembalikan
        oleh pemanggilan method testSample.sum(80, 10). Jika hasilnya sama, pengujian akan lulus.
        Jika tidak, pengujian akan gagal.
         */
    }
}