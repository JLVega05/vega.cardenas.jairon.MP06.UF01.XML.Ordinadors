package vega.cardenas.jairon.MP06.UF01.XML.Ordinadors;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.List;

public class OrdinadorLogic {

    public void serializeOrdinador(Ordinador ordinador, String filename) {
		try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)))) {
			encoder.writeObject(ordinador);
	    System.out.println("Ordinador serialitzat a XML: " + filename);
	    } catch (IOException e) {
	    System.err.println("Error en serialitzar Ordinador: " + e.getMessage());
	    }
	 }
    
    public Ordinador deserializeOrdinador(String filename) {
    	try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)))) {
            return (Ordinador) decoder.readObject();
        } catch (IOException e) {
            System.err.println("Error en deserialitzar Ordinador: " + e.getMessage());
            return null;
        }
    }
    
    public void serializeOrdinadors(List<Ordinador> ordinador, String filename) {
    	try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)))) {
            encoder.writeObject(ordinador);
            System.out.println("Llista d'Ordinadors serialitzada a XML: " + filename);
        } catch (IOException e) {
            System.err.println("Error en serialitzar llista d'Ordinador: " + e.getMessage());
        }
    }

    

    public List<Ordinador> deserializeOrdinadors(String filename) {
    	try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)))) {
            return (List<Ordinador>) decoder.readObject();
        } catch (IOException e) {
            System.err.println("Error en deserialitzar llista d'Ordinador: " + e.getMessage());
            return null;
        }
    }
}
