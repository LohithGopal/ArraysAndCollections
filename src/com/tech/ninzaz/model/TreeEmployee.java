package com.tech.ninzaz.model;

public class TreeEmployee implements Comparable<TreeEmployee> 
{
	
	private int eId;
	private String eName;
	
	public TreeEmployee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "TreeEmployee [eId=" + eId + ", eName=" + eName + "]";
	}

/*	public int compareTo(TreeEmployee emp) {
		
		return eName.compareTo(emp.eName);
	}
*/
	/*Integer CompareTo	*/
	public int compareTo(TreeEmployee emp) {
		if(this.eId > emp.eId){
			return 1;
		}else if(this.eId < emp.eId){
			return -1;
		}else{
			return 0;
		}	
	}
	/*String CompareTo*/
/*	public int compareTo(TreeEmployee emp) {	
		return eName.compareTo(emp.eName);
	}
*//*	
	public int compareTo(TreeEmployee emp) {	
		return -eName.compareTo(emp.eName);
	}
*/	
	
}
