/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_strukturdata;

import java.util.LinkedList;

/**
 *
 * @author Hp
 */
public class Tugas1_StrukturData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Deklarasi jumlah baris integer
     int jumlahBaris = 10;
     System.out.println("== nomor 1==");
     System.out.println("jumlah baris: " + jumlahBaris);
     System.out.println(); //baris pemisah
     
     //2. Deklarasi variable kalimat baru String
     String kalimatBaru = "Deklarasi tipe data string";
       System.out.println("===== Nomor 2=====");
        System.out.println("kalimat Baru: " + kalimatBaru);
        System.out.println(); //Baris kosong untuk pemisah
     
     
     //3. Deklarasi array 1 dimesni empat Angka
     int[] empatAngka = {7, 10, 20, 23};
     System.out.println("== nomor 3==");
     System.out.println("Array empatAngka: " + " ");
     for (int angka : empatAngka) {
         System.out.print(angka + " ");
     }
     System.out.println(); //baris pemisah
     
     //4.Deklarasi array 2 dimensi alfabet string
     String [][] alfabet = {
         {"A", "B", "C"},
         {"D", "E", "F"}, 
          {"D", "E", "F"}, 
     };
     System.out.println("== nomor 4==");
     System.out.println ("Array dua dimensi alfabet: ");
     for (String [] row : alfabet) {
         for (String element : row) {
             System.out.print(element + " ");
         }
         System.out.println();
     }
     
     //5.Deklarasi Linkedlist Angka
     LinkedList<Integer> listAngka = new LinkedList<>();
     listAngka.add(26);
     listAngka.add(8);
     listAngka.add(23);
     listAngka.add(24);
     listAngka.add(16);
    System.out.println("== nomor 5==");
    System.out.println("LinkedList listAngka: " + listAngka);
   
     }   
     }
     

