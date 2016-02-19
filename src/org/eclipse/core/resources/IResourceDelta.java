package org.eclipse.core.resources;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public interface IResourceDelta {

	int ADDED = 1;
	int CHANGED = 2;
	int REMOVED = 4;
	int OPEN = 8;
	int MOVED_FROM = 16;
	
	IResource getResource();
	int getKind();
	IMarkerDelta[] getMarkerDeltas();
	int getFlags();
	IPath getMovedFromPath();
	void accept(IResourceDeltaVisitor visitor) throws CoreException;
	IResourceDelta[] getAffectedChildren();

}
