package com.music.main;

import com.music.event.MyException;
import com.music.instrument.*;
import com.music.menu.Menu;

public class Executor {

    public static void main(String[] args) throws MyException {
        Menu menu = new Menu();
        menu.menuSelection();

    }

}
