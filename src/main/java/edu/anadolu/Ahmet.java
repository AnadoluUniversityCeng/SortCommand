package edu.anadolu;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Ahmet {


    public static void main(String[] args) throws IOException {

        System.out.println("I".toLowerCase(Locale.US));

        System.out.println("I".toLowerCase(Locale.forLanguageTag("tr-TR")));

        System.out.println("I".toLowerCase());

        // java Sort friends.txt tr-TR
        // args [0] is friends.txt
        // args [1] is tr-TR
        Collator myCollator = Collator.getInstance(Locale.forLanguageTag("tr-TR"));
        myCollator.setStrength(Collator.PRIMARY);

        String[] array = new String[]{"ç", "g", "ğ", "y", "z", "a", "b", "ö", "ş"};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, myCollator);

        System.out.println(Arrays.toString(array));


        List<String> lines = Files.readAllLines(Paths.get("myfile"), StandardCharsets.UTF_8);

        lines.sort(myCollator);


    }
}
