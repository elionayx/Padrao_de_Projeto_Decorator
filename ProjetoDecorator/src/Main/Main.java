package Main;

import ConcreteComponent.Elfo;
import ConcreteDecorators.AlmaDragonicaDecorator;
import ConcreteDecorators.IntuicaoSombriaDecorator;
import ConcreteDecorators.RaioLunarDecorator;
import Interface.Personagem;

public class Main {
    public static void main(String[] args) {
        try {
            Personagem elfo = new Elfo();
            System.out.println("Personagem: " + elfo.getDescricao() + " Poder:" + elfo.getPoder());

            elfo = new RaioLunarDecorator(elfo);
            System.out.println(elfo.getDescricao() + "Poder:" + elfo.getPoder());

            elfo = new IntuicaoSombriaDecorator(elfo);
            System.out.println(elfo.getDescricao() + "Poder:" + elfo.getPoder());

            elfo = new AlmaDragonicaDecorator(elfo);
            System.out.println(elfo.getDescricao() + "Poder:" + elfo.getPoder());

            // testar decorator VeuNoturno

        } catch (IllegalArgumentException e) {
            System.err.println("ERRO: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado." + e.getMessage());
        }
    }
}