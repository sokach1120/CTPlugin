package com.demoDomain.teamcity.demoPlugin;

import javax.annotation.Nullable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import jetbrains.buildServer.controllers.BaseController;
import jetbrains.buildServer.web.openapi.PluginDescriptor;
import jetbrains.buildServer.web.openapi.WebControllerManager;
import jetbrains.buildServer.vcs.BuildPatchPolicy;
import jetbrains.buildServer.vcs.CollectChangesPolicy;
import jetbrains.buildServer.vcs.VcsExtension;
import jetbrains.buildServer.vcs.VcsFileContentProvider;
import jetbrains.buildServer.vcs.VcsSupportContext;
import jetbrains.buildServer.vcs.VcsSupportCore;

public class AppServer extends BaseController {
    private PluginDescriptor myDescriptor;

    public AppServer(WebControllerManager manager, PluginDescriptor descriptor) {
        manager.registerController("/demoPlugin.html", this);
        myDescriptor = descriptor;
    }
}