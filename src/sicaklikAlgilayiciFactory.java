
public class sicaklikAlgilayiciFactory implements ISicaklikAlgilayiciFactory{
	public ISicaklikAlgilayici factoryMethod() {
		return new sicaklikAlgilayici();
	}
}
