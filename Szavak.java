package application;

public class Szavak {
	String szo1;
	String szo2;
	String szo3;
	
	public String getSzo1() {
		return szo1;
	}
	public String getSzo2() {
		return szo2;
	}
	public String getSzo3() {
		return szo3;
	}
	public void setSzo1(String szo1) {
		this.szo1 = szo1;
	}
	public void setSzo2(String szo2) {
		this.szo2 = szo2;
	}
	public void setSzo3(String szo3) {
		this.szo3 = szo3;
	}
	@Override
	public String toString() {
		return szo1+"\t"+szo2+"\t"+szo3;  
	}
}
