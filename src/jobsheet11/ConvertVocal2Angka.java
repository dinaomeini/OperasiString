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

            
        
        }   

    
   
           

        
    

