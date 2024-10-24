package constructorOverloading;

public class Time {
	
	int hr, min, sec;
	
	public Time() {
		hr=0;
		min=0;
		sec=0;
	}
	
	public Time(int hr) {
		this.hr=hr;
	}
	
	public Time(int hr, int min) {
		this.hr=hr;
		this.min=min;
	}
	
	public Time(int hr, int min, int sec) {
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	public void getTime() {
		System.out.format("%02d:%02d:%02d", hr,min,sec);
		System.out.println();
	}
}
