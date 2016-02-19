package org.eclipse.core.resources;

import org.eclipse.core.runtime.IPath;

public interface IWorkspaceRoot {

	IResource findMember(IPath outputLocation);

}
