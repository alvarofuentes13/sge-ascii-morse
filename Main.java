import java.util.HashMap;
import java.util.Scanner;

// Traducir ascii a morse
public class Main {

    public static void main(String[] args) {

        HashMap <Character, String> asciiMorse = new HashMap<>();
        asciiMorse.put('a', "._");
        asciiMorse.put('b', "_...");
        asciiMorse.put('c', "_._.");
        asciiMorse.put('d', "_..");
        asciiMorse.put('e', ".");
        asciiMorse.put('f', ".._.");
        asciiMorse.put('g', "__.");
        asciiMorse.put('h', "....");
        asciiMorse.put('i', "..");
        asciiMorse.put('j', ".___");
        asciiMorse.put('k', "_._");
        asciiMorse.put('l', "._..");
        asciiMorse.put('m', "__");
        asciiMorse.put('n', "_.");
        asciiMorse.put('ñ', "__.__");
        asciiMorse.put('o', "___");
        asciiMorse.put('p', ".__.");
        asciiMorse.put('q', "__._");
        asciiMorse.put('r', "._.");
        asciiMorse.put('s', "...");
        asciiMorse.put('t', "_");
        asciiMorse.put('u', ".._");
        asciiMorse.put('v', "..._");
        asciiMorse.put('w', ".__");
        asciiMorse.put('x', "_.._");
        asciiMorse.put('y', "");
        asciiMorse.put('z', "__..");

        System.out.println("Escribe una frase, la traducire a morse");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) != ' ' ){
                System.out.print(asciiMorse.get(frase.charAt(i)) + " ");
            }else{
                System.out.print(" ");
            }
        }
    }

}
