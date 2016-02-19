package org.eclipse.core.resources;

public interface IFolder extends IResource, IContainer {

	IFile getFile(String name);
	
	IFolder getFolder(String name);
}
