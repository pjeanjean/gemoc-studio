package org.eclipse.gemoc.example.k3fsm.mep.trace.server

import com.google.inject.AbstractModule
import java.util.concurrent.ExecutorService
import org.eclipse.xtext.ide.ExecutorServiceProvider
import org.eclipse.xtext.ide.server.DefaultProjectDescriptionFactory
import org.eclipse.xtext.ide.server.IProjectDescriptionFactory
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.ResourceServiceProviderServiceLoader
import org.eclipse.xtext.resource.containers.ProjectDescriptionBasedContainerManager
import org.eclipse.xtext.ide.server.IMultiRootWorkspaceConfigFactory
import org.eclipse.xtext.ide.server.MultiRootWorkspaceConfigFactory

class CustomServerModule extends AbstractModule {
	
	 override protected configure() {
	 	
	 	binder.bind(ExecutorService).toProvider(ExecutorServiceProvider)
        bind(IResourceServiceProvider.Registry).toProvider(ResourceServiceProviderServiceLoader)
        bind(IMultiRootWorkspaceConfigFactory).to(MultiRootWorkspaceConfigFactory)
        bind(IProjectDescriptionFactory).to(DefaultProjectDescriptionFactory)
        bind(IContainer.Manager).to(ProjectDescriptionBasedContainerManager)
       // bind(IRenameService).to(RenameService)
	 }
}
