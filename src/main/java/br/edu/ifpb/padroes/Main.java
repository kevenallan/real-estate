package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Apartment;
import br.edu.ifpb.padroes.domain.Bungalow;
import br.edu.ifpb.padroes.domain.Payments;
import br.edu.ifpb.padroes.domain.Tenement;

public class Main{
    public static void main(String[] args) {

        Apartment apartment = new Apartment();
        apartment.setAddress("Rua x");
        apartment.setBuilder("Apartamento construtura");
        apartment.setPrice(200000);

        Bungalow bungalow = new Bungalow();
        bungalow.setAddress("Rua y");
        bungalow.setBuilder("Bangalô construtura");
        bungalow.setPrice(150000);

        Tenement tenament = new Tenement();
        tenament.setAddress("Rua y");
        tenament.setBuilder("Cortiço construtura");
        tenament.setPrice(100000);

        // TODO - reduzir chamadas múltiplas para uma única chamada para o método pay() utilizando o padrão composite

        Payments payments = new Payments(apartment,bungalow,tenament);
        payments.pay();
    }
}
