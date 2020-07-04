package com.example.findnumber.utility;

import java.util.ArrayList;

public enum MenuOptions {
      start(1,"Start"), point(2,"Show Points"), exit(3,"Exit");
      
      private Integer id;
      private String meaning;
      
      MenuOptions(Integer id,String meaning){
          this.id = id;
          this.meaning = meaning;
      }
      
      public String getMeaning(){
          return meaning;
      }
      
      public Integer getId(){
          return id;
      }
      
      public static MenuOptions getItemById(Integer id){
          MenuOptions[] menuOptios = MenuOptions.values();
          for(MenuOptions mo : menuOptios){
              if(id.equals(mo.getId())){
                  return mo;
              }
          }
          
          return null;
      }
      
      public static ArrayList<MenuOptions> showMenuItems(){
          ArrayList<MenuOptions> items = new ArrayList<>();
          
          MenuOptions[] menuOptions = MenuOptions.values();
          for(MenuOptions mo : menuOptions){
              System.out.println(mo.getId() + ". " + mo.getMeaning());
          }
          
          return items;
      }
}
