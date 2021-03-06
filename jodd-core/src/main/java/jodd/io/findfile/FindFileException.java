// Copyright (c) 2003-present, Jodd Team (jodd.org). All Rights Reserved.

package jodd.io.findfile;

import jodd.exception.UncheckedException;

/**
 * Exception during finding files or classes.
 */
public class FindFileException extends UncheckedException {

	public FindFileException(Throwable t) {
		super(t);
	}

	public FindFileException(String message) {
		super(message);
	}

	public FindFileException(String message, Throwable t) {
		super(message, t);
	}
}
