import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeApplication extends BaseLockedMe {

    public static void main(String[] args) {

        System.out.println("======  Welcome To LockedMe.com Application =======");
        System.out.println("======  save  your files using locked me applications =======");
        System.out.println("======  Press 1 to get started with adding files to locked me =======");
        int options = 0;
        int suboption = 0;
        String userId = null;
        boolean isToExitApplication = false;

        Scanner keyboard = new Scanner(System.in);
        options = keyboard.nextInt();
        while (!isToExitApplication) {

            switch (options) {
                case 1:
                    System.out.println("\n---------------------------------------");
                    addNewFileAndDisplay(userId);
                    System.out.print("Files are added succesfully ");
                    System.out.print("Press use the other options above ");
                    while (true) {
                        Scanner sci = new Scanner(System.in);
                        suboption = sci.nextInt();

                        switch (suboption) {
                            case 1:
                                addNewFileAndDisplay(userId);
                                printStatements();
                                break;
                            case 2:
                                deleteGivenFilesFromUser(userId);
                                System.out.print("Please choose another option to continue : ");
                                printStatements();
                                break;

                            case 3:
                                Scanner scanToFindFiles = new Scanner(System.in);
                                System.out.println("Please provide your User ID : ");
                                userId = scanToFindFiles.next();
                                Utils.listFilesOfUser(userId);
                                System.out.print("Please choose another option to continue : ");
                                printStatements();

                                break;

                            case 4:
                                Scanner scanTolistFiles = new Scanner(System.in);
                                System.out.println("Please provide your User ID : ");
                                userId = scanTolistFiles.next();
                                System.out.print("Please enter the file name you want to search: ");
                                Scanner scanToSearchFile = new Scanner(System.in);

                                scanToSearchFile = new Scanner(System.in);
                                Utils.searchFileWithGivenUserId(userId, scanToSearchFile.next());

                                System.out.print("Please choose another option to continue : ");
                                printStatements();

                                break;

                            case 5:
                                System.out.println("Thanks for using the Locked me application");
                                isToExitApplication = true;
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Please choose the correct option ");

                                break;
                        }
                    }
            }
        }
    }
}

