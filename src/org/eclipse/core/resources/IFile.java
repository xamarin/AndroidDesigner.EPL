package org.eclipse.core.resources;

import java.io.InputStream;

import org.eclipse.core.runtime.CoreException;

public interface IFile extends IResource {

	boolean isSynchronized(String depthZero);

	InputStream getContents() throws CoreException;

	void setContents(InputStream source, int flags, Object object) throws CoreException;

	long getModificationStamp();

}
