package edge.githubproject.javaservices;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class Default

{
	// ---( internal utility methods )---

	final static Default _instance = new Default();

	static Default _newInstance() { return new Default(); }

	static Default _cast(Object o) { return (Default)o; }

	// ---( server methods )---




	public static final void HelloWorld (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(HelloWorld)>> ---
		// @sigtype java 3.5
		IDataMap pMap = new IDataMap(pipeline);
		pMap.put("message", "hello, world!");
		
		        throw new ServiceException();
		// --- <<IS-END>> ---

                
	}
}

