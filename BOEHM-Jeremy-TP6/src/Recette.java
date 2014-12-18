import java.util.ArrayList;


public class Recette 
{
	private int idRecette;
	private String nomRecette;
	private double tempsPreparation;
	private double tempsCuisson;
	private int niveauDifficulte;
	private ArrayList <Aliment> lesAliments = new ArrayList<Aliment>();
	private Type leType;
	
	public Recette(int idRecette, String nomRecette, double tempsPreparation, double tempsCuisson, int niveauDifficulte, ArrayList<Aliment> lesAliments, Type leType) {
		super();
		this.idRecette = idRecette;
		this.nomRecette = nomRecette;
		this.tempsPreparation = tempsPreparation;
		this.tempsCuisson = tempsCuisson;
		this.niveauDifficulte = niveauDifficulte;
		this.lesAliments = lesAliments;
		this.leType = leType;
	}

	public int getIdRecette() {
		return idRecette;
	}

	public void setIdRecette(int idRecette) {
		this.idRecette = idRecette;
	}

	public String getNomRecette() {
		return nomRecette;
	}

	public void setNomRecette(String nomRecette) {
		this.nomRecette = nomRecette;
	}

	public double getTempsPreparation() {
		return tempsPreparation;
	}

	public void setTempsPreparation(double tempsPreparation) {
		this.tempsPreparation = tempsPreparation;
	}

	public double getTempsCuisson() {
		return tempsCuisson;
	}

	public void setTempsCuisson(double tempsCuisson) {
		this.tempsCuisson = tempsCuisson;
	}

	public int getNiveauDifficulte() {
		return niveauDifficulte;
	}

	public void setNiveauDifficulte(int niveauDifficulte) {
		this.niveauDifficulte = niveauDifficulte;
	}

	public ArrayList<Aliment> getLesAliments() {
		return lesAliments;
	}

	public void setLesAliments(ArrayList<Aliment> lesAliments) {
		this.lesAliments = lesAliments;
	}

	public Type getLeType() {
		return leType;
	}

	public void setLeType(Type leType) {
		this.leType = leType;
	}

	@Override
	public String toString() {
		return "Recette [idRecette=" + idRecette + ", nomRecette=" + nomRecette
				+ ", tempsPreparation=" + tempsPreparation + ", tempsCuisson="
				+ tempsCuisson + ", niveauDifficulte=" + niveauDifficulte
				+ ", lesAliments=" + lesAliments + ", leType=" + leType + "]";
	}
}
