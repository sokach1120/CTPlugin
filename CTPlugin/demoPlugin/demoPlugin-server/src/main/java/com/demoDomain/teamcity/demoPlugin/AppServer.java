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

public class AppServer extends BaseController implements VcsSupportContext {
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

    @Override
    public <T extends VcsExtension> T getVcsExtension(Class<T> extensionClass) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVcsExtension'");
    }

    @Override
    public VcsSupportCore getCore() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCore'");
    }

    @Override
    public VcsFileContentProvider getContentProvider() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getContentProvider'");
    }

    @Override
    public CollectChangesPolicy getCollectChangesPolicy() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCollectChangesPolicy'");
    }

    @Override
    public BuildPatchPolicy getBuildPatchPolicy() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBuildPatchPolicy'");
    }
}