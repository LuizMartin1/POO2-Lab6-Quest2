/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg6.quest.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Henrique
 */
class Acao implements Sujeito {
    private String name;
    private double price;
    private List<Observer> investors;

    public Acao(String name) {
        this.name = name;
        this.price = price;
        this.investors = new ArrayList<>();
    }

    public void addInvestor(Investidor investor) {
        investors.add(investor);
    }

    public void removeInvestor(Investidor investor) {
        investors.remove(investor);
    }

    public void notifyInvestors() {
        for (Observer investor : investors) {
            investor.update(name, price);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        investors.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        investors.remove(observer);
    }

    @Override
    public void notifyObservers(String actionName, double price) {
        notifyInvestors();
    }
}
