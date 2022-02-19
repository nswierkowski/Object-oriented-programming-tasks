package lista14;

public class AutoOsobowe extends Auto {

	private String model;
	private double zuzycie;
	
	public AutoOsobowe(String marka, int lk, long nrNadwozia, boolean diesel, String model, double zuzycie) {
		super(marka, lk, nrNadwozia, diesel);
		this.model = model;
		this.zuzycie = zuzycie;
	}

	public AutoOsobowe() {
		super();
	}

	public double ilePaliwa() {
		return lk/zuzycie;
	}

	public String toString() {
		return "marka "+ marka +", liczba kilometrow "+ lk + ", numer nadwozia "+ nrNadwozia + " diesel "+ diesel +", model " + model + ", zuzycie = " + zuzycie;
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
}
