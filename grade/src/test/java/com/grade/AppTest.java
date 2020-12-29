package com.grade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import com.grade.App;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp_input1_should_correct() {
        String[] args = null;
        ByteArrayInputStream testIn = new ByteArrayInputStream("1".getBytes());
        System.setIn(testIn);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.main(args);
        assertEquals("Enter the score = The grade of 1 is F\r\n", outContent.toString());
    }

    @Test
    void testApp_inputX_should_numberFormatError() {
        String[] args = null;
        ByteArrayInputStream testIn = new ByteArrayInputStream("X".getBytes());
        System.setIn(testIn);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.main(args);
        assertEquals("Enter the score = Not an integer!\r\n", outContent.toString());
    }

    @Test
    void testLetterGrade_gradeEqual95_should_returnA() {
        assertEquals(App.letterGrade(95), 'A');
    }
    @Test
    void testLetterGrade_gradeEqual85_should_returnB() {
        assertEquals(App.letterGrade(85), 'B');
    }
    @Test
    void testLetterGrade_gradeEqual75_should_returnC() {
        assertEquals(App.letterGrade(75), 'C');
    }
    @Test
    void testLetterGrade_gradeEqual65_should_returnD() {
        assertEquals(App.letterGrade(65), 'D');
    }
    @Test
    void testLetterGrade_gradeEqual30_should_returnF() {
        assertEquals(App.letterGrade(30), 'F');
    }
    @Test
    void testLetterGrade_gradeEqualMinus50_should_returnX() {
        assertEquals(App.letterGrade(-50), 'X');
    }
    @Test
    void testLetterGrade_gradeEqual150_should_returnX() {
        assertEquals(App.letterGrade(150), 'X');
    }

    @Test
    void testLetterGrade_gradeEqual100_should_returnA() {
        assertEquals(App.letterGrade(100), 'A');
    }
    @Test
    void testLetterGrade_gradeEqual99_should_returnA() {
        assertEquals(App.letterGrade(99), 'A');
    }
    @Test
    void testLetterGrade_gradeEqual101_should_returnX() {
        assertEquals(App.letterGrade(101), 'X');
    }
    @Test
    void testLetterGrade_gradeEqual90_should_returnA() {
        assertEquals(App.letterGrade(90), 'A');
    }
    @Test
    void testLetterGrade_gradeEqual91_should_returnA() {
        assertEquals(App.letterGrade(91), 'A');
    }
    @Test
    void testLetterGrade_gradeEqual89_should_returnB() {
        assertEquals(App.letterGrade(89), 'B');
    }
    @Test
    void testLetterGrade_gradeEqual80_should_returnB() {
        assertEquals(App.letterGrade(80), 'B');
    }
    @Test
    void testLetterGrade_gradeEqual81_should_returnB() {
        assertEquals(App.letterGrade(81), 'B');
    }
    @Test
    void testLetterGrade_gradeEqual79_should_returnC() {
        assertEquals(App.letterGrade(79), 'C');
    }
    @Test
    void testLetterGrade_gradeEqual70_should_returnC() {
        assertEquals(App.letterGrade(70), 'C');
    }
    @Test
    void testLetterGrade_gradeEqual71_should_returnC() {
        assertEquals(App.letterGrade(71), 'C');
    }
    @Test
    void testLetterGrade_gradeEqual69_should_returnD() {
        assertEquals(App.letterGrade(69), 'D');
    }
    @Test
    void testLetterGrade_gradeEqual60_should_returnD() {
        assertEquals(App.letterGrade(60), 'D');
    }
    @Test
    void testLetterGrade_gradeEqual61_should_returnD() {
        assertEquals(App.letterGrade(61), 'D');
    }
    @Test
    void testLetterGrade_gradeEqual59_should_returnF() {
        assertEquals(App.letterGrade(59), 'F');
    }
    @Test
    void testLetterGrade_gradeEqual0_should_returnF() {
        assertEquals(App.letterGrade(0), 'F');
    }
    @Test
    void testLetterGrade_gradeEqual1_should_returnF() {
        assertEquals(App.letterGrade(1), 'F');
    }
    @Test
    void testLetterGrade_gradeEqualMinus1_should_returnX() {
        assertEquals(App.letterGrade(-1), 'X');
    }
}
