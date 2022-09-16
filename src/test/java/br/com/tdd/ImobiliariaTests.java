package br.com.tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImobiliariaTests {


    @Test
    void temImovelParaLocacaoTest() throws Exception {

        Imobiliaria imobiliaria = new Imobiliaria();

        Imovel imovel = new Imovel();
        imovel.setCor("ämarelo");
        imovel.setDisponivel(true);
        imovel.setEndereco("rua xpto");
        imovel.setValorVenda(150000);

        imobiliaria.addImovelLocacao(imovel);

        assertTrue(imobiliaria.temImovelParaLocacao());

    }

    @Test
    void numImoveisFaixaValorLocacacaoTest() throws Exception {

        Imobiliaria imobiliaria = new Imobiliaria();

        imobiliaria.addImovelLocacao(mockImovel(100));
        imobiliaria.addImovelLocacao(mockImovel(150));
        imobiliaria.addImovelLocacao(mockImovel(200));
        imobiliaria.addImovelLocacao(mockImovel(250));

        int numImoveis = imobiliaria.numImoveisFaixaValorLocacacao(100, 200);

        assertEquals(0, numImoveis);

    }

    private Imovel mockImovel(double valor) {

        Imovel imovel = new Imovel();
        imovel.setCor("");
        imovel.setDisponivel(true);
        imovel.setEndereco("");
        imovel.setValorVenda(valor);

        return imovel;
    }

}
