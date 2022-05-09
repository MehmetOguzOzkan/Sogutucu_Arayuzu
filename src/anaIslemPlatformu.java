import java.util.logging.*;
import java.sql.*;
import java.util.Scanner;

public class anaIslemPlatformu {
	public static void main(String[] args) {
		IGiris g=new giris();
		IEyleyiciFactory e=new eyleyiciFactory();
		ISicaklikAlgilayiciFactory s=new sicaklikAlgilayiciFactory();
		agArayuzu ag=new agArayuzu(g,e,s);
		ag.basla();
	}
}