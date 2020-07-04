package com.example.findnumber.utility;

import java.util.Scanner;

public class MenuUtil {

    private static Scanner sc = new Scanner(System.in);

    public static MenuOptions showMenu() {

        //show menu items
        MenuOptions.showMenuItems();

        System.out.print("enter index: ");
        int selectedIndex = sc.nextInt();

        return MenuOptions.getItemById(selectedIndex);
    }

    public static void menuInfite() {
        try {
          
            boolean exit = false;

            while (!exit) {
                
                MenuOptions item = showMenu();
                
                if(item == null){
                    System.out.println("Try to select valid number ..");
                } else switch (item) {
                    case start:
                        CompetitorUtil.start();
                        break;
                    case point:
                        CompetitorUtil.showPoint();
                        break;
                    case exit:
                        exit = true;
                        break;
                }
                 
            }
            
            System.out.println("Good Bye ..");

        } catch (Exception e) {

        }
    }
}
