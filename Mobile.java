package week1.day1;

public class Mobile {
	long mobileNumber = 8939507137L;
	float mobilePrice = 15000;
	String mobileBrand = "Samsung";
	boolean isCharged = false;
	
	public void sendSms() {
		System.out.println("Send SMS");
	}
	public void takePhoto() {
		System.out.println("Take Photo");
	}
	public void makeCall() {
		System.out.println("MakeCalls");
	}
	public static void main(String[] args) {
		Mobile newMobile = new Mobile();
		newMobile.makeCall();
		newMobile.sendSms();
		newMobile.takePhoto();
		System.out.println("My Mobile Number : "+ newMobile.mobileNumber);
		System.out.println("My Mobile Price : " + newMobile.mobilePrice);
		System.out.println("My Mobile Brand : "+ newMobile.mobileBrand);
		System.out.println("My Mobile Charged : " + newMobile.isCharged);
	}
}
