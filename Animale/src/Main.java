import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) throws IOException {
        List<Animale> animalute = new ArrayList<>();

        Animale vulpe = new Animale("Foxy", 13, "Are blana portocalie");
        animalute.add(vulpe);


        String meniu = " 1.Adauga animal \n 2.Arata animalele \n 3.Iesi \n 4.Sterge animal";

        int comanda = 1;
        while (comanda != 3) {
            System.out.println(meniu);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String optiune = reader.readLine();

            comanda = Integer.parseInt(optiune);

            if (comanda == 1) {
                Animale animalAdaugat = adaugaAnimal();
                animalute.add(animalAdaugat);
            }

            if (comanda == 2) {
                for (Animale animal : animalute) {
                    System.out.println(animal);
                }
            }

            if (comanda == 4) {
                System.out.println("Ce animal vrei sa stergi?");
                String nume = reader.readLine();
                animalute.removeIf(animale -> nume.equals(animale.getNume()));
            }
        }

    }

    private static Animale adaugaAnimal() throws IOException{
        System.out.println("Introdu numele animalului:");
        BufferedReader numeAnimal = new BufferedReader(new InputStreamReader(System.in));
        String nume = numeAnimal.readLine();

        int varsta = 0;
        System.out.println("Introdu varsta animalului:");
        BufferedReader varstaAnimal = new BufferedReader(new InputStreamReader(System.in));
        String varsta0 = varstaAnimal.readLine();
        varsta = Integer.parseInt(varsta0);

        System.out.println("Introdu caracteristicile animalului tau:");
        BufferedReader carAnimal = new BufferedReader(new InputStreamReader(System.in));
        String trasaturi = carAnimal.readLine();

        return new Animale(nume, varsta, trasaturi);
    }
}

