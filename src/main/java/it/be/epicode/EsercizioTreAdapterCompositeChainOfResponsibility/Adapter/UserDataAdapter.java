package it.be.epicode.EsercizioTreAdapterCompositeChainOfResponsibility.Adapter;


public class UserDataAdapter implements datasource {

    private Info info;
private UserData userData;
public UserDataAdapter(Info info){
this.info = info;
}
    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {

        return 0;
    }
}
