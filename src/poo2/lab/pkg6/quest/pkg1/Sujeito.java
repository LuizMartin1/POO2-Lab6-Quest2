/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poo2.lab.pkg6.quest.pkg1;

/**
 *
 * @author Luiz Henrique
 */
public interface Sujeito {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String actionName, double price);
}
