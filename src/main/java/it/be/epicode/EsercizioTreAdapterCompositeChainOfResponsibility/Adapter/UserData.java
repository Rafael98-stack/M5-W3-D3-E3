package it.be.epicode.EsercizioTreAdapterCompositeChainOfResponsibility.Adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData(datasource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
