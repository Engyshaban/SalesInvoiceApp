package com.Sigapp.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileOperations {
      
   public static List<String> readFile( String filepath) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
            List<String> listOfInvoice = new ArrayList<>();
            String invLn;
            //read for each line
            while((invLn = br.readLine()) != null){
                listOfInvoice.add(invLn);
            }
            return listOfInvoice;
        }
    }
  //method write file in invoiceHeader
    public static void writeFile(List<String> listOfInvoice, String filepath) throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))){
            for(String str: listOfInvoice){
                bw.write(str);
                bw.newLine();
            }
        }
    } 
    public ArrayList<String[]> Readfile(File InvHeader, ArrayList<String[]> listOfInvoice) {
            return listOfInvoice ;
   }
      public static void main(String[] args){
          
      
    }
 }
   
