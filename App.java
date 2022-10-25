import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int input;
        int berat;
        int gender;
        double calories_ = 0,calories=0;
        int acak1 =-1,acak2=-1;
    
        Scanner baca = new Scanner(System.in);
        Random rand = new Random();
        do{
            System.out.println("Welcome to the Traveling Calories Simulation.....");
            System.out.println("Your Current Energy 0 Calories");
            System.out.println("+++++++++++++");

            System.out.println("1. Set My Based Calories");
            System.out.println("2. Traveling");
            System.out.println("3. Eating");
            System.out.println("4. Exit");
            System.out.println("Masukkan pilihan :");
            input = baca.nextInt();

            if(input == 1){
                System.out.println("Berat badan =");
                berat = baca.nextInt();
                System.out.println("Jenis Kelamin [1. Female] [2. Male] =");
                gender = baca.nextInt();

                if(gender == 1)
                calories_ = berat*0.9*24*0.95*1.55;
                else
                calories_ = berat*0.9*24*1.00*1.55;

                System.out.println("Jumlah Calorie Anda = "+calories_);

            }
            if(input == 2){
                if(acak1==-1)
                    acak1 = rand.nextInt(7);
                int acak = acak1;
                calories = calories_ - 100*acak;

                System.out.println("hours traveling ="+acak);
                System.out.println("Remaining Energy"+" "+Math.floor (calories)+" "+"calories");

                if(calories < 1000)
                System.out.println("No more energy to travell");                
            }
            if (input == 3){
                if(acak2==-1)
                    acak2 = rand.nextInt(6);
                int acak=acak2;
                calories = calories_ + 100*acak;

                System.out.println("Number of meals ="+acak);
                System.out.println("Remaining Energy"+" "+ Math.floor (calories)+" "+"calories");

                if(calories >= 2000)
                System.out.println("Energy full, no more Eating");


            }
            if (input == 4)
                System.out.println("Thank you hope you enjoy this simulation");

        }while (input < 4);
        baca.close();
    }
}
