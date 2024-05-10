package com.console.javafxtutorialproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bashRunner {

  public static void main(String[] args) throws IOException, InterruptedException {

    BufferedReader br = new BufferedReader(new FileReader("src/main/resources/script.sh"));
    String line;
    while ((line = br.readLine()) != null) {
      if (line.startsWith("#") || line.isEmpty()) {
        continue;
      }
      executeCommand(line);
    }
    br.close();


  }

  private static void executeCommand(String line) throws IOException, InterruptedException {

    ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "-c", line);
    processBuilder.inheritIO();
    Process process = processBuilder.start();
    int exitCode = process.waitFor();
  }


}

