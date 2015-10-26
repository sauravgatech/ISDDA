package GT.CS6440.ISDDA.Platform;

public class Test {

	public static void main(String[] args) {
		CommunicationManager cm = new CommunicationManager();
		//cm.init();
		//Bundle b = cm.getPatient("12");
		//System.out.println(b.getBase());
		Bundle b = cm.getPatients("12", "Franklin" , null, null);
		Resource r = b.getEntry().get(0).getResource();
		System.out.println(r.getName().get(0).getGiven() + " " + r.getName().get(0).getFamily());
	}

}
