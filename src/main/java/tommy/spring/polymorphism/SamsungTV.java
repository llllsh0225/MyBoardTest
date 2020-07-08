package tommy.spring.polymorphism;

public class SamsungTV implements TV {
	// SamsungTV�� �������� ����� SonySpeaker�� �̿��ϵ��� ����
	private Speaker speaker;
	int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV ��ü ����");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV ��ü ���� : ������ ������");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV ��ü ���� : ������ ������ - ���߸���");
		this.speaker = speaker;
		this.price = price;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() �޼��� ȣ��");
		this.speaker = speaker;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setPrice() �޼��� ȣ��");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsumgTV ������ �Ҵ�. (����: " + price + " ��)");
	}
	public void powerOff() {
		System.out.println("SamsungTV ������ ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}