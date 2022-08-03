import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {

    private static Object Character;
    private static Object List;


    public static void teamCreator() {

        List<Character> selectedRoster = new ArrayList<>();
        Character emptySlot = new Character("","","","");

        System.out.println("Welcome to Genshin Impact. Please select a team of 4 adventurers.");
        characterCreation(selectedRoster).add(emptySlot);
        printTeam(selectedRoster);
        elementalResonance(selectedRoster);
    }



    private static List<Character> characterCreation(List<Character> hereComesBennet) {

        List<Character> availableRoster = new ArrayList<>();
        Character bennet = new Character("Bennet", "", "pyro", "sword" );
        Character yelan = new Character("Yelan", "", "hydro", "bow");
        Character kokomi = new Character("Kokomi", "Sangonomiya", "hydro", "catalyst");
        Character keqing = new Character("Keqing", "", "electro", "sword");
        availableRoster.add(bennet);
        availableRoster.add(yelan);
        availableRoster.add(kokomi);
        availableRoster.add(keqing);


        return availableRoster;
    }

    private static void printTeam(List<Character> teamComp) {
        for (int i = 0; i < teamComp.size(); i++) {
            System.out.println(teamComp);
        }
    }

    private static List<String> elementalResonance(List<Character> teamComposition) {
        List<String> elementResonance = new ArrayList();
        int pyro = 0, hydro = 0, electro = 0, cryo = 0, anemo = 0, geo = 0;

        String ferventFlames = "Fervent Flames: Affected by Cryo for 40% less time. Increases ATK by 25%.";
        String soothingWaters = "Soothing Waters: Affected by Pyro for 40% less time. Increases incoming healing by 30%.";
        String highVoltage = "High Voltage: Affected by Hydro for 40% less time. Superconduct, Overloaded, and Electro-Charged have a 100% chance to generate an Electro Elemental Particle (CD: 5s).";
        String shatteringIce = "Shattering Ice: Affected by Electro for 40% less time. Increases CRIT Rate against enemies that are Frozen or affected by Cryo by 15%.";
        String impetuousWind = "Impetuous Wind: Decreases Stamina Consumption by 15%. Increases Movement SPD by 10%. Shortens Skill CD by 5%.";
        String enduringRock = "Enduring Rock: Increases shield strength by 15%. Additionally, characters protected by a shield will have the following special characteristics: DMG dealt increased by 15%, dealing DMG to enemies will decrease their Geo RES by 20% for 15s.";

        elementResonance.add(ferventFlames);
        elementResonance.add(soothingWaters);
        elementResonance.add(highVoltage);
        elementResonance.add(shatteringIce);
        elementResonance.add(impetuousWind);
        elementResonance.add(enduringRock);

        for(int i = 0; i < teamComposition.size(); i++) {
            System.out.println(teamComposition);
            if (teamComposition.get(i).getElementalType().equals(pyro)) {
                pyro++;
             if(pyro == 2) {
                    System.out.println(ferventFlames);
                }
            } else if (teamComposition.get(i).getElementalType().equals(hydro)) {
                hydro++;
                if(hydro == 2) {
                    System.out.println(soothingWaters);
                }
            } else if (teamComposition.get(i).getElementalType().equals(electro)) {
                electro++;
                if(electro == 2) {
                    System.out.println(highVoltage);
                }
            } else if (teamComposition.get(i).getElementalType().equals(cryo)) {
                cryo++;
                if(cryo == 2) {
                    System.out.println(shatteringIce);
                }
            } else if (teamComposition.get(i).getElementalType().equals(anemo)) {
                anemo++;
                if(anemo == 2) {
                    System.out.println(impetuousWind);
                }
            } else if (teamComposition.get(i).getElementalType().equals(geo)) {
                geo++;
                if(geo == 2) {
                    System.out.println(enduringRock);
                }
            }
        }
        //no return statement
    }
}
