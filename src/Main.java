public class Main {
    /**
     * Создать экземпляр Класса Люди с термя полями
     * Имя
     * Возраст
     * Вес
     * Создать 5 экземпляров класса человек
     * и вывести их средний возраст.
     */
    public static void main(String[] args) {
        Human HumanFerst = new Human();
        HumanFerst.mAge = 25;
        HumanFerst.mWeight = 85;
        HumanFerst.mName = "Артур";

        Human HumanSecond = new Human();
        HumanSecond.mAge = 45;
        HumanSecond.mWeight = 105;
        HumanSecond.mName = "Алексей";

        Human HumanThree = new Human();
        HumanThree.mAge = 42;
        HumanThree.mWeight = 54;
        HumanThree.mName = "Ольга";

        Human HumanFore = new Human();
        HumanFore.mAge = 20;
        HumanFore.mWeight = 75;
        HumanFore.mName = "Дима";

        Human HumanFive = new Human();
        HumanFive.mAge = 18;
        HumanFive.mWeight = 45;
        HumanFive.mName = "Паша";

        int MiddleAge = HumanFerst.mAge + HumanSecond.mAge + HumanThree.mAge + HumanFore.mAge + HumanFive.mAge;
        System.out.println("Средний возраст 5 людей: " + MiddleAge/5);

    }
}
