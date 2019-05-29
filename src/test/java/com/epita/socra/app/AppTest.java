package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */

    @Test
    public void verify_interface_MMCMXCIX() {
        Roman ct = new Roman();
        String ret = ct.convertor("2999");
        assertEquals(ret, "MMCMXCIX");
    }

    @Test
    public void verify_basic_interface_1() {
        Roman ct = new Roman();
        String ret = ct.convertor("I");
        assertEquals(ret, "1");
    }

    @Test
    public void verify_basic_interface_50() {
        Roman ct = new Roman();
        String ret = ct.convertor("L");
        assertEquals(ret, "50");
    }

    @Test
    public void verify_basic_interface_2999() {
        Roman ct = new Roman();
        String ret = ct.convertor("MMCMXCIX");
        assertEquals(ret, "2999");
    }


    @Test
    public void verify_basic_interface_I() {
        Roman ct = new Roman();
        String ret = ct.convertor("1");
        assertEquals(ret, "I");
    }

    @Test
    public void verify_basic_interface_D() {
        Roman ct = new Roman();
        String ret = ct.convertor("500");
        assertEquals(ret, "D");
    }

    @Test
    public void verify_basic_X() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("10");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your number !!!!");
        verify(mock).write(argThat(message -> message.contains("X")));
    }

    @Test
    public void verify_basic_I() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your number !!!!");
        verify(mock).write(argThat(message -> message.contains("I")));
    }
    @Test
    public void verify_basic_V() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("5");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your number !!!!");
        verify(mock).write(argThat(message -> message.contains("V")));
    }
    @Test
    public void verify_basic_L() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("50");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your number !!!!");
        verify(mock).write(argThat(message -> message.contains("L")));
    }
    @Test
    public void verify_basic_C() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("100");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your number !!!!");
        verify(mock).write(argThat(message -> message.contains("C")));
    }
    @Test
    public void verify_basic_D() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("500");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your number !!!!");
        verify(mock).write(argThat(message -> message.contains("D")));
    }
    @Test
    public void verify_basic_M() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1000");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your number !!!!");
        verify(mock).write(argThat(message -> message.contains("M")));
    }
    @Test
    public void verify_MMCMXCIX() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("2999");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your number !!!!");
        verify(mock).write(argThat(message -> message.contains("MMCMXCIX")));
    }


    @Test
    public void verify_basic_1() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("I");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your number !!!!");
        verify(mock).write(argThat(message -> message.contains("1")));
    }

}
