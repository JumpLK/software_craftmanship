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
    public void verify_basic_X() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("10");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your Arabic number !!!!");
        verify(mock).write(argThat(message -> message.contains("X")));
    }

    @Test
    public void verify_basic_I() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your Arabic number !!!!");
        verify(mock).write(argThat(message -> message.contains("I")));
    }
    @Test
    public void verify_basic_V() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("5");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your Arabic number !!!!");
        verify(mock).write(argThat(message -> message.contains("V")));
    }
    @Test
    public void verify_basic_L() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("50");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your Arabic number !!!!");
        verify(mock).write(argThat(message -> message.contains("L")));
    }
    @Test
    public void verify_basic_C() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("100");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your Arabic number !!!!");
        verify(mock).write(argThat(message -> message.contains("C")));
    }
    @Test
    public void verify_basic_D() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("500");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your Arabic number !!!!");
        verify(mock).write(argThat(message -> message.contains("D")));
    }
    @Test
    public void verify_basic_M() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1000");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your Arabic number !!!!");
        verify(mock).write(argThat(message -> message.contains("M")));
    }
    @Test
    public void verify_MMCMXCIX() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("2999");
        App app = new App(mock);
        app.run();

        verify(mock).write("Give me your Arabic number !!!!");
        verify(mock).write(argThat(message -> message.contains("MMCMXCIX")));
    }



}
