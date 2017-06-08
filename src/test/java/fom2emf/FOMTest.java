package fom2emf;

import static org.junit.Assert.*;

import java.io.File;

import org.ieee.standards.ieee1516._2010.DocumentRoot;
import org.junit.Test;

public class FOMTest {
	
	@Test
	public void testFOMExists() {
		assertTrue(new File("fom/TripleFederation.xml").exists());
	}

	@Test
	public void testDeserialize() {
		DocumentRoot eObject = FOM.deserialize("fom/TripleFederation.xml");
		assertNotNull(eObject);
		String s = FOM.serialize(eObject);
		assertNotNull(s);
	}

//	@Test
//	public void testSerialize() {
//		String sut = FOM.serialize(eObject);
//	}

}