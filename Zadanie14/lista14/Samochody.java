package lista14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Samochody {

	private List<Auto> samochody;
	private Comparator komperator;
	
	public Samochody() {
		samochody = new ArrayList<>();
	}
	
	public List<Auto> getSamochody(){
		return samochody;
	}
	
	public void dodajAuto(Auto auto) {
		samochody.add(auto);
	}
	
	public void dodajNowyAutoOsobowe(String marka, int lk, long nrNadwozia, boolean diesel, String model, double zuzycie) {
		samochody.add(new AutoOsobowe(marka, lk, nrNadwozia, diesel, model, zuzycie));
	}
	
	public void dodajNowyAutoCiężarowe(String marka, int lk, long nrNadwozia, boolean diesel, String model, double zuzycie, boolean kratka) {
		samochody.add(new AutoCiężarowe(marka, lk, nrNadwozia, diesel, model, zuzycie, kratka));
	}
	
	public void komperatorSortujWgMarek() {
		komperator = new SortujWgMarek();
	}
	
	public void komperatorSortujWgLK() {
		komperator = new SortujWgLK();
	}
	
	public void komperatorSortuj() {
		komperator = new SortujWg();
	}
	
	public void wyswietlSamochody() {
		System.out.println("Samochody: ");
		for(Auto a : samochody) {
			System.out.println("- " +a);
		}
		System.out.println("\n");
	}

	public void sortuj() {
		if(komperator != null) Collections.sort(samochody, komperator);
		else System.out.println("Dodaj komperator");
	}
	
	public Auto wyswietlNajwiekszeZuzycie() {
		if(samochody.get(0) != null) {
			double max =  samochody.get(0).getZuzycie();
			int i = 0;
			int j = 0;
			for(Auto a : samochody) {
				if(a.getZuzycie() >= max) {
					max = a.getZuzycie();
					j = i;
				}
				i++;
			}
			System.out.println("Największe zużycie ma samochód o indeksie " +j +" czyli:");
			System.out.println(samochody.get(j) + "\n");
			return samochody.get(j);
		}
		else {
			System.out.println("Brak samochodów");
			return null;
		}
	}
	
	public Auto wyswietlNajwiekszeZuzyciePaliwa() {
		if(samochody.get(0) != null) {
			double max =  samochody.get(0).ilePaliwa();
			int i = 0;
			int j = 0;
			for(Auto a : samochody) {
				if(a.ilePaliwa() > max) {
					max = a.ilePaliwa();
					j = i;
				}
				i++;
			}
			System.out.println("Najwięcej paliwa zużycie ma samochód o indeksie " +j +" czyli:");
			System.out.println(samochody.get(j) + "\n");
			return samochody.get(j);
		}
		else {
			System.out.println("Brak samochodów");
			return null;
		}
	}
	
	class SortujWgMarek implements Comparator<Auto>{
		
		public int compare(Auto a1, Auto a2) {
			return a1.getMarka().compareTo(a2.getMarka());
		}
	}
	
	class SortujWgLK implements Comparator<Auto>{
		
		public int compare(Auto a1, Auto a2) {
			return a1.getLk() - a2.getLk();
		}
	}
	
	class SortujWg implements Comparator<Auto>{
		
		public int compare(Auto a1, Auto a2) {
			if(!a1.getMarka().equals(a2.getMarka())) return a1.getMarka().compareTo(a2.getMarka());
			else return a1.getLk() - a2.getLk();
		}
	}
}
