public class Card{ 

 private String cara;
 private String palo;
 private String color;
 
    public Card( String caraCarta, String paloCarta , String colorsCarta ) {   
        
        cara = caraCarta;
        palo = paloCarta;
        color = colorsCarta;

    }  

    public String toString() {  
        return cara + " de " + palo + " " + color +" ";
    }   
} 
