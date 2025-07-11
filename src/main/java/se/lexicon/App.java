package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int size = NameRepository.getSize();
        System.out.println(size);
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan", "Erik Karlsson", "Lina Svensson"});
        System.out.println(NameRepository.getSize());
//        NameRepository.clear();
//        System.out.println(NameRepository.getSize());
        NameRepository.findAll();
        System.out.println(Arrays.toString(NameRepository.findAll()));
        System.out.println(NameRepository.getSize());
        NameRepository.find("Erik Svensson");
        NameRepository.add("Lina Katt");

        System.out.println("nu ska vi se!");
        String[] hittade = NameRepository.findByFirstName("erik");

        System.out.println(Arrays.toString(hittade));

        String[] sistaHittade = NameRepository.findByLastName("Svensson");

        System.out.println(Arrays.toString(sistaHittade));

        // call more methods as needed
    }
}
