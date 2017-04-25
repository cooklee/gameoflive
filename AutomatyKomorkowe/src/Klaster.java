import java.util.concurrent.ThreadLocalRandom;

public class Klaster {
	
	private Komorka[][] siec;
	
	public Klaster(int wielkosc)
	{
		this.siec = new Komorka[wielkosc][wielkosc];
		for (int i=0; i < wielkosc;i++)
		{
			for (int j=0; j < wielkosc; j++)
			{
				siec[i][j] = new Komorka();
			}
		}
		for (int i=0; i < wielkosc;i++)
		{
			for (int j=0; j < wielkosc; j++)
			{
				if (i > 0)
				{
					if (j>0)
						siec[i][j].dodajSasiada(siec[i-1][j-1]);
				siec[i][j].dodajSasiada(siec[i-1][j]);
					if (j<wielkosc-1)
						siec[i][j].dodajSasiada(siec[i-1][j+1]);
				}
				if (i < wielkosc-1)
				{
					if (j>0)
						siec[i][j].dodajSasiada(siec[i+1][j-1]);
					siec[i][j].dodajSasiada(siec[i+1][j]);
					if (j<wielkosc-1)
						siec[i][j].dodajSasiada(siec[i+1][j+1]);
				}
				if (j>0)
					siec[i][j].dodajSasiada(siec[i][j-1]);
				if (j<wielkosc-1)
					siec[i][j].dodajSasiada(siec[i][j+1]);
			}
		}
		for (int i=0;i<wielkosc;i++)
		{
			int randomNum = ThreadLocalRandom.current().nextInt(0, 2);
			if (randomNum == 1)
			{
				siec[0][i].wskrzes();
			}
		}
		
	}
	
	public void wskrzes(int i,int j)
	{
		siec[i][j].wskrzes();
	}
	
	public void narysuj()
	{
		for (int i=0; i < this.siec.length;i++)
		{
			for (int j=0; j < this.siec[0].length; j++)
			{
				siec[i][j].narysuj();
			}
			System.out.println();
		}
	}
	
	public void krok()
	{
		for (int i=0; i < this.siec.length;i++)
		{
			for (int j=0; j < this.siec[0].length; j++)
			{
				siec[i][j].zmiana(2, 3);
			}
		}
		for (int i=0; i < this.siec.length;i++)
		{
			for (int j=0; j < this.siec[0].length; j++)
			{
				siec[i][j].nadpiszStan();
			}
		}
	}
	

}
