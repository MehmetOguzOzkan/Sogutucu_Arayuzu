import java.util.Random;

public class sicaklikAlgilayici implements ISicaklikAlgilayici{
	public void sicaklikOku() {
		Random rand=new Random();
		int sicaklik=rand.nextInt(60)-20;
		System.out.println("S�cakl�k Hesaplan�yor...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Havan�n S�cakl��� "+sicaklik+"�C.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
