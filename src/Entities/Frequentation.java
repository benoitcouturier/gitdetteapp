package Entities;

public class Frequentation {
	private int count;
	private int annee;
	private int moi;
	private double theorie;
	private int nbmois;
	
	public Frequentation(int count, int annee, int moi, int nbmois) {
		super();
		this.count = count;
		this.annee = annee;
		this.moi = moi;
		this.nbmois = nbmois;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getMoi() {
		return moi;
	}
	public void setMoi(int moi) {
		this.moi = moi;
	}
	public double getTheorie() {
		return theorie;
	}
	public void setTheorie(double theorie) {
		this.theorie = theorie;
	}
	public int getNbmois() {
		return nbmois;
	}
	public void setNbmois(int nbmois) {
		this.nbmois = nbmois;
	}
	
	
	

}
