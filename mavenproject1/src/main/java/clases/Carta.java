
package clases;



public class Carta {
    
    private int numero;
    private String letra;

    public Carta(int numero, String letra) {
        this.numero = numero;
        this.letra = letra;
    }
    
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carta{");
        sb.append("numero=").append(numero);
        sb.append(", letra=").append(letra);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
