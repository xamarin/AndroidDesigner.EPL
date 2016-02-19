package org.eclipse.core.resources;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import com.android.io.IAbstractFolder;

public interface IProject {
	
	IProject[] getFullLibraryProjects();
	
	IAbstractFolder getResourcesFolder();

	public Object getName();

	public boolean hasNature(String natureDefault) throws CoreException;

	public boolean isOpen();

	public void setPersistentProperty(QualifiedName needAapt, String needsAapt) throws CoreException;

	IFolder getFolder(String fdResources);
}
