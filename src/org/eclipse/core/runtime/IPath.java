package org.eclipse.core.runtime;

public interface IPath {

	IPath removeFirstSegments(int i);

	int segmentCount();

	String segment(int i);

	String toOSString();

	String getFileExtension();

}
