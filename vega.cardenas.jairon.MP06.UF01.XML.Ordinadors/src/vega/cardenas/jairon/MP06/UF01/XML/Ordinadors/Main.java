package vega.cardenas.jairon.MP06.UF01.XML.Ordinadors;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static final String FITXER_INDIVIDUAL = "Fitxers/ordinador.xml";
	private static final String FITXER_LLISTA = "Fitxers/ordinadors.xml";
    public static void main(String[] args) {

    	Ordinador ordinador1 = new Ordinador("8531175", "Acer","Nitro N-50",16,1000,"Intel");
        Ordinador ordinador2 = new Ordinador("9312511", "MSI","GF63 Thin",32,500,"Intel");

        List<Ordinador> ordinadors = new ArrayList<>();
        ordinadors.add(ordinador1);
        ordinadors.add(ordinador2);

        OrdinadorLogic logic = new OrdinadorLogic();

        logic.serializeOrdinador(ordinador1, FITXER_INDIVIDUAL);
        logic.serializeOrdinadors(ordinadors, FITXER_LLISTA);
        

        Ordinador deserializedOrdinador = logic.deserializeOrdinador(FITXER_INDIVIDUAL);
        System.out.println("\nOrdinador deserialitzat des de fitxer XML:");
        System.out.println(deserializedOrdinador);

        List<Ordinador> deserializedOrdinadors = logic.deserializeOrdinadors(FITXER_LLISTA);
        System.out.println("\nLlista d'Ordinadors deserialitzada des de fitxer XML:");
        for (Ordinador ordinador : deserializedOrdinadors) {
            System.out.println(ordinador);
        }
    }
}
