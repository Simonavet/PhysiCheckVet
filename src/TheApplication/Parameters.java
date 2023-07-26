package TheApplication;

public class Parameters {
    public static class Horse {
        public void horseRespiration(int hr){
            if (hr < 12){
                System.out.print("The respiratory rate is low");
            }
            else if (hr <= 20) {
                System.out.println("The respiratory rate is normal");
            }
            else {
                System.out.println("The respiratory rate is high");
            }
        }
        public void horseHearBeat(int hhb){
            if (hhb < 38){
                System.out.println("The heart beat rate is low");
            }
            else if (hhb <= 44){
                System.out.println("The heart beat rate is normal");
            }
            else {
                System.out.println("The heart beat rate is high");
            }
        }
        public void horseTemperature(double ht){
            if (ht < 37){
                System.out.println("The temperature is low");
            }
            else if (ht <= 38.5){
                System.out.println("The temperature is normal");
            }
            else {
                System.out.println("The temperature is high");
            }
        }
    }
    public static class Bovine {
        public void bovineRespiration(int br){
            if (br < 30){
                System.out.print("The respiratory rate is low");
            }
            else if (br == 30) {
                System.out.println("The respiratory rate is normal");
            }
            else {
                System.out.println("The respiratory rate is high");
            }
        }
        public void bovineHearBeat(int bhb){
            if (bhb < 60){
                System.out.println("The heart beat rate is low");
            }
            else if (bhb <= 70){
                System.out.println("The heart beat rate is normal");
            }
            else {
                System.out.println("The heart beat rate is high");
            }
        }
        public void bovineTemperature(double bt){
            if (bt < 38.3){
                System.out.println("The temperature is low");
            }
            else if (bt <= 38.6){
                System.out.println("The temperature is normal");
            }
            else {
                System.out.println("The temperature is high");
            }
        }
    }
}
