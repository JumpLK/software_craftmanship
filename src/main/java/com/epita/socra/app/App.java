package com.epita.socra.app;


import com.epita.socra.app.tools.*;

import javax.swing.tree.RowMapper;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    public String convert(String name) {
        if (name.equals("10"))
            return "X";
        if (name.equals("1"))
            return "I";
        if (name.equals("5"))
            return "V";
        if (name.equals("50"))
            return "L";
        if (name.equals("100"))
            return "C";
        if (name.equals("500"))
            return "D";
        if (name.equals("1000"))
            return "M";
        return name;

    }

    public void run(){
        adapter.write("Give me your number !!!!");
        String name = adapter.read();
        Roman ct = new Roman();
        adapter.write("Your converted number is " + ct.convertor(name) + " !");
    }
}
