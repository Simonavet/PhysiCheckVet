package TheApplication;

import java.util.*;

public class CheckParameters {
    public static void main(String[] args) {
        Parameters.Horse horse = new Parameters.Horse();
        Parameters.Bovine cow = new Parameters.Bovine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Name specie: ");
        String name = sc.nextLine();
        if (Objects.equals(name, "horse")){
            System.out.println("Respiratory rate: ");
            Scanner input = new Scanner(System.in);
            int hr=input.nextInt();
            horse.horseRespiration(hr);
            System.out.println("Heart beat: ");
            Scanner input1 = new Scanner(System.in);
            int hhb=input1.nextInt();
            horse.horseHearBeat(hhb);
            System.out.println("Temperature: ");
            Scanner input2 = new Scanner(System.in);
            double ht=input2.nextDouble();
            horse.horseTemperature(ht);
        }
        else if (Objects.equals(name, "cow")){
            System.out.println("Respiratory rate: ");
            Scanner input = new Scanner(System.in);
            int br=input.nextInt();
            cow.bovineRespiration(br);
            System.out.println("Heart beat: ");
            Scanner input1 = new Scanner(System.in);
            int bhb=input1.nextInt();
            cow.bovineHearBeat(bhb);
            System.out.println("Temperature: ");
            Scanner input2 = new Scanner(System.in);
            double bt=input2.nextDouble();
            cow.bovineTemperature(bt);
        }
        else {
            System.out.println("I do not know this specie");
        }

    }
}
