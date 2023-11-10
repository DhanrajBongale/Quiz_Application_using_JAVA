import java.awt.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        String name,email,place;
        System.out.println("Welcome to The Quiz");
        System.out.println("Enter your details 1.Name 2.Email 3.Place:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        email = sc.nextLine();
        place = sc.nextLine();
        rules();
        System.out.println("Press 1 if you want to continue or press 0 if you want exit.");
        int q;
        q = sc.nextInt();
        if(q==1){
            start();
        }
        else{
            System.exit(0);
        }
    }
    static void rules(){
        System.out.println("1.You will get 4 options");
        System.out.println("2.If answer is correct you get the amount");
        System.out.println("3.If answer is incorrect you dont get amount and you will be out.");
    }
    static void start(){
        int amount = 0;
        String[] questions = {
                "Which is the biggest continent in the world?",
                "Which is the longest river in the world?",
                "Which is the largest ocean in the world?",
                "Which is India’s first super computer?",
                "Which bank is called bankers Bank of India?",
                "Which is the largest animal in the world?",
                "Which is largest animal on land?",
                "Which is largest island in the world?"
        };
        String[][] options = {
                {"North America","Asia","Africa","Australia"},
                {"Great Ganga","Nile","Amazon","Niger"},
                {"Indian Ocean","Pacific Ocean","Arctic Ocean","Atlantic Ocean"},
                {"Param8000","param80000","param800","param8"},
                {"Reserve Bank of India","Punjab National Bank","State Bank of India","ICICI Bank"},
                {"Shark","Blue whale","Elephant","Giraffe"},
                {"Tiger","White Elephant","African Elephant","Crocodile"},
                {"New Guinea","Andaman Nicobar","Greenland","Hawaii"}

        };
        int ll = 2;
        Scanner sc = new Scanner(System.in);
        int ans[]  = {2,2,2,1,1,2,3,3};
        for(int i =0;i<8;i++){
            System.out.println(questions[i]);
            for(int j = 0;j<4;j++){
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            System.out.println("Choose your option:");
            System.out.println("If you want to use lifeline press 1 else Press 0");
            int n;
            n = sc.nextInt();
            if(n == 1){

                System.out.println("Choose your lifeline:");
                System.out.println("1.50/50 2.Call a friend");
                if(ll>0){
                    int a;
                    a = sc.nextInt();

                    if(a==1){
                        System.out.println(questions[i]);
                        for(int j = 0;j<2;j++){
                            System.out.println((j + 1) + ". " + options[i][j]);
                        }
                    }
                    else{
                        System.out.println("Calling a friend");
                        System.out.println("Now choose the option to answer:");
                    }
                    ll--;
                }
                else{
                    System.out.println("Lifeline Exhuasted");
                    System.out.println("Now choose the option to answer:");

                }
                int ch;
                ch = sc.nextInt();
                if(ch == ans[i]){
                    amount = amount + 100;
                    System.out.println("Correct ans! and your amount till now is : " + amount);
                }
                else{
                    System.out.println("Thank you for the participation and you won " + amount +"Rs. ");
                    break;
                }


            }
            else{
                System.out.println("Okay Choose option now");
                int ch;
                ch = sc.nextInt();
                if(ch == ans[i]){
                    amount = amount + 100;
                    System.out.println("Correct ans! and your amount till now is : " + amount);
                }
                else{
                    System.out.println("Thank you for the participation and you won " + amount +"Rs. ");
                    break;
                }
            }
        }
        System.out.println("Quiz is Completed Congrats You won: "+ amount);
    }
}