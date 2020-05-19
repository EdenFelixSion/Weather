package com.example.weathersystem;


import java.util.*;
import java.io.*;

public class User {
    private int id;
    private String password;
    ArrayList<City> favorate;

    BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

    public int getID(){
        return this.id;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String newPassword){
        password = newPassword;
    }

    public void logIn() throws NumberFormatException, IOException{
        int userEnterID;
        userEnterID = Integer.parseInt(br.readLine());
        String userEnterPassword;
        userEnterPassword = br.readLine();
//        for(int i = 0;i<10;i++){
//            if(UserDataBase.getUser(userEnterID).getPassword().equals(userEnterPassword)
//                    &&UserDataBase.getUser(userEnterID).getPassword()!=null){
//                System.out.println("登录成功");
//            }else{
//                System.out.println("用户不存在或密码错误！");
//            }
//        }
    }

    public void logOut(){

    }

    public void register() throws NumberFormatException, IOException{
        int newId;
        String newPassword;
        String newPasswords;
        newId = Integer.parseInt(br.readLine());
        newPassword = br.readLine();
        newPasswords = br.readLine();

//        if(UserDataBase.getUser(newId).getPassword()!=null
//                &&newPassword.equals(newPasswords)
//                &&newPassword!=null){
//            System.out.println("注册成功");
//        }else{
//            System.out.println("注册失败，id已存在或密码为空或两次密码不同");
//        }
    }


    public void passwordRecovery(){

    }

    public User(int initialId,String initialPassword){
        this.id=initialId;
        this.password=initialPassword;
        ArrayList<City> favorate = new ArrayList<City>();
    }

    public boolean equals(Object object){
        return object instanceof User &&((User)object).getID()==this.getID()
                && getPassword()==(((User) object).getPassword());
    }

    public String toString(){
        return id + " " + favorate;
    }

    public ArrayList getFavorate(){
        return favorate;
    }

    public void addFavorate(City newFavorate){
        favorate.add(newFavorate);
    }

    public void deleteFavorate(City deleteFavorate){
        for(int i = 0;i<favorate.size();i++) {
            if(favorate.get(i).equals(deleteFavorate)) {
                favorate.remove(i);
                i--;
            }
        }
    }

    public void fileFavorate(ArrayList<City> favorate){
//        UserDataBase.setFavorate(this.favorate,this.id);
    }

    public ArrayList<City> readFavorate(){
        ArrayList<City> favorate = new ArrayList<City>();
//        favorate = UserDataBase.getFavorate(this.id);
        return favorate;
    }


}

