
public class Student extends Person {
	
	private Student (String vorname, String nachname, int matrikelnummer)
	{
		super (nachname.vorname);
		this.matrikelnummer = matrikelnummer;
		
	}
	
	public void print()
	{
		super.print();
		System.out.println("Matr.Nr: " matrikelnummer);
	}
}


