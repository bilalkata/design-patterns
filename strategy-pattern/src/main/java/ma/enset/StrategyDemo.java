package ma.enset;

import ma.enset.strategies.StrategyImpl1;
import ma.enset.strategies.StrategyImpl2;
import ma.enset.strategies.StrategyImpl3;

import java.util.Scanner;

public class StrategyDemo {

    static void main() throws Exception {
        Context context = new Context();
        context.apply();
        context.setStrategy(new StrategyImpl1());
        context.apply();
        context.setStrategy(new StrategyImpl2());
        context.apply();
        context.setStrategy(new StrategyImpl3());
        context.apply();
        System.out.println("------------------------------");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter strategy: ");
            String choice = scanner.nextLine();
            Class<?> strategyClass = Class.forName("ma.enset.strategies." + choice);
            Strategy s = (Strategy) strategyClass.getDeclaredConstructor().newInstance();
            context.setStrategy(s);
            context.apply();
        }
    }
}
