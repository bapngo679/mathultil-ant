/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tida.mathutuil.main;

import com.tida.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenWrongArgumentThrowsException();
    }
    
    //Dev phải có trách nhiệm với những hàm/method mình viết ra,
    //Tức là đảm bảo rằng hàm chạy đúng như thiết kế
    //nếu đưa n < 0 hoặc n > 20 - ném ngoại lệ
    //nếu n = 0..20 -> tính đúng n!
    //TA SẼ KIỂM THỬ HÀM ĐÚNG NHƯ THIẾT KẾ HAY KHÔNG?
    //KIỂM THỬ - DÙNG THỬ - MÔ PHỎNG CÁC TÌNH HUỐNG - CASE
    //HÀM SẼ ĐƯỢC DÙNG TRONG TƯƠNG LAI
    //hàm sẽ được dùng theo 2 cách dựa theo thiết kế
    //đưa data tử tế n từ 0..20
    //đưa data cà chớn n < 0 hoặc n > 20
    
    //tên hàm kiểm thử viết theo cú pháp con lạc đà - camel Case nota
    //Và phải mang ý nghĩa/ mục đích kiểm thử
    
    //Kiểm thử các tình huống n đưa vào kiểu cà chớn!!!
    public static void testFactorialGivenWrongArgumentThrowsException(){
        //Test case 6: test getFactorial() with n = -1;
        //Expected value: an Illegal Argument Exception is thrown
        //nếu đưa n = -1 thì hàm sẽ đập vào mặt user/người xài
        //hàm 1 ngoại lệ
        System.err.println("Test -1! expected: Argument Exception is thrown!"
                                            +"| Actual: ");
        MathUtility.getFactorial(-1);
    }
    public static void testFactorialGivenRightArgumentReturnsWell(){
        //Case 1: Test getFactorial() with n = 0
        //Expected value: 1;
        //Kiểm thử coi có đúng 0! = 1 hay không? - 1 tình huống xài hàm
        //1 test case
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n); //gọi hàm tính giai thừa, xem kq trả về
        // so sánh expected và actual
        System.out.println("Test " + n + "! | expected: " + expectedValue
                                   + " | actual: " + actualValue);
    
    
        //Case 2: test getFactorial() with n = 1
        //Expected value: 1;
        //Kiểm thử coi có đúng 1! = 1 hay không?
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n); //gọi hàm tính giai thừa, xem kq trả về
        // so sánh expected và actual
        System.out.println("Test " + n + "! | expected: " + expectedValue
                                   + " | actual: " + actualValue);
        
        //Case 3: test getFactorial() with n = 2
        //Expected value: 2;
        //Kiểm thử coi có đúng 1! = 2 hay không?
        n = 2;
        expectedValue = 2;
        // so sánh expected và actual
        System.out.println("Test " + n + "! | expected: " + expectedValue
                                   + " | actual: " + MathUtility.getFactorial(n));
        
        //Case 4: test getFactorial() with n = 3
        //Expected value: 6;
        //Kiểm thử coi có đúng 3! = 6 hay không?
        n = 3;
        expectedValue = 6;
        // so sánh expected và actual
        System.out.println("Test " + n + "! | expected: " + expectedValue
                                   + " | actual: " + MathUtility.getFactorial(n));
        
        //Case 5: test getFactorial() with n = 4
        //Expected value: 24;
        //Kiểm thử coi có đúng 4! = 24 hay không?
        n = 4;
        expectedValue = 24;
        // so sánh expected và actual
        System.out.println("Test " + n + "! | expected: " + expectedValue
                                   + " | actual: " + MathUtility.getFactorial(n));
        
        
    }
}
