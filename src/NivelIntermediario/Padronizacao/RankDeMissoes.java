package NivelIntermediario.Padronizacao;

public enum RankDeMissoes {
    D( "Baixo", 2),
    C( "Moderado", 3),
    B( "Confortavel",  4),
    A( "Dificil", 5),
    S( "Altissima",  10);

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade){
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

}
