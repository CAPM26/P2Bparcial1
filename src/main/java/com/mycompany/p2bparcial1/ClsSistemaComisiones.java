/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2bparcial1;

import Comisiones.ClsVendedores;

/**
 *
 * @author Cesar Perez
 */
public class ClsSistemaComisiones {
    
    private static ClsVendedores[] v = new ClsVendedores[5];
    
    public static void ingresoVendedores(){
        v[0] = new ClsVendedores("Carlos");
        v[0].setEnero(145);
        v[0].setFebrero(350);
        v[0].setMarzo(535);
        v[0].setAbril(790);
        
        v[1] = new ClsVendedores("Isaí");
        v[1].setEnero(600);
        v[1].setFebrero(300);
        v[1].setMarzo(250);
        v[1].setAbril(400);
        
        v[2] = new ClsVendedores("Monica");
        v[2].setEnero(390);
        v[2].setFebrero(870);
        v[2].setMarzo(1005);
        v[2].setAbril(200);
        
        v[3] = new ClsVendedores("Belen");
        v[3].setEnero(700);
        v[3].setFebrero(1300);
        v[3].setMarzo(400);
        v[3].setAbril(250);
        
        
        v[4] = new ClsVendedores("Alex");
        v[4].setEnero(245);
        v[4].setFebrero(350);
        v[4].setMarzo(500);
        v[4].setAbril(990);
    }
    
    public static void TotalVentasVendedores(){
        for (int i = 0; i < v.length; i++) {
            double SumaTotalTemp = 0;
            SumaTotalTemp = (v[i].getEnero() + v[i].getFebrero() + v[i].getMarzo() + v[i].getAbril());
            v[i].setTotalVentas(SumaTotalTemp);
        }
    }
    
    public static void ComisionxVentas20(){
        for (int i = 0; i < v.length; i++) {
            double tempComisionx20 = 0;
            if (v[i].getTotalVentas()<=2000) {
                tempComisionx20 = v[i].getTotalVentas()*0.20;
                v[i].setComision20(Math.round(tempComisionx20*100.0)/100.0);
            }
            else{
            v[i].setComision20(0);
            }
        }
    }
    
    public static void ComisionxVentas35(){
        for (int i = 0; i < v.length; i++) {
            double tempComisionx35 = 0;
            if (v[i].getTotalVentas()>=2001) {
                tempComisionx35 = v[i].getTotalVentas()*0.35;
                v[i].setComision35(Math.round(tempComisionx35*100.0)/100.0);
            }
            else{
            v[i].setComision35(0);
            }
        }
    }
    
    public static void TotalVentasconComision(){
        for (int i = 0; i < v.length; i++) {
            v[i].setTotalVentasComision((v[i].getTotalVentas()+v[i].getComision20()+v[i].getComision35()));
        }
    }
    
    public static void RestarISR(){
        for (int i = 0; i < v.length; i++) {
            double tempISR = 0;
            tempISR = v[i].getTotalVentasComision()*0.05;
            v[i].setIsr(Math.round(tempISR*100.0)/100.0);
        }
    }
    
    public static void SueldoLiquido(){
        for (int i = 0; i < v.length; i++) {
            v[i].setLiquidototal(v[i].getTotalVentasComision()-v[i].getIsr());
        }
    }
    
    public static int MayorSueldoRecibido(){
        double MayorSueldo = v[0].getLiquidototal();
        int bandera = 0;
        for (int i = 1; i < v.length; i++) {
            if (v[i].getLiquidototal()>MayorSueldo) {
                MayorSueldo = v[i].getLiquidototal();
                bandera = i;
            }
        }
        return bandera;
    }
    
    public static int MenorSueldoRecibido(){
        double MenorSueldo = v[0].getLiquidototal();
        int bandera = 0;
        for (int i = 1; i < v.length; i++) {
            if (v[i].getLiquidototal() < MenorSueldo) {
                MenorSueldo = v[i].getLiquidototal();
                bandera = i;
            }
        }
        return bandera;
    }
    
    public static void CasillaTotales(){
        double totalEnero, totalFebrero, totalMarzo, totalAbril, totalVenta, total20, total35, totalComision, totalIsr, totalLiquido;
        totalEnero = totalFebrero = totalMarzo = totalAbril = totalVenta = total20 = total35 = totalComision = totalIsr = totalLiquido = 0;
        for (int i = 0; i < v.length; i++) {
            totalEnero += (v[i].getEnero());
            totalFebrero += (v[i].getFebrero());
            totalMarzo += (v[i].getMarzo());
            totalAbril += (v[i].getAbril());
            totalVenta += (v[i].getTotalVentas());
            total20 += (v[i].getComision20());
            total35 += (v[i].getComision35());
            totalComision += (v[i].getTotalVentasComision());
            totalIsr += (v[i].getIsr());
            totalLiquido += (v[i].getLiquidototal());
        }
        totalEnero = Math.round(totalEnero*100)/100;
        totalFebrero = Math.round(totalFebrero*100)/100;
        totalMarzo = Math.round(totalMarzo*100)/100;
        totalAbril = Math.round(totalAbril*100)/100;
        totalVenta = Math.round(totalVenta*100)/100;
        total20 = Math.round(total20*100)/100;
        total35 = Math.round(total35*100)/100;
        totalComision = Math.round(totalComision*100)/100;
        totalIsr = Math.round(totalIsr*100)/100;
        totalLiquido = Math.round(totalLiquido*100)/100;
        
            System.out.println("|TOTAL"+"\t|\t"+totalEnero+"\t|\t"+totalFebrero+"\t|\t"+totalMarzo+"\t|\t"+totalAbril+"\t|\t"+totalVenta+"\t|\t"+total20+"\t|\t"+total35+"\t|\t"+totalComision+"\t|\t"+totalIsr+"\t|\t"+totalLiquido+"\t|");
    }
     
    public static void MostrarDatos(){
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|"+"\t|\t"+"\t|\t"+"\t|\t"+"\t|\t"+"\t|\t"+"TOTAL"+"\t|\t"+"COMIS."+"\t|\t"+"COMIS."+"\t|\t"+"VENTAS"+"\t|\t"+"\t|\t"+"\t|");
        System.out.println("|"+"Nombre"+"\t|\t"+"ENERO"+"\t|\t"+"FEBRERO"+"\t|\t"+"MARZO"+"\t|\t"+"ABRIL"+"\t|\t"+"VENTAS"+"\t|\t"+"20%"+"\t|\t"+"35%"+"\t|\t"+"COMIS."+"\t|\t"+"ISR"+"\t|\t"+"LIQUIDO\t|");
        for (int i = 0; i < v.length; i++) {
            System.out.println("|"+v[i].getNombre()+"\t|\t"+v[i].getEnero()+"\t|\t"+v[i].getFebrero()+"\t|\t"+v[i].getMarzo()+"\t|\t"+v[i].getAbril()+"\t|\t"+v[i].getTotalVentas()+"\t|\t"+v[i].getComision20()+"\t|\t"+v[i].getComision35()+"\t|\t"+v[i].getTotalVentasComision()+"\t|\t"+v[i].getIsr()+"\t|\t"+v[i].getLiquidototal()+"\t|");
        }
        CasillaTotales();
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
    } 
    
    public static void main(String[] args) {
        
        ingresoVendedores();
        TotalVentasVendedores();
        ComisionxVentas20();
        ComisionxVentas35();
        TotalVentasconComision();
        RestarISR();
        SueldoLiquido();
        int Masueldo = MayorSueldoRecibido();
        int mesueldo = MenorSueldoRecibido();
        
        MostrarDatos();
        
        System.out.println("\nVENDEDOR(A) CON MAYOR SUELDO: "+v[Masueldo].getNombre());
        System.out.println("VENDEDOR(A) CON MENOR SUELDO: "+v[mesueldo].getNombre());
    }
}
