package Package;

public class Nachbesteller {

	public static void main(String[] args) {
		kebap k = new kebap();
		brillen b = new brillen();

		nachbestellen(k);
		nachbestellen(b);
	}

	public static void nachbestellen(Ware w) {

		System.out.println("Bestellung der Ware:" + w.bezeichnung);

		if (w instanceof kebap)
			System.out.println("Doenersorte: " + ((kebap) w).veggie);
	}

}
