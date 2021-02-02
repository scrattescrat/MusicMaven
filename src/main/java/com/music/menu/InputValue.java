package com.music.menu;

import com.music.event.MyException;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class InputValue {
    private static final Logger LOGGER = Logger.getLogger(InputValue.class);



    public static int inputVaue() throws MyException {
        LOGGER.info("Input value required");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new MyException(e.getMessage());
        }
    }
}
