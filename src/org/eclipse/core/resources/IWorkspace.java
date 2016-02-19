package org.eclipse.core.resources;

public interface IWorkspace {

	void addResourceChangeListener(
			IResourceChangeListener mResourceChangeListener, int i);

	void removeResourceChangeListener(
			IResourceChangeListener mResourceChangeListener);

	IWorkspaceRoot getRoot();

}
