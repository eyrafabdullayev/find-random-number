package com.example.findnumber;

import com.example.findnumber.config.Initialization;
import com.example.findnumber.utility.MenuUtil;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Initialization.configInitializer();
        //save
        Initialization.refreshConfig();
        //Welcome
        System.out.println("Hello, " + Initialization.config.getCompetitor().getName());
        
        MenuUtil.menuInfite();
    }
}
