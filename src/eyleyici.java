import java.io.IOException;
import java.lang.Thread;

public class eyleyici implements IEyleyici {
	boolean sogutucununDurumu=false;
	public void sogutucuAc(){
		System.out.println("So�utucu A��l�yor...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("So�utucu A��ld�.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sogutucununDurumu=true;
	}
	public void sogutucuKapat() {
		System.out.println("So�utucu Kapat�l�yor...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("So�utucu Kapat�ld�.");
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
