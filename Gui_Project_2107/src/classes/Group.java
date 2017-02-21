package classes;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private int groupId;
	private String groupName;
	private ArrayList<String> listofUsers;
	private int portNo;
	private String groupIpAddress;
	
	public String getGroupIpAddress() {
		return groupIpAddress;
	}

	public void setGroupIpAddress(String groupIpAddress) {
		this.groupIpAddress = groupIpAddress;
	}

	public Group (String groupName){
		this.groupName = groupName;
	}
	
	public Group (int groupId, String groupName, ArrayList<String>listOfUsers, int portNo){
		this.groupId = groupId;
		this.groupName = groupName;
		this.listofUsers = listOfUsers;
		this.portNo = portNo;
		 
	}
	
	public Group() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getListofUsers() {
		return listofUsers;
	}
	public void setListofUsers(ArrayList<String> listofUsers) {
		this.listofUsers = listofUsers;
	}
	public int getPortNo() {
		return portNo;
	}
	public void setPortNo(int portNo) {
		this.portNo = portNo;
	}
	
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
