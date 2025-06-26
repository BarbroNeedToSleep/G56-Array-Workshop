package se.lexicon;

import java.util.Arrays;

/**
 * The NameRepository class provides methods to manage a list of names.
 * It offers functionalities such as adding, removing, finding, and updating names.
 */
public class NameRepository {

    private static String[] names = new String[0];
    private static String[] extraNames = new String[0];


    /**
     * Retrieves the current size of the names array.
     *
     * @return The number of elements in the names array.
     */
    public static int getSize() {

        return names.length;
    }


    /**
     * Sets the names array to the provided array of names & it should replace all existing names.
     *
     * @param names The array of names to set.
     */
    public static void setNames(String[] names) {

        NameRepository.names = names;

        extraNames = new String[names.length];
        System.arraycopy(names, 0, extraNames, 0, names.length);


    }


    /**
     * Clears the names array by creating a new empty array.
     */
    public static void clear() {

        names = new String[0];

    }


    /**
     * Returns all names in a new array (Retrieves a copy of the names array).
     *
     * @return A new array containing all elements from the names array.
     */
    public static String[] findAll() {
        names = new String[extraNames.length];
        System.arraycopy(extraNames, 0, names, 0, extraNames.length);
        //NameRepository.names = extraNames;
        return names;
    }


    /**
     * Finds a name that matches the given fullName case-insensitively.
     *
     * @param fullName The full name to search for.
     * @return The matching name if found; otherwise, null.
     */
    public static String find(String fullName) {

       Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        int index = Arrays.binarySearch(NameRepository.names, fullName, String.CASE_INSENSITIVE_ORDER);


       if(index < 0){
            return null;
            //System.out.println("Name not Found");
        }else {
            System.out.println("Name Found: " + NameRepository.names[index]);
            return NameRepository.names[index];
        }
    }


    /**
     * Adds a new fullName to the names array if it doesn't already exist.
     *
     * @param fullName The full name to add.
     * @return True if the fullName is added successfully; false if it already exists.
     */
    public static boolean add(String fullName) {

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        int index = Arrays.binarySearch(NameRepository.names, fullName, String.CASE_INSENSITIVE_ORDER);

        if (index >= 0 ){
            System.out.println("Name already reg");
            return false;
        } else {
            String[] newNames = new String[NameRepository.names.length +1];
            String newElement = fullName;

            for (int i = 0; i < NameRepository.names.length; i++){
                newNames[i] = NameRepository.names[i];
            }
            newNames[newNames.length -1] = newElement;

            System.out.println("Expanded name list: ");
            for (String n : newNames){
                System.out.print(n + " ");
            }
            return true;
        }


    }


    /**
     * Find all names that match the given firstName.
     *
     * @param firstName The first name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByFirstName(String firstName) {
        //todo: findByFirstName method
        return null;
    }


    /**
     * Find all names that match the given lastName.
     *
     * @param lastName The last name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByLastName(String lastName) {
        //todo: implement findByLastName method
        return null;
    }


    /**
     * Updates a name in the names array from the original name to the updated name.
     *
     * @param original    The original name to update.
     * @param updatedName The updated name to set.
     * @return True if the name is updated successfully; false if the updated name already exists or the original name is not found.
     */
    public static boolean update(String original, String updatedName) {
        //todo: implement update method
        return false;
    }


    /**
     * Removes a name from the names array, case-insensitively.
     *
     * @param fullName The full name to remove.
     * @return True if the name is removed successfully; false if the name is not found in the array.
     */
    public static boolean remove(String fullName) {
        //todo: implement remove method
        return false;
    }


}