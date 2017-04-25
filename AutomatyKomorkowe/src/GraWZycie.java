
public class GraWZycie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Klaster k = new Klaster(10);
		for (int i = 0;i<100;i++)
		{
			k.krok();
		}
		k.narysuj();
		System.out.flush();
	
	}
}