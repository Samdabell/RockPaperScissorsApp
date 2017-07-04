package com.example.sam.rockpaperscissors;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 04/07/2017.
 */

public class ComputerTest {

    @Test
    public void moveTest() throws Exception {
        Computer computer = new Computer();
        Computer spyComputer = Mockito.spy(computer);
        Mockito.when(spyComputer.getMove()).thenReturn("Rock");
        assertEquals("Rock", spyComputer.getMove());
    }
}
