package br.com.tdd;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    private List<Imovel> imoveisLocacao;
    private List<Imovel> imoveisVenda;

    public List<Imovel> getImoveisLocacao() {
        return imoveisLocacao;
    }

    public void setImoveisLocacao(List<Imovel> imoveisLocacao) {
        this.imoveisLocacao = imoveisLocacao;
    }

    public List<Imovel> getImoveisVenda() {
        return imoveisVenda;
    }

    public void setImoveisVenda(List<Imovel> imoveisVenda) {
        this.imoveisVenda = imoveisVenda;
    }

    public Imobiliaria(){
        this.imoveisLocacao = new ArrayList<>();
        this.imoveisVenda = new ArrayList<>();
    }

    public boolean temImovelParaLocacao() throws Exception {

        return imoveisLocacao.size() > 0;
    }

    public boolean temImovelParaVenda() throws Exception {
        throw new Exception("Não implementdo");
    }

    public int numImoveisFaixaValorLocacacao(double valorMin, double valorMax) throws Exception {

        int numTotal = 0;

        for (Imovel imovel: imoveisVenda) {
            if (imovel.getValorVenda() >= valorMin && imovel.getValorVenda() <= valorMax) {
                numTotal = numTotal + 1;
            }
        }

        return numTotal;
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
