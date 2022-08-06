/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comisiones;

import java.util.Scanner;

/**
 *
 * @author Cesar Perez
 */
public class ClsVendedores {
    private String nombre;
    private double enero;
    private double febrero;
    private double marzo;
    private double abril;
    private double TotalVentas;
    private double Comision20;
    private double Comision35;
    private double TotalVentasComision;
    private double isr;
    private double liquidototal;
    
    public ClsVendedores(String nombre){
        this.nombre = nombre;
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the enero
     */
    public double getEnero() {
        return enero;
    }

    /**
     * @param enero the enero to set
     */
    public void setEnero(double enero) {
        this.enero = enero;
    }

    /**
     * @return the febrero
     */
    public double getFebrero() {
        return febrero;
    }

    /**
     * @param febrero the febrero to set
     */
    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    /**
     * @return the marzo
     */
    public double getMarzo() {
        return marzo;
    }

    /**
     * @param marzo the marzo to set
     */
    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }

    /**
     * @return the abril
     */
    public double getAbril() {
        return abril;
    }

    /**
     * @param abril the abril to set
     */
    public void setAbril(double abril) {
        this.abril = abril;
    }

    /**
     * @return the TotalVentas
     */
    public double getTotalVentas() {
        return TotalVentas;
    }

    /**
     * @param TotalVentas the TotalVentas to set
     */
    public void setTotalVentas(double TotalVentas) {
        this.TotalVentas = TotalVentas;
    }

    /**
     * @return the Comision20
     */
    public double getComision20() {
        return Comision20;
    }

    /**
     * @param Comision20 the Comision20 to set
     */
    public void setComision20(double Comision20) {
        this.Comision20 = Comision20;
    }

    /**
     * @return the Comision35
     */
    public double getComision35() {
        return Comision35;
    }

    /**
     * @param Comision35 the Comision35 to set
     */
    public void setComision35(double Comision35) {
        this.Comision35 = Comision35;
    }

    /**
     * @return the TotalVentasComision
     */
    public double getTotalVentasComision() {
        return TotalVentasComision;
    }

    /**
     * @param TotalVentasComision the TotalVentasComision to set
     */
    public void setTotalVentasComision(double TotalVentasComision) {
        this.TotalVentasComision = TotalVentasComision;
    }

    /**
     * @return the isr
     */
    public double getIsr() {
        return isr;
    }

    /**
     * @param isr the isr to set
     */
    public void setIsr(double isr) {
        this.isr = isr;
    }

    /**
     * @return the liquidototal
     */
    public double getLiquidototal() {
        return liquidototal;
    }

    /**
     * @param liquidototal the liquidototal to set
     */
    public void setLiquidototal(double liquidototal) {
        this.liquidototal = liquidototal;
    }
}
