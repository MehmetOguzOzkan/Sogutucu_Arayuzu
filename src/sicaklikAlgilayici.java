import java.util.Random;

public class sicaklikAlgilayici implements ISicaklikAlgilayici{
	public void sicaklikOku() {
		Random rand=new Random();
		int sicaklik=rand.nextInt(60)-20;
		System.out.println("Sýcaklýk Hesaplanýyor...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Havanýn Sýcaklýðý "+sicaklik+"°C.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
