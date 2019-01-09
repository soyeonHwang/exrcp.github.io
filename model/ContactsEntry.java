
 package org.eclipsercp.hyperbola.model;
 

public class ContactsEntry extends Contact {
	
	private final String name;
	private final String nickname;
	private final String server;
	private Presence presence;
	private final ContactsGroup group;
	
	public ContactsEntry(ContactsGroup group, String name, String nickname, 
			String server) {
		
		this.group = group;
		this.name = name;
		this.nickname = nickname;
		this.server = server;
		this.presence = Presence.INVISIBLE;
	}
		public void setPresence(Presence presence) {
			this.presence = presence;
			group.fireContactsChanged(this);
			
		}
		
		public Presence getPresence() {
			return presence;
		}
		
	
		
		public String getServer() {
			return server;
		}
		
		public ContactsGroup getParent() {
			return group;
		}

		public String setName() {
			// TODO Auto-generated method stub
			return name;
		}


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getNickname() {
		// TODO Auto-generated method stub
		return nickname;
	}

}