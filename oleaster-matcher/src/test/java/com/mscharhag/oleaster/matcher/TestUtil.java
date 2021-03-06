package com.mscharhag.oleaster.matcher;

public class TestUtil {

	public static void expectAssertionError(Runnable runnable) {
		AssertionError assertionError = null;
		try {
			runnable.run();
		} catch (AssertionError ae) {
			assertionError = ae;
		}
		if (assertionError == null) {
			throw new AssertionError("passed code block did not throw an AssertionError");
		}
	}

	public static Exception catchException(Runnable runnable) {
		Exception ex = null;
		try {
			runnable.run();
		} catch (Exception e) {
			ex = e;
		}
		return ex;
	}
}
