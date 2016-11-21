package com.jfinal.config;


import com.jfinal.controller.BlogController;
import com.jfinal.controller.IndexController;

/**
 * Created by hasee on 2016/11/20.
 */
public class MyRoute extends Routes
{
    @Override
    public void config() {
        add("/", IndexController.class, "/index");
        //第一个参数名是调用的方法，默认为index，可以使多层目录，
        //如果有参数用/xxx-xxx  -号分隔，第三个参数是视图路径，默认和第一个参数相同
        add("/blog", BlogController.class);
    }
}
