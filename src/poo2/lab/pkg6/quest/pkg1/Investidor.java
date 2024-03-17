/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg6.quest.pkg1;

/**
 *
 * @author Luiz Henrique
 */
class Investidor implements Observer {

    private String name;
    private AcaoBroker broker;
    private double minPrice;
    private double maxPrice;

    public Investidor(String name, AcaoBroker broker, double minPrice, double maxPrice) {
        this.name = name;
        this.broker = broker;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public void buy(Acao action, double price) {
        broker.buy(action, this);
    }

    public void sell(Acao action, double price) {
        broker.sell(action, this);
    }

    @Override
    public void update(String actionName, double price) {
        // Implementação da lógica de atualização do investidor com base na variação de preço
        if (price >= maxPrice) {
            System.out.println("Investidor " + name + " vendeu acao " + actionName + " por " + price);
            sell(new Acao(actionName), price);
        } else if (price <= minPrice) {
            System.out.println("Investidor " + name + " comprou acao " + actionName + " por " + price);
            buy(new Acao(actionName), price);
        }
    }
}
