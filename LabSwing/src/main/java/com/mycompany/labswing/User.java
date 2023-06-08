/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labswing;


public class User {
    private String userName;
    private String pass;
    private String fName;
//ctrl+space
    public User(String userName, String Pass, String fName) {
        this.userName = userName;
        this.pass = Pass;
        this.fName = fName;
    }
    public boolean macthuser(String userName){
      return  this.userName.contentEquals(userName);
    }
     public boolean matchpass(String pass){
       return this.pass.contentEquals(pass);
    }
    
    
    
}
