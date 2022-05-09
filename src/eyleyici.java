import java.io.IOException;
import java.lang.Thread;

public class eyleyici implements IEyleyici {
	boolean sogutucununDurumu=false;
	public void sogutucuAc(){
		System.out.println("Soðutucu Açýlýyor...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Soðutucu Açýldý.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sogutucununDurumu=true;
	}
	public void sogutucuKapat() {
		System.out.println("Soðutucu Kapatýlýyor...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Soðutucu Kapatýldý.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sogutucununDurumu=false;
	}
	public boolean sogutucuAcikMi() {
		return sogutucununDurumu;
	}
}
