package ConcreteDecorators;

import BaseDecorator.PersonagemDecorator;
import Interface.Personagem;

public class AlmaDragonicaDecorator extends PersonagemDecorator {

    public AlmaDragonicaDecorator(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String getDescricao() {
        return personagem.getDescricao() + "/ Habilidade Alma Dragônica ";
    }

    @Override
    public int getPoder() {
        return Math.max(0, personagem.getPoder() + 10);
    }
}
