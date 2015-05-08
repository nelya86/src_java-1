/*
 * 
 */
package p20150508e4;

/**
 * Utilidades relacionadas con la informática.
 * Desarrollado para la prueba de recuperación P20150508.
 * @author jlcruz-cifp
 */
public class InfoUtils {

    /**
     * Devuelve la cantidad de memoria pasada como argumento, pero normalizada a bytes.
     * @param memoria Dato original, entero positivo, que puede contener al final K, M, G o T
     * @return  Cantidad de memoria convertida a bytes, o -1 si múltiplo incorrecto
     */
    public static Long NormalizaEnBytes(String memoria) {
        Long magnitud = 0L; // para la parte numérica
        String unidades = "";  // para la unidad (K, M...)
        char c; // para ir cortando uno a uno el dato de entrada        
        // mientras que memoria contenga algo y su primer carácter contenga un dígito
        while ((memoria.length()>0) && (Character.isDigit(c = memoria.charAt(0)))) {
            // añadimos el caracter a la magintud y lo retiramos del dato de entrada
            magnitud = (magnitud*10)+Integer.parseInt(Character.toString(c));
            memoria = memoria.substring(1);
        }        
        // acabada la fase anterior, en el dato de entrada sólo quedarán las unidades
        unidades = memoria;
        // realizamos los cálculos sobbre la magnitud, según sean las unidades
        switch (unidades) {
            case "T": magnitud = magnitud * 1024;
            case "G": magnitud = magnitud * 1024;
            case "M": magnitud = magnitud * 1024;
            case "K": magnitud = magnitud * 1024;
            case "B": break;
            case "": break;
            default: magnitud = -1L;
        }
        return magnitud;
    }
    
    /**
     * Devuelve las unidades más adecuadas para la cantidad de memoria que se
     * pasa (siempreen bytes).
     * @param memoria Cantidad de memoria en bytes
     * @return Unidades en las que sería más conveniente expresar dicha cantidad
     */
    public static String UnidadesPara(Long memoria)
    {
        if (memoria>=(1024L*1024L*1024L*1024L))
            return "T";
        else if (memoria>=(1024L*1024L*1024L))
            return "G";
        else if (memoria>=(1024L*1024L))
            return "M";
        else if (memoria>=(1024L))
            return "K";
        else 
            return "B";
    }
}
