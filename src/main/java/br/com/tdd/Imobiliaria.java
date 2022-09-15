package br.com.tdd;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    private List<Imovel> imoveisLocacao;
    private List<Imovel> imoveisVenda;

    public Imobiliaria(){
        this.imoveisLocacao = new ArrayList<>();
        this.imoveisVenda = new ArrayList<>();
    }

    public boolean temImovelParaLocacao() throws Exception {
        throw new Exception("Não implementdo");
    }

    public boolean temImovelParaVenda() throws Exception {
        throw new Exception("Não implementdo");
    }

    public int numImoveisFaixaValorLocacacao(double valorMin, double valorMax) throws Exception {
        throw new Exception("Não implementdo");
    }

    public int numImoveisFaixaValorVenda(double valorMin, double valorMax) throws Exception {
        throw new Exception("Não implementdo");
    }

    public void addImovelLocacao(Imovel imovel) {
        imoveisLocacao.add(imovel);
    }

    public void addImovelVenda(Imovel imovel) {
        imoveisVenda.add(imovel);
    }
}
