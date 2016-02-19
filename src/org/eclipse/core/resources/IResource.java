package org.eclipse.core.resources;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public interface IResource {

	public static final int FILE = 1;
	public static final int FOLDER = 2;
	public static final int PROJECT = 3;
	public static final int DEPTH_ZERO = 0;
	public static final int DEPTH_ONE = 1;
	public static final int FORCE = 1;

	String getName();

	IPath getLocation();

	public IContainer getParent();

	public IPath getFullPath();

	public int getType();

	public IProject getProject();

	public boolean exists();

	public void deleteMarkers(String markerAaptCompile, boolean b, int depth);

	void delete(boolean b, Object monitor) throws CoreException;

}
