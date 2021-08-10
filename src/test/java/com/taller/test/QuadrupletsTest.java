package com.taller.test;

import org.junit.jupiter.api.Test;

public class QuadrupletsTest {

    @Test
    public void testFirst(){
        QuadrupletsArraysMain.execute(new int[]{1, 2, 3, 4, 5, -5, 6, -6}, 5);
    }

    @Test
    public void testSecond(){
        QuadrupletsArraysMain.execute(new int[]{5, -5, -2, 2, 3, -3}, 0);
    }

    @Test
    public void testThird(){
        QuadrupletsArraysMain.execute(new int[]{-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 4);
    }

    @Test
    public void testFourth(){
        QuadrupletsArraysMain.execute(new int[]{ -1, 22, 18, 4, 7, 11, 2, -5, -3}, 30);
    }

    @Test
    public void testFifth(){
        QuadrupletsArraysMain.execute(new int[]{10, 12, 18, 9, -4, -5, 12, -14}, 200);
    }


}
