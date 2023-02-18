package OOP.HW.HW_2;

import java.util.ArrayList;

public class Notebook {

  private ArrayList<Integer> getMyLaptop;
  private String name;
  public int ram;
  private int ssd;
  private String os;
  private String color;
  

  public ArrayList<Integer> getMyLaptop() {
    ArrayList<Integer> chooseLaptop = new ArrayList<>();
    chooseLaptop.add(16);
    chooseLaptop.add(512);
    return chooseLaptop;
  }

  ArrayList<Integer> chooseLaptop;


  public void setChooseLaptop(ArrayList<Integer> chooseLaptop) {
    this.chooseLaptop = chooseLaptop;
  }

  public Notebook(String name, int ram, int ssd, String os, String color) {
    this.name = name;
    this.ram = ram;
    this.ssd = ssd;
    this.os = os;
    this.color = color;
  }
  public Notebook(String name, int ram, int ssd, String os) {
    this.name = name;

    this.ram = ram;
    this.ssd = ssd;
    this.os = os;
  }
  public Notebook(String name, int ram, int ssd) {
    this.name = name;
    this.ram = ram;
    this.ssd = ssd;
  }

  @Override
  public String toString() {
    return "Notebook " +
        "name: '" + name + '\'' +
        ", ram: " + ram +
        ", ssd: " + ssd +
        ", os: '" + os + '\'' +
        ", color: '" + color + '\'' +
        ' ';
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public int getSsd() {
    return ssd;
  }

  public void setSsd(int ssd) {
    this.ssd = ssd;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Integer> getGetMyLaptop() {
    return getMyLaptop;
  }

  public void setGetMyLaptop(ArrayList<Integer> getMyLaptop) {
    this.getMyLaptop = getMyLaptop;
  }
}
