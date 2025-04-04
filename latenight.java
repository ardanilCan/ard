package arrayPractice;

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {


        String[] colors = {"red", "white", "yellow", "Green", "pink", "black", "blue"};
        //print out each color in reverse version
        //create a new array to store your reversed colors
        // print each reversed color in uppercase but also replace each last letter of each with '$'
        String[] reversedColors = new String[colors.length];

        for ( int i = 0 ; i < colors.length; i++){
            String reversed = "";

            for (int k= colors[i].length()-1 ; k >=0 ; k--){

                reversed += colors[i].charAt(k);

            }
            System.out.println(reversed);
            reversedColors[i] = reversed.replace('e','$').toUpperCase();

        }
        System.out.println(Arrays.toString(reversedColors));



      }
    }
