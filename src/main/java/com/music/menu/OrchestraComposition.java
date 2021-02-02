package com.music.menu;

import com.music.event.Orchestra;
import com.music.instrument.*;
import com.music.utils.JsonExec;
import org.apache.log4j.Logger;

public class OrchestraComposition {
    private static final Logger LOGGER = Logger.getLogger(OrchestraComposition.class);
    static JsonExec jsonExec = new JsonExec();

    public static void createOrchestra(){
        LOGGER.info("Created Orchestra");
        Orchestra orchestra = new Orchestra();

        KeyboardInstrument piano1 = new Piano("Steinway & Sons", 75000,"white");
        KeyboardInstrument piano2 = new Piano("Steinway & Sons", 73000,"red");
        KeyboardInstrument synthesizer = new Synthesizer("Yamaha", 4755, true);


        orchestra.addKeyboardInstrument(piano1);
        orchestra.addKeyboardInstrument(piano2);
        orchestra.addKeyboardInstrument(synthesizer);

        orchestra.printInfo();
        jsonExec.convertJavaToJsonFile(orchestra, "orchestra.json");


    }
}
