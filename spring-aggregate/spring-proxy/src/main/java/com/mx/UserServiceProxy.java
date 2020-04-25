package com.mx;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    UserServiceProxy(){

    }

    UserServiceProxy(UserServiceImpl userService){
        this.userService = userService;
    }

    public void add() {
        log();
        userService.add();
    }

    public void delete() {
        log();
        userService.delete();
    }

    public void query() {
        log();
        userService.query();
    }

    public void update() {
        log();
        userService.update();
    }

    private void log(){
        System.out.println("before use");
    }
}
