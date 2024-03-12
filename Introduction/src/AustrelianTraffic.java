import demopack.CentralTraffic;

public class AustrelianTraffic implements CentralTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic at=new AustrelianTraffic();
		at.greenGo();
		at.flashYellow();
		at.redStop();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println ("Go on green light");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println ("Stop on red light");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println ("Wait on yellow light");
	}

}
