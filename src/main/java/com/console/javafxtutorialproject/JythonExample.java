package com.console.javafxtutorialproject;

import org.python.util.PythonInterpreter;

public class JythonExample {
    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();

        // Execute a simple Python statement
        interpreter.execfile("src/main/resources/script.py");
    }
}
