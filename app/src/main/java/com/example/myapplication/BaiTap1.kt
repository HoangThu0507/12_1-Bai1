package com.example.myapplication

import java.util.*
import kotlin.collections.ArrayList


class BaiTap1 {
    companion object{
        fun Nhap(): Int {
            var n: Int
            var k: Int
            var abc = 0
            var list: ArrayList<Int> = ArrayList()
            var scanner = Scanner(System.`in`)
           // do{
                print("Nhập số cốc: ")
                n = scanner.nextInt()
                print("Nhập lượng nước: ")
                k = scanner.nextInt()
            while (n< 0 || k<0) {
                println("Phải nhập số lớn hơn 0")
                System.out.print("Nhập số cốc: ")
                n = scanner.nextInt()
                print("Nhập lượng nước: ")
                k = scanner.nextInt()
            }
                return if (n.compareTo(k) >= 0) {
                    1
                } else {
                    for (i in n downTo 1) {
                        if(i.compareTo(k) <=0){
                            k -=  i
                            abc++
                            list.add(i)
                        }
                    }
                    if (k == 0){
                        println("Các cốc dùng đến: "+ list.reversed().toString())
                        abc
                    } else {
                        println("Không có cốc thỏa mãn")
                        0
                    }
                }
        }
    }
}
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    do{
        println("1.Nhập mới")
        println("2.Thoát")
        print("Nhập lựa chọn: ")
        var chon: Int = scanner.nextInt()
        when(chon){
            1 -> println("Số cốc cần dùng: " + BaiTap1.Nhap())
        }
    }while (chon != 2)
}
