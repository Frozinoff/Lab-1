import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TVProgram {
    String name;
    String time;

    public TVProgram(String name, String time) {
        this.name = name;
        this.time = time;
    }
}

class TVProgramList {
    List<TVProgram> programs;

    public TVProgramList() {
        programs = new ArrayList<>();
    }

    public void addProgram(TVProgram program) {
        programs.add(program);
    }

    public void printPrograms() {
        for (TVProgram program : programs) {
            System.out.println(program.name + " - " + "Время: " + program.time);
        }
    }

    public void sortByName() {
        Collections.sort(programs, new Comparator<TVProgram>() {
            public int compare(TVProgram program1, TVProgram program2) {
                return program1.name.compareTo(program2.name);
            }
        });
    }

    public void sortByTime() {
        Collections.sort(programs, new Comparator<TVProgram>() {
            public int compare(TVProgram program1, TVProgram program2) {
                return program1.time.compareTo(program2.time);
            }
        });
    }
}

public class Main {
    public static void main(String[] args) {
        TVProgramList programList = new TVProgramList();

        TVProgram program1 = new TVProgram("Образовательная передача", "10:00");
        TVProgram program2 = new TVProgram("Передача для детей", "08:00");
        TVProgram program3 = new TVProgram("Шоу", "20:00");
        TVProgram program4 = new TVProgram("Фильм", "22:00");

        programList.addProgram(program1);
        programList.addProgram(program2);
        programList.addProgram(program3);
        programList.addProgram(program4);

        System.out.println("Неотсортированные программы:");
        programList.printPrograms();

        programList.sortByName();
        System.out.println("\nПрограммы отсортированные по наименованию:");
        programList.printPrograms();

        programList.sortByTime();
        System.out.println("\nПрограммы отсортированные по времени:");
        programList.printPrograms();
    }
}
