package list.OperacoesBasiscas;

public class Tarefa {

    private String description;

    public Tarefa(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "description='" + description + '\'' +
                '}';
    }
}
