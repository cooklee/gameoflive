
public class Komorka {
	private boolean czyZyje;
	private Komorka[] sasiedzi;
	private int iloscSasiadow;
	private boolean czyZyjePoSprawdzeniu;
	
	public Komorka()
	{
		this.czyZyje = false;
		this.czyZyjePoSprawdzeniu = false;
		this.sasiedzi =  new Komorka[8];
		this.iloscSasiadow = 0;
	}
	
	public boolean czyJestZywa()
	{
		return this.czyZyje;
	}
	
	public int ileMaZywychSasiadowO()
	{
		int iloscZywychSasiadow = 0;
		for (int i=0; i < this.sasiedzi.length; i++)
		{
			if (this.sasiedzi[i].czyJestZywa()) 
			{
				iloscZywychSasiadow = iloscZywychSasiadow + 1;
			}
		}
		return iloscZywychSasiadow;
	}
	
	public void dodajSasiada(Komorka sasiad)
	{
		if (this.iloscSasiadow < 7)
		{
			this.sasiedzi[this.iloscSasiadow] = sasiad;
		}
		else
		{
		System.out.println("ma juz max ilosc Sasiadow");
		}
	}
	
	public void narysuj()
	{
		if (this.czyZyje)
			System.out.print("o");
		else
			System.out.print("x");
	}
	public void zmiana(int smierc, int zycie)
	{
		if (this.ileMaZywychSasiadowO() == zycie)
			this.czyZyjePoSprawdzeniu = true;
		if (this.ileMaZywychSasiadowO()< zycie-smierc || this.ileMaZywychSasiadowO() > zycie+smierc)
			this.czyZyjePoSprawdzeniu = false;
			
	}
	public void nadpiszStan()
	{
		this.czyZyje = this.czyZyjePoSprawdzeniu;
	}
	public void wskrzes()
	{
		this.czyZyje = true;
	}
	
	
}
