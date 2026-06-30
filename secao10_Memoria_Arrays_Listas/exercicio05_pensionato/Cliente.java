package exercicio05_pensionato;

public class Cliente {

    private int room;
    private String cliente;
    private String email;
    public Cliente(int room, String cliente, String email) {
        this.room = room;
        this.cliente = cliente;
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
