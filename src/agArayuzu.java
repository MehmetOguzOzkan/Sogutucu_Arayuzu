import java.util.Scanner;

public class agArayuzu{
	Scanner scan=new Scanner(System.in);
	private IEyleyiciFactory eyleyiciFactory;
	private ISicaklikAlgilayiciFactory sicaklikAlgilayiciFactory;
	private IGiris giris;
	private IEyleyici eyleyici;
	private ISicaklikAlgilayici sicaklikAlgilayici;
	
	public agArayuzu(IGiris g,IEyleyiciFactory e,ISicaklikAlgilayiciFactory s) {
		this.giris=g;
		this.eyleyiciFactory=e;
		this.sicaklikAlgilayiciFactory=s;
	}
	public void basla() {
		int girdi=0;
		eyleyici=eyleyiciFactory.factoryMethod();
		sicaklikAlgilayici=sicaklikAlgilayiciFactory.factoryMethod();
		giris.login();
		while(girdi!=9) {
			sogutucununDurumu();
			System.out.println("1 - So�utucuyu A�/Kapat");
			System.out.println("2 - S�cakl��� �l�");
			System.out.println("9 - ��k��");
			System.out.println("Ne yapmak istersiniz?");
			girdi=scan.nextInt();
			
			if(girdi==1) {
				sogutucuCalis();
			}
			else if(girdi==2) {
				sicaklikAlgilayici.sicaklikOku();
			}
			else if(girdi==9) {
				System.out.println("Program Kapat�l�yor...");
			}
		}
		
	}
	public void sogutucuCalis() {
		if(eyleyici.sogutucuAcikMi()==true) {
			eyleyici.sogutucuKapat();
		}
		else {
			eyleyici.sogutucuAc();
		}
	}
	public void sogutucununDurumu() {
		if(eyleyici.sogutucuAcikMi()==true) {
			System.out.println("**********");
			System.out.println("So�utucunun Durumu : A��k");
			System.out.println("**********");
		}
		else {
			System.out.println("**********");
			System.out.println("So�utucunun Durumu : Kapal�");
			System.out.println("**********");
		}
	}
}