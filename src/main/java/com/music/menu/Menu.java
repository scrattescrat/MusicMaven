package com.music.menu;

import com.music.event.MyException;
import org.apache.log4j.Logger;

public class Menu {

    private static final Logger LOGGER = Logger.getLogger(Menu.class);

    public void menuSelection() throws MyException {
        LOGGER.info("Welcome");

        System.out.println("----- Welcome to the Theatre -----\nPlease, choose the action:");
        System.out.println("Press 1 - See the composition of the orchestra.\nPress 2 - Book a ticket.\nPress 3 - Return a ticket");
        System.out.println("Please, make your choice");

        try {

        int selection = InputValue.inputVaue();
        switch (selection){
            case 1:
                OrchestraComposition.createOrchestra();
                break;
            case 2:
                Ticket.getTicket();
                break;
            case 3:
                Ticket.returnTicket();
                break;
            default:
                throw new MyException("Wrong number");
                        }
        }catch (MyException e){
            LOGGER.error("Wrong number: " + e.getMessage());
        }



    }
}
