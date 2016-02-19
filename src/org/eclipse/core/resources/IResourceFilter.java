package org.eclipse.core.resources;

// XAMARIN: Used in ResourceManager to improve resource loading performance
public interface IResourceFilter {
	boolean matches (IResource res);
}
