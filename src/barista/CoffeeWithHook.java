package barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like sugar and milk with your coffee (y/n)?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        try {
            answer = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
