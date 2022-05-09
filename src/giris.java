import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class giris implements IGiris{
	public void login() {
		Scanner scan=new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/kullaniciBilgileri", "postgres", "1234");
			while(true) {
				System.out.print("Kullan�c� Numaran�z : ");
				int kullaniciNo=scan.nextInt();
				System.out.print("�ifreniz : ");
				int sifre=scan.nextInt();
				int no=0;
				int sfr=0;
				Statement st=connection.createStatement();
				String query="select * from kullanici";
				ResultSet rs=st.executeQuery(query);
				while(rs.next()){
					no=rs.getInt("kullaniciNo");
					sfr=rs.getInt("sifre");
					if(kullaniciNo==no&&sifre==sfr){
						break;
					}
				}
				System.out.println("Kullan�c� Do�rulan�yor...");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(kullaniciNo==no&&sifre==sfr){
					System.out.println("Ho�geldiniz!");
					break;
				}
				else {
					System.out.println("�ifre veya kullan�c� ad� hatal�.");
					continue;
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}