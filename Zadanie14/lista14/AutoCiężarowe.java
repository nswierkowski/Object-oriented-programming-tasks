package lista14;

public class AutoCiężarowe extends Auto {

	private String model;
	private double zuzycie;
	private boolean kratka;
	
	public AutoCiężarowe(String marka, int lk, long nrNadwozia, boolean diesel, String model, double zuzycie, boolean kratka) {
		super(marka, lk, nrNadwozia, diesel);
		this.model = model;
		this.zuzycie = zuzycie;
	}

	public AutoCiężarowe() {
		super();
	}

	public double ilePaliwa() {
		return lk/zuzycie;
	}

	public String toString() {
		return "marka "+ marka +", liczba kilometrow "+ lk + ", numer nadwozia "+ nrNadwozia + ", diesel "+ diesel +", model " + model + ", zuzycie = " + zuzycie + ", kratka " + kratka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getZuzycie() {
		return zuzycie;
	}

	public void setZuzycie(double zuzycie) {
		this.zuzycie = zuzycie;
	}
	
	public boolean getKratka() {
		return kratka;
	}

	public void setKratka(boolean kratka) {
		this.kratka = kratka;
	}
}
