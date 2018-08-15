/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;
import java.util.Scanner;
/**
 *
 * @author Fahdina
 */
public class ConvertVocal2Angka {
    
    public static void tampilJudul(String identitas) {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
    public static void main(String[] args){
        String identitas = "Fahdina Hutami Omeini / X RPL 2 / 11";
        
        tampilJudul(identitas);
        String kalimat = tampilInput();
        String convert = vocal2Angka(kalimat);
        tampilkanPerKata(kalimat, convert);
        tampilHasil(convert);
    }
        
        private static String tampilInput() {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Masukan Kalimat: ");
            String kalimat = scanner.nextLine();
            System.out.println("Kalimat Asli : " + kalimat);
            
            return kalimat;
        }
            
        private static String vocal2Angka(String kalimat) {
                char [][] arConvert = 
                {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
                
                kalimat = kalimat.toLowerCase();
        for (char[] arConvert1 : arConvert) {
            kalimat = kalimat.replace(arConvert1[0], arConvert1[1]);
        }
                    
                return kalimat;
                
        }
        private static void tampilkanPerKata(String kalimat, String convert) {
                    String[]  arrKal = kalimat.split(" ");
                    String[]  arrCon = convert.split(" ");
                    
                    for(int i=0;i<arrKal.length;i++)
                        System.out.println(arrKal[i] + " => " + arrCon[i]);
                    
        }
        private static void tampilkanHasil(String convert) {
                System.out.println("Kalimat Alay Angka : " + convert);

                    
            }        

    private static void tampilHasil(String convert) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

                    
            }

            
        
        

    
   
           

        
    

