package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int size = NameRepository.getSize();
        System.out.println(size);
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        System.out.println(NameRepository.getSize());
        NameRepository.clear();
        NameRepository.findAll();
        System.out.println(Arrays.toString(NameRepository.findAll()));
        System.out.println(NameRepository.getSize());
        NameRepository.find("Erik Svensson");
        NameRepository.add("Lina Katt");

        // call more methods as needed
    }
}
