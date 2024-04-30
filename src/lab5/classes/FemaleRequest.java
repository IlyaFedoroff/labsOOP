package lab5.classes;



public class FemaleRequest extends Request {
    // private static final int FEMALE_PROBABILITY = 30; // Вероятность генерации заявки в ЖЗ
    // private static final int FEMALE_GENERATION_INTERVAL = 10; // Интервал генерации заявки в ЖЗ в минутах

    // @Override
    // public void generateRequest(){
    //     Random rand = new Random();
    //     if (rand.nextInt(100) < FEMALE_PROBABILITY) {
    //         // генерация заявки в ЖЗ
    //         System.out.println("Сгенерирована заявка в женский зал");
    //     }
    // }

    @Override
    public void processRequest(){
        // Логика обработки заявки в ЖЗ

    }

    @Override
    public void printStatistics(){
        // Логика вывода статистики для ЖЗ
    }
}
