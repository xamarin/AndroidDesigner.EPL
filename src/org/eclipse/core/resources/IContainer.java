package org.eclipse.core.resources;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public interface IContainer extends IResource {

	IResource[] members() throws CoreException;

	IFile getFile(IPath path);

	IFolder getFolder(Path path);
}
