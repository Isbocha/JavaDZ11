package ru.netology.JavaDZ11.ToDos;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        //String sub = subtasks[0];
        for (String sub : subtasks) {
            if (sub.contains(query)) {
                return true;
            }
        }
            return false;
        }
    }



