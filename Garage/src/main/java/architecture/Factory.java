package architecture;

import model.User;

public class Factory {
    /**
     * Create User Admin or Client
     * @param id
     * @param nume
     * @param platitReparatie
     * @param suma
     * @param phoneNumber
     * @param accountType
     */
    public User createAccount(int id, String nume, boolean platitReparatie, int suma, String phoneNumber, String accountType){
        User account = null;
        if(accountType != null){
            if(accountType.equals("Client")){
                account = new User(id,nume,platitReparatie,suma,phoneNumber,"Client");
            }
            if(accountType.equals("Admin")) {
                account = new User(id,nume,platitReparatie,suma,phoneNumber,"Admin");
            }

            if(account == null){
                System.out.println("Users can be 2 types: Admin/Client!");
            }
        } else {
            System.out.println("Users can be 2 types: Admin/Client!");
        }

        return account;
    }
}
