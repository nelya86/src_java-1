/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p20150508e4;

/**
 *
 * @author jlcruz-cifp
 */
public class P20150508E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pruebas preliminares para "InfoUtils.NormalizaEnBytes"
        System.out.println(Long.toString(InfoUtils.NormalizaEnBytes("2")));
        System.out.println(Long.toString(InfoUtils.NormalizaEnBytes("2B")));
        System.out.println(Long.toString(InfoUtils.NormalizaEnBytes("2K")));
        System.out.println(Long.toString(InfoUtils.NormalizaEnBytes("2M")));
        System.out.println(Long.toString(InfoUtils.NormalizaEnBytes("2G")));
        System.out.println(Long.toString(InfoUtils.NormalizaEnBytes("2T")));
        System.out.println(Long.toString(InfoUtils.NormalizaEnBytes("2Z")));
        // Pruebas preliminares para "InfoUtils.UnidadesPara"
        System.out.println(InfoUtils.UnidadesPara(12345678901234L));
        System.out.println(InfoUtils.UnidadesPara(123456789012L));
        System.out.println(InfoUtils.UnidadesPara(1234567890L));
        System.out.println(InfoUtils.UnidadesPara(12345678L));
        System.out.println(InfoUtils.UnidadesPara(123456L));
        System.out.println(InfoUtils.UnidadesPara(1234L));
        System.out.println(InfoUtils.UnidadesPara(12L));
    }
    
}
