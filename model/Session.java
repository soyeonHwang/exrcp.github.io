package org.eclipsercp.hyperbola.model;

import org.eclipse.core.runtime.IAdaptable;

//import org.eclipsercp.hyperbola.ContactsGroup;

public class Session {
private ContactsGroup rootGroup;

private String name;

private String server;

public Session() {
}

public void setSessionDescription(String name, String server) {
this.name = name;
this.server = server;
}

public ContactsGroup getRoot() {
if (rootGroup == null)
rootGroup = new ContactsGroup(null, "RootGroup");
return rootGroup;
}

public String getName() {
return name;
}

public String getServer() {
return server;
}
}


/*	
	
	public ContactsGroup getRoot() { // TODO Auto-generated method stub
		if(rootGroup == null)
			rootGroup == new ContactsGroup(null, "RootGroup");
		
		return rootGroup;
	}

}
*/














