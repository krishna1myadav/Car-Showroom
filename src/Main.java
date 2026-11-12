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
                        System.out.println();
                        System.out.println("1). ADD NEW SHOWROOM: ");
                        System.out.println("9). GO BACK TO MAIN MENU: ");
                        choise = sc.nextInt();
                        break;

                    case 2:
                        employees[employeesCounter] = new Employees();
                        employees[employeesCounter].setDetails();
                        employeesCounter++;
                        System.out.println();
                        System.out.println("2). ADD NEW EMPLOYEE: ");
                        System.out.println("9). GO BACK TO MAIN MENU: ");
                        choise = sc.nextInt();
                        break;

                    case 3:
                        car[carCounter] = new Car();
                        car[carCounter].setDetails();
                        carCounter++;
                        System.out.println();
                        System.out.println("3). ADD NEW CAR: ");
                        System.out.println("9). GO BACK TO MAIN MENU: ");
                        choise = sc.nextInt();
                        break;

                    case 4:
                        for(int i = 0; i < showroomCounter; i++){
                            showroom[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). GO BACK TO MAIN MENU: ");
                        System.out.println("0). EXIT: ");
                        choise = sc.nextInt();
                        break;

                    case 5:
                        for(int i = 0; i < employeesCounter; i++){
                            employees[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). GO BACK TO MAIN MENU: ");
                        System.out.println("0). EXIT: ");
                        choise = sc.nextInt();
                        break;

                    case 6:
                        for(int i = 0; i < carCounter; i++){
                            car[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). GO BACK TO MAIN MENU: ");
                        System.out.println("0). EXIT: ");
                        choise = sc.nextInt();
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            }
        }
    }
}