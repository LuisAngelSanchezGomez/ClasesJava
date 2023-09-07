package OtrosEjercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class NameScore {
    public static void main(String[] args) throws IOException {
        //read names from file and sort them
        String[] names=getNames("C:\\Users\\luis2\\Documents\\java\\Ejercicios\\first_names.txt");
        //System.out.println(Arrays.toString(names));
        Arrays.sort(names);

        //get calculation for all names score
        int totalScore=0;
        for (int i=0; i<names.length; i++){
            int scoreByName= getScoreByName(names[i],i+1);
            totalScore += scoreByName;
        }
        System.out.println("The score for all names is: "+totalScore);

    }
    public static String[] getNames (String fileName) throws IOException {
        String[] cont= Files.readAllLines(Paths.get(fileName)).toArray(new String[0]);
        for (int i=0; i< cont.length;i++){
            cont[i]= cont[i].replaceAll("\"","");
        }
        String allNames= String.join(",",cont);
        return allNames.split(",");
    }
    public static int getScoreByName(String names, int position){
        int nameValue = 0;
        for (char letter:names.toCharArray()){
            nameValue += letter-'A'+1;
        }
        int scoreName= nameValue*position;
        return scoreName;
    }
}
