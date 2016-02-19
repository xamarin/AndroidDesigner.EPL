package org.eclipse.core.runtime;

import java.io.File;

public class Path implements IPath {

	String path;
	
	public Path(String name) {
		this.path = name;
	}

	@Override
	public IPath removeFirstSegments(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int segmentCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String segment(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toOSString() {
		// TODO Auto-generated method stub
		return path;
	}

	public String toString () {
		return path;
	}
	
	public boolean equals (Object ob) {
		return (ob instanceof IPath) && ((IPath)ob).toOSString().equals(toOSString());
	}

	@Override
	public String getFileExtension() {
		int i = path.lastIndexOf('.');
		if (i != -1)
			return path.substring(i + 1);
		else
			return "";
	}
}
