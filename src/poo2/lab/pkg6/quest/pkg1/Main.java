/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg6.quest.pkg1;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Acao acao = new Acao("Itau");
        AcaoBroker broker = new AcaoBroker();
        Investidor investidor = new Investidor("Carlos", broker, 50.0, 150.0);

        acao.registerObserver(investidor);

        acao.notifyObservers("Itau", 150.0);
    }
    
}
