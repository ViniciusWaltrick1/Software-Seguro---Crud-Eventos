package prova.model;

public class Evento {
    private String nome;
    private String data;
    private String cidade;
    private String endereco;
    private double preco ;
    private int quant;

    private int id;

    public Evento(){ }

    public Evento(String nome, String data, String cidade, String endereco, double preco, int quant, int id) {
        this.nome = nome;
        this.data = data;
        this.cidade = cidade;
        this.endereco = endereco;
        this.preco = preco;
        this.quant = quant;
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}





