package NivelIntermediario.Records;

public class Ninja {

    private final String nome;
    private final String email;
    private final String telefone;

    public Ninja(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    /*public void setNome(String nome) {
        this.nome = nome;
    }*/

    public String getEmail(){
        return email;
    }

    /*public void setEmail(String email){
        this.email = email;
    }*/

    public String getTelefone(){
        return telefone;
    }

    /*public void setTelefone(String telefone){
        this.telefone = telefone;
    }*/

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
