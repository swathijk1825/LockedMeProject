import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseLockedMe {

    /**
     * @param userId
     */
    public static void addNewFileAndDisplay(String userId) {

        Scanner scanToEnterUserId = new Scanner(System.in);
        System.out.println("Please provide your User ID : ");
        userId = scanToEnterUserId.next();
        Scanner scanToEnterNoOfFiles = new Scanner(System.in);
        System.out.print("Please enter the number of files you want to Add: ");

        int sizeOfFile = scanToEnterNoOfFiles.nextInt();

        List<String> fileNames = new ArrayList<>(sizeOfFile);

        System.out.print("Please enter the file names you want to Add: ");

        while (sizeOfFile > 0) {
            Scanner scanToEnterFileNames = new Scanner(System.in);
            String file = scanToEnterFileNames.nextLine();
            fileNames.add(file);
            sizeOfFile--;
        }
        Utils.addFilesToUser(userId, fileNames);
        Utils.listFilesOfUser(userId);
    }

    /**
     * @param userId
     */
    public static void deleteGivenFilesFromUser(String userId) {

        Scanner scanToDeleteFiles = new Scanner(System.in);
        System.out.println("Please provide your User ID : ");
        userId = scanToDeleteFiles.next();
        System.out.print("Please enter the number of files you want to delete: ");
        Scanner scanToDeleteNoOfFiles = new Scanner(System.in);

        int sizeOfFile = scanToDeleteNoOfFiles.nextInt();;
        List<String> deleteFilesNames = new ArrayList<>(sizeOfFile);
        while (sizeOfFile > 0) {
            Scanner scanToEnterFileNames = new Scanner(System.in);
            String file = scanToEnterFileNames.nextLine();
            deleteFilesNames.add(file);
            sizeOfFile--;
        }
            Utils.removeFilesFromUser(userId, deleteFilesNames);
            Utils.listFilesOfUser(userId);
    }

    public static void printStatements()
    {

        System.out.println("======  Press 1 to add files to locked me =======");
        System.out.println("======  press 2 to delete your files =======");
        System.out.println("======  press 3 to retrieve your files =======");

    }
}
