package org.riverframework.wrapper.lotus.domino._remote;

import static org.junit.Assert.assertTrue;
import lotus.domino.NotesThread;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.riverframework.River;
import org.riverframework.utils.LoggerHelper;

public class BaseTest extends org.riverframework.wrapper.lotus.domino.AbstractBaseTest {
	protected static final Logger log = River.LOG_WRAPPER_LOTUS_DOMINO;

	@BeforeClass
	public static void before() {
		NotesThread.sinitThread();

		new LoggerHelper(log).clearHandlers().addConsoleHandler().setLevel(Level.OFF);

		log.setUseParentHandlers(false);
		log.fine("Starting test");
	}
	
	@AfterClass
	public static void after() {		
		log.fine("Test done");

		NotesThread.stermThread();
	}
	
	@Test
	public void testRecycling() {
		assertTrue("There's no recycling to test with a remote session.", true);
	}
}
