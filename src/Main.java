import RockBite_Games.QuestGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println(QuestGenerator.generateQuests(10));
        System.out.println(QuestGenerator.generateQuests(20));
        System.out.println(QuestGenerator.generateQuests(60));
        System.out.println(QuestGenerator.generateQuests(100));
        System.out.println(QuestGenerator.generateQuests(250));
        System.out.println(QuestGenerator.generateQuests(600));
        System.out.println(QuestGenerator.generateQuests(1500));
    }
}