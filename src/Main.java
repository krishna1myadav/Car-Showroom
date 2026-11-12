import java.util.Scanner;

public class Main {

    static void mainMenu(){
        System.out.println();
        System.out.println("====================================== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =============================");
        System.out.println();
        System.out.println("======================================== *** ENTER YOUR CHOICE *** ===============================================");
        System.out.println();
        System.out.println("1). ADD SHOWROOMS \t\t\t 2). ADD EMPLOYEES \t\t\t 3). ADD CARS");
        System.out.println();
        System.out.println("4). GET SHOWROOMS \t\t\t 5). GET EMPLOYEES \t\t\t 6). GET CARS");
        System.out.println();
        System.out.println("============================================= *** ENTER 0 TO EXIT *** ========================================");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employees[] = new Employees[5];
        Car car[] = new Car[5];

        int carCounter = 0;
        int showroomCounter = 0;
        int employeesCounter = 0;

        int choise = 100;
        while (choise != 0){
            mainMenu();
            choise = sc.nextInt();

            while (choise !=9 && choise !=0){
                switch (choise) {
                    case 1:
                        showroom[showroomCounter] = new Showroom();
                        showroom[showroomCounter].setDetails();
                        showroomCounter++;

                }
            }
        }
    }
}