package list.OperacoesBasiscas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> taskList;

    public ListaTarefa() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Tarefa(description));
    }

    public void removeTask(String description) {
        List<Tarefa> taskToRemove = new ArrayList<>();
        for (Tarefa t : taskList) {
            if(t.getDescription().equalsIgnoreCase(description)) {
                taskToRemove.add(t);
            }
        }
        taskList.removeAll(taskToRemove);
    }

    public int getTotalNumberOfTask(){
        return taskList.size();
    }

    public void getTaskDescription() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.getTotalNumberOfTask());
        listaTarefa.addTask("Taks One");
        listaTarefa.addTask("Taks One");
        listaTarefa.addTask("Taks Two");

        listaTarefa.removeTask("Taks Two");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.getTotalNumberOfTask());

        listaTarefa.getTaskDescription();

    }
}
