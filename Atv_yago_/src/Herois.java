class Herois {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private boolean isMorto;

    public Herois(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.isMorto = false;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void Info() {
        if (this.isMorto) {
            System.out.println("Nome: " + this.nome + ", Vida: " + this.vida + ", Ataque: " + this.ataque + ", Defesa: " + this.defesa);
        } else {
            System.out.println("Nome: " + this.nome + ", Vida: " + this.vida + ", Ataque: " + this.ataque + ", Defesa: " + this.defesa);
        }

    }

    public void atacar(Herois alvo) {
        if (this.isMorto) {
            System.out.println(this.nome + " está morto, não pode atacar");
        } else if (alvo.isMorto) {
            System.out.println(alvo.nome + "  morreu");
        } else {
            int dano = this.ataque - alvo.defesa;
            if (dano < 0) {
                dano = 0;
            }

            alvo.vida -= dano;
            System.out.println(this.nome + " atacou " + alvo.nome + " causando " + dano + " de dano");
            if (alvo.vida <= 0) {
                alvo.vida = 0;
                alvo.isMorto = true;
                System.out.println(alvo.nome + " foi derrotado");
            } else {
                System.out.println(alvo.nome + " Você tem " + alvo.vida + " de vida.");
            }

        }
    }
}

