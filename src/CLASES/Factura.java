/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;


public class Factura {
    int Codigo;
    int ND;
    int PD;
    int extra;
    int total;

    public Factura(int Codigo, int ND, int PD, int extra, int total) {
        this.Codigo = Codigo;
        this.ND = ND;
        this.PD = PD;
        this.extra = extra;
        this.total = total;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getND() {
        return ND;
    }

    public void setND(int ND) {
        this.ND = ND;
    }

    public int getPD() {
        return PD;
    }

    public void setPD(int PD) {
        this.PD = PD;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "Codigo=" + Codigo + ", ND=" + ND + ", PD=" + PD + ", extra=" + extra + ", total=" + total + '}';
    }
    
    
}
