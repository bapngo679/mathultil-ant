/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tida.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //21! thì vượt kiểu Long = 18 con số 0
    //ta thí nghiệm n! với n = 0..20 -> đủ kiểu long
    //n! = 1 x 2 x 3 x ... x n
    //không có giai thừa âm
    //21! tràn long, do đó n chỉ áp dụng 0..20
    //0! = 1! = 1; quy ước 0! = 1
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0..20!");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        //sure n nằm từ 0..20 rồi nên tính thôi.
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
