package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class RobotTest {
    private Robot robot;

    @BeforeEach
    void setUp(){
        this.robot = new Robot();
        robot.setCoordinates(new int[] {0,0});
    }

    @AfterEach
    void tearDown(){

    }

    @Test
    void move_ValidInput_ReturnCorrectCoordinates(){
        assertArrayEquals(new int[] {0,3}, robot.move("UUU"));
        assertArrayEquals(new int[] {0,3}, robot.move("URDL"));
        assertArrayEquals(new int[] {0,3}, robot.move("UUDRLLRD"));
        assertArrayEquals(new int[] {0,2}, robot.move("Up Down Left 2xRight Down"));
    }

}