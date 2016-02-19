package org.eclipse.core.resources;

public interface IResourceChangeEvent {

	int POST_CHANGE = 0;
	int PRE_DELETE = 0;
	IResource getResource();
	int getType();
	IResourceDelta getDelta();

}
