package lista14;

public abstract class Auto {

	protected String marka;
	protected int lk;
	protected long nrNadwozia;
	protected boolean diesel;
	
	public Auto() {
		marka = "";
		lk = 0;
		nrNadwozia = 0;
		diesel = false;
	}

	public Auto(String marka, int lk, long nrNadwozia, boolean diesel) {
		this.marka = marka;
		this.lk = lk;
		this.nrNadwozia = nrNadwozia;
		this.diesel = diesel;
	}
	
	public String getMarka() {
		return marka;
	}

	public int getLk() {
		return lk;
	}

	public long getNrNadwozia() {
		return nrNadwozia;
	}

	public boolean getDiesel() {
		return diesel;
	}

	public abstract double ilePaliwa();

	public abstract double getZuzycie();
}
