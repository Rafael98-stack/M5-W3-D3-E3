package it.be.epicode.EsercizioTreAdapterCompositeChainOfResponsibility.Adapter;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Rafael");
        info.setCognome("Casapao");
        UserDataAdapter userDataAdapter = new UserDataAdapter(info);

        System.out.println(userDataAdapter.getNomeCompleto());
    }
}
