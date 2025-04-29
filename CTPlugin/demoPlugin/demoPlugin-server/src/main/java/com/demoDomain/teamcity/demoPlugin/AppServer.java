package com.demoDomain.teamcity.demoPlugin;

import javax.annotation.Nullable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import jetbrains.buildServer.controllers.BaseController;
import jetbrains.buildServer.web.openapi.PluginDescriptor;
import jetbrains.buildServer.web.openapi.WebControllerManager;

public class AppServer extends BaseController {
    private PluginDescriptor myDescriptor;

    public AppServer(WebControllerManager manager, PluginDescriptor descriptor) {
        manager.registerController("/demoPlugin.html", this);
        myDescriptor = descriptor;
    }

    @Nullable
    @Override
    protected ModelAndView doHandle(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        return new ModelAndView(myDescriptor.getPluginResourcesPath("example.jsp"));
    }
}