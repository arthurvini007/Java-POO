package UltraEmojiCombat;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private Boolean aprovada;

    // Metodos Publicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;

        } else {
            this.aprovada = false;
            this.aprovada = null;
            this.desafiante = null;
        }

    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("######Desafiado#########");
            this.desafiado.apresentar();
            System.out.println("#######Desafiante########");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                    break;
                case 1:// vencerdor dasafiado
                    System.out.println("venceu ! " + desafiado.getNome());
                    this.desafiado.ganharluta();
                    this.desafiante.perderluta();
                    break;
                case 2: // vencedor desafiante
                    System.out.println("venceu ! " + desafiante.getNome());
                    this.desafiante.ganharluta();
                    this.desafiado.perderluta();
                    break;
            }
        } else {
            System.out.println("A luta nao pode acontecer");
        }
    }

    // Getters e Satters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(Lutador desafiante) {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }

}
