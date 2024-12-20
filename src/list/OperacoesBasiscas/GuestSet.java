package list.OperacoesBasiscas;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {

    private Set<Guests> guests;

    public GuestSet() {
        this.guests = new HashSet<>();
    }

    public void addGuests(String name, int code) {

        guests.add(new Guests(name, code));

    }
}
