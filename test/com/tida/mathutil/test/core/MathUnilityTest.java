/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tida.mathutil.test.core;

import com.tida.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUnilityTest {

    @Test //Biến hàm ở dưới thành public static void main()
    //Hình thức của framework, dàng khung viết code
    //Viết code phải theo định dạng yêu cầu trước
    public void testRedGreenSign() {
        Assert.assertEquals(6789, 6789);

    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case 1: test getFactorial() with n = 0;
        //expected: 1
        //test hàm getFactorial() với n = 0, hy vọng trả về 1.
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);

        //Test case 2: test getFactorial() with  n = 1;
        //expected: 1
        //test hàm getFactorial với n = 1, hi vọng trả về 1, tức là 1! = 1
        Assert.assertEquals(1, MathUtility.getFactorial(1));

        //Test case 3: test getFactorial() with  n = 6;
        //expected: 720
        //test hàm getFactorial với n = 6, hi vọng trả về 720, tức là 6! = 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));

        Assert.assertEquals(120, MathUtility.getFactorial(5));

        //VIẾT KIỂU ASSERTQUALS(EXCEPTED, ACTUAL)
        // LẶP ĐI LẶP LẠI -> CODE BỐC MÙI BAD SMELL
        //NHƯỢC ĐIỂM ĐOẠN CODE TRÊN:
        //Trộn lẫn giữa bệnh so sánh và các đa ta dùng để test
        //Vì lộn luẫn giữa lệnh so sánh và các dât dùng để test case
        //nguyên lí thuốc trừ sâu xuất hiện là sớm muộn
        //TA SẼ FIX CODE BỐC MÙI LẶP ĐI LẶP LẠI BẰNG KĨ THUẬT MỚI
        //DDT - DATA DRIVEN TESTING
    }

    //Hàm getFactorial() còn đc thiết kế rằng nếu đưa tham số không đúng chuẩn n<0 hoặc n > 20 thì hàm đc thiết kế
    //sẽ ném ra ngoại lệ, nếu đưa n = -5 thì sẽ nhận về expected là Exception
    //Dùng Junit để xem hàm có ném ra ngoại lệ như thiết kế ko
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowException() {
        //nguyên tác kiểm thử so xánh excepted và actual
        //Test case 4: test getFactorial()<0
        //illegal argument excception có được ném ra không
        //Junit 4 ko có hàm assert() exception
        MathUtility.getFactorial(-5);
        //Nếu chỉ viết lệnh này đứng một mình thì có nghĩa là ta chưa bắt, chưa đo lường, so sánh liệu rằng có
        //ngoại lệ như kì vọng hay không.
        //xanh đỏ trong tình huống này không phản ánh 1 ý đúng, ta phải đo xem ngoại lệ đã có chưa, nếu có rồi thì xanh
        //chưa có thì màu đỏ
    }
}
