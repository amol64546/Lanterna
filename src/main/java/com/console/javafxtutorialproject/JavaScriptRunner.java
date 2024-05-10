package com.console.javafxtutorialproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class JavaScriptRunner {
    public static void main(String[] args) {
        String filePath = "src/main/resources/script.js";

        // Read the content of the JavaScript file
        String scriptContent;
        try {
            scriptContent = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            System.err.println("Error reading JavaScript file: " + e.getMessage());
            return;
        }

        // Create a GraalVM context
        try (Context context = Context.create()) {
            // Execute JavaScript code from file
            Value result = context.eval("js", scriptContent);

            // Get the result of JavaScript execution
            int sum = result.asInt();
            System.out.println("Result: " + sum);
        } catch (Exception e) {
            System.err.println("Error executing JavaScript: " + e.getMessage());
        }
    }
}
