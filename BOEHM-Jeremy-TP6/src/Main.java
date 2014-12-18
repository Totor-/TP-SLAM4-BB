import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static ArrayList<Aliment> alimentDeRec = new ArrayList<Aliment>();
	public static ArrayList<Aliment> allAliment = new ArrayList<Aliment>();
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int select = 1;
		int select2 = 1;
		// TODO Auto-generated method stub
		while(select != 0){
			System.out.println("-----Menu-----");
			System.out.println("Créer un aliment : tapez 1");
			System.out.println("Créer une recette : tapez 2");
			System.out.println("Consulter la liste des aliments : tapez 3");
			System.out.println("Consulter la liste des recettes : tapez 4");
			System.out.println("Quitter le programme : tapez 0");


			Scanner sc = new Scanner(System.in);

			System.out.println("Veuillez choisir une option ...");

			select = sc.nextInt();

			switch(select){

			case 0 : System.out.println("Au revoir ...");
			break;

			case 1 :
				System.out.println("Veuillez saisir le type d'Aliment");
				String typeAl = sc.next();
				
				System.out.println("Veuillez saisir l'ID d'Aliment");
				int idAl = sc.nextInt();
				
				System.out.println("Veuillez saisir le nom d'Aliment");
				String nomAl = sc.next();
				
				System.out.println("Veuillez saisir le nombre de calories de l'Aliment");
				double calAl = sc.nextDouble();
				
				if(typeAl.compareTo("Legume")==0 || typeAl.compareTo("legume")==0)
				{
					Legume l = new Legume(idAl, nomAl, calAl);
					allAliment.add(l);
				}
				
				if(typeAl.compareTo("Fruit")==0 || typeAl.compareTo("fruit")==0)
				{
					Fruit f = new Fruit(idAl, nomAl, calAl);
					allAliment.add(f);
				}
				
				if(typeAl.compareTo("Viande")==0 || typeAl.compareTo("viande")==0)
				{
					Viande v = new Viande(idAl, nomAl, calAl);
					allAliment.add(v);
				}
				
				if(typeAl.compareTo("Poisson")==0 || typeAl.compareTo("poisson")==0)
				{
					Poisson p = new Poisson(idAl, nomAl, calAl);
					allAliment.add(p);
				}
				
				System.out.println("Votre "+typeAl+" a bien été créé !");
				
			break;

			case 2 : 
				System.out.println("Veuillez saisir l'ID de la recette");
				int idRec = sc.nextInt();
				
				System.out.println("Veuillez saisir le nom de la recette");
				String nomRec = sc.next();
				
				System.out.println("Veuillez saisir le temps de preparation de la recette");
				double tempsPrepRec = sc.nextDouble();
				
				System.out.println("Veuillez saisir le temps de cuisson de la recette");
				double tempsCuiRec = sc.nextDouble();
				
				System.out.println("Veuillez saisir le niveau de difficulte de la recette");
				int difficultRec = sc.nextInt();
				
				
	/**Il aurait fallu pouvoir récupérer l'objet Aliment pour le faire passer dans une ArayList supplémentaire afin de le passer en paramètre du constrcuteur Recette **/
				
				//System.out.println("Veuillez saisir les aliments qui seront utilisés dans la recette (vous pouvez en ajouter jusqu'à 3)");
				//String ali1 = sc.next();
				
				
				//System.out.println("Veuillez saisir le Type de la recette");
				//Type typeRec = sc.nextObject();
				
			break;

			case 3:
				
				for(Aliment unAliment : allAliment)
				{
					System.out.println(unAliment+"\n");
				}
				
			break;
				// for(BienImmo unBien: lesBiens)
//System.out.println ("Voici la collection de vos Biens immobiliers : ");
				//System.out.println (unBien.toString());
			}
		}
	}
}
