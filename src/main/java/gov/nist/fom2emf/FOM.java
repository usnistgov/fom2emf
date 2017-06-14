package gov.nist.fom2emf;

import org.eclipse.emf.ecore.EObject;
import org.ieee.standards.ieee1516._2010.DocumentRoot;
import org.ieee.standards.ieee1516._2010._2010Package;
import org.ieee.standards.ieee1516._2010.util._2010ResourceFactoryImpl;

import emf.sds.Deserialize;
import emf.sds.Serialize;

public class FOM {

	public static final String EXT = "xml";
	public static final String DUMMY_URL = "http:///dummy.xml";

	// static {
	//     Deserialize.associateExtension(EXT, new _2010ResourceFactoryImpl());
	//     Deserialize.registerPackage(_2010Package.eNS_URI, _2010Package.eINSTANCE);
	// }

	public static DocumentRoot deserialize(String fomFilePath) {
	    Deserialize.associateExtension(EXT, new _2010ResourceFactoryImpl());
	    Deserialize.registerPackage(_2010Package.eNS_URI, _2010Package.eINSTANCE);
		return (DocumentRoot) Deserialize.it(fomFilePath);
	}

	// Because we're returning a string that does not correspond to a file, we can submit a phony URL.
	// The URL in question serves only as a name space qualifier.
	public static String serialize(EObject eObject) {
		return Serialize.it(eObject, DUMMY_URL);
	}
}
