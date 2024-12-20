package list.OperacoesBasiscas;

public class Guests {

    private String name;

    private int guestsCode;

    public Guests(String name, int guestsCode) {
        this.name = name;
        guestsCode = guestsCode;
    }

    public String getName() {
        return name;
    }

    public int getGuestsCode() {
        return guestsCode;
    }

    @Override
    public String toString() {
        return "Guests{" +
                "name='" + name + '\'' +
                ", GuestsCode=" + guestsCode +
                '}';
    }
}
