package OOP.HW.HW_2;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//    Создать множество ноутбуков.
//    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
//    1 - ОЗУ
//    2 - Объем ЖД
//    3 - Операционная система
//    4 - Цвет …
//    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

  static Scanner scanner = new Scanner(System.in);


  public static void main(String[] args) {
    Notebook macbookPro = new Notebook("macbook", 16, 512, "macos", "silver");
    Notebook samsung = new Notebook("samsung", 8, 256, "widows");
    Notebook dell = new Notebook("dell", 4, 256, "widows", "black");
    Notebook hp = new Notebook("hp", 8, 512);
    Map <String, Integer> criteronChoose = criterionNotebook();
    int ramChoose = criteronChoose.get("RAM");
    int ssdChoose = criteronChoose.get("SSD");


    System.out.println("\nВам подходит ноутбук:");
    if(ramChoose <= macbookPro.getRam() && ssdChoose <= macbookPro.getSsd()) {
      System.out.println(macbookPro);
    }
    if(ramChoose <= samsung.getRam() && ssdChoose <= samsung.getSsd()) {
      System.out.println(samsung);
    }
    if(ramChoose <= dell.getRam() && ssdChoose <= dell.getSsd()) {
      System.out.println(dell);
    }
    if(ramChoose <= hp.getRam() && ssdChoose <= hp.getSsd()) {
      System.out.println(hp);
    }
  }
  private static Map<String, Integer> criterionNotebook() {
    Map <String, Integer> choose = new LinkedHashMap<>();
    System.out.println("Введиите объем желаемой оперативной памяти: ");
    int ram = scanner.nextInt();
    System.out.println("Введиите объем желаемго жестого диска: ");
    int ssd = scanner.nextInt();
    choose.put("RAM", ram);
    choose.put("SSD", ssd);
    System.out.printf("ВАШ ЗАПРОС: \nОбъем RAM: %d GB\nОбъем SSD: %d GB", ram, ssd);
    return choose;
  }
}
