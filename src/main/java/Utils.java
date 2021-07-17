import java.util.*;

public class Utils {


    static Map fileMap = new HashMap<String, List<String>>();

    /**
     *
     * @param userId
     * @param fileName
     */
    public static void addFilesToUser(String userId, List<String> fileName) {
        if (Objects.nonNull(userId) && Objects.nonNull(fileName)) {
            if (fileMap.containsKey(userId)) {
                List<String> listOfFiles = (List<String>) fileMap.get(userId);
                listOfFiles.addAll(fileName);
                fileMap.put(userId, listOfFiles);
            } else {
                fileMap.put(userId, fileName);
            }
        }
    }

    /**
     *
     * @param userId
     */
    public static void listFilesOfUser(String userId) {
        System.out.println("The filenames of " + userId);
        if (Objects.nonNull(userId)) {
            if (fileMap.containsKey(userId)) {
                List<String> allFileNames = (List<String>) fileMap.get(userId);
                Collections.sort(allFileNames);
                System.out.println(allFileNames);
            } else {
                System.out.println("There is no user " + userId + "Please use option to add the files");
            }
        } else {
            System.out.println("Please enter the values");
        }
    }

    /**
     *
     * @param userId
     * @param fileName
     */
    public static void removeFilesFromUser(String userId, List<String> fileName) {
        if (Objects.nonNull(userId) && Objects.nonNull(fileName)) {
            if (fileMap.containsKey(userId)) {
                List<String> listOfFiles = (List<String>) fileMap.get(userId);
                for (String file : fileName) {
                    listOfFiles.remove(file);
                }
                fileMap.put(userId, listOfFiles);
            } else {
                System.out.println("There is no user " + userId + "Please use option to add the files");
            }
        }
    }

    /**
     *
     * @param userId
     * @param fileName
     */

    public static void searchFileWithGivenUserId(String userId, String fileName) {

        boolean isFileFound = false;
        if (Objects.nonNull(userId) && Objects.nonNull(fileName)) {
            if (fileMap.containsKey(userId)) {
                List<String> allFileNames = (List<String>) fileMap.get(userId);
                for (String file : allFileNames) {

                    if (file.equalsIgnoreCase(fileName)) {

                        System.out.println("The search is succesful your file name is" + fileName);
                        isFileFound = true;
                        break;
                    }
                }
                if (!isFileFound) {

                    System.out.println("The file" + fileName + "could not be found");
                }

            }
        } else {
            System.out.println("The userId" + userId + "you have provided is invalid");
        }
    }
}







