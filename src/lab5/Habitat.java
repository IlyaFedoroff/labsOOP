package lab5;

import java.util.*;
import java.util.Vector;
import java.util.Random;
import java.util.Timer;
import java.util.HashMap;
import java.util.TreeSet;
import lab5.IBehaviour;
import lab5.classes.FemaleRequest;
import lab5.classes.MaleRequest;
import lab5.classes.Request;


public class Habitat {
    // женские заявки
    private Vector<FemaleRequest> requestsFemale = new Vector<>();
    // Мужские заявки
    private Vector<MaleRequest> requestsMale = new Vector<>();

    // уникальные идентификаторы хранятся в TreeSet
    private HashSet<Integer> uniqueIds = new HashSet<>();

    // Коллекция для хранения объектов по времени рождения
    private TreeMap<Long, Request> birthTimeMap = new TreeMap<>();

    // объекты по времени рождения хранятся в HashMap
    private HashMap<Integer, Long> birthTimes = new HashMap<>();

    private boolean simulationRunning;  // флаг работы симуляции
    private long simulationStartTime;   // начало работы симуляции

    private Timer timer;    // таймер
    private Timer simulationTimer;

    private Random random = new Random();


    private static final int FIELD_WIDTH = 800; // Ширина области визуализации
    private static final int FIELD_HEIGHT = 600; // Высота области визуализации


    // задаем интервалы в секундах
    private static final int FEMALE_GENERATION_INTERVAL = 10;
    private static final int MALE_GENERATION_INTERVAL = 5;
    // задаем вероятности создания заявок
    private static final int FEMALE_PROBABILITY = 66;
    private static final int MALE_PROBABILITY = 33;


    public Habitat(){
        // создать коллекции с пустыми ячейками
        this.requestsFemale = new Vector<>();
        this.requestsMale = new Vector<>();
        this.birthTimeMap = new TreeMap<>();
        this.uniqueIds = new HashSet<>();
        //this.timer = new Timer();

        this.simulationRunning=false;
        this.simulationStartTime=0;
    }



    // если событие произошло то возвращается true
    private boolean isEventHappened(int probability) {
        return new Random().nextInt(100) < probability;
    }


    // запуск симуляции с генерацией объектов и их обработкой
    public void startSimulation(){

        if (!simulationRunning) {
            simulationRunning = true;
            simulationStartTime=System.currentTimeMillis();
            startTimer();

        }
        System.out.println("Начинаю симуляцию...");


        // вызываем по таймеру метод Update
    }



    public void update(long elapsedTime){

        System.out.println(elapsedTime / 1000); // вывести в консоль время
        long time = elapsedTime / 1000; // переводим время в секунды

        // генерация новых объектов и помещение их в поле визуала

        if (time % 3 == 0) {    // каждую 3-ую секунду пробуем
            if (isEventHappened(FEMALE_PROBABILITY)){   // генерировать заявку в женский зал
                    FemaleRequest femaleRequest = new FemaleRequest();

                    femaleRequest.setXY(random.nextInt(FIELD_WIDTH), random.nextInt(FIELD_HEIGHT)); // задаем случаные координаты для заявки в границах поля

                    // Добавляем в коллекцию заявку
                    requestsFemale.add(femaleRequest);
                    birthTimeMap.put(System.currentTimeMillis(), femaleRequest);
                    uniqueIds.add(femaleRequest.hashCode());

                    // добавление объекта в визуализацию
                    visualizeObject(femaleRequest);
                }
        }

        if (time % 5 == 0){
            if (isEventHappened(MALE_PROBABILITY)){
                    MaleRequest maleRequest = new MaleRequest();

                    maleRequest.setXY(random.nextInt(FIELD_WIDTH), random.nextInt(FIELD_HEIGHT));


                    // Добавляем в коллекию заявку
                    requestsMale.add(maleRequest);
                    birthTimeMap.put(System.currentTimeMillis(), maleRequest);
                    uniqueIds.add(maleRequest.hashCode());

                    // добавление объекта в визуализацию
                    visualizeObject(maleRequest);
                }
        }
    }


    public void startKeyboardListener(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            if (scanner.hasNext()){
                String key = scanner.next();
                switch (key.toUpperCase()){
                    case "B":
                    startSimulation();
                    break;
                    case "E":
                    stopSimulation();
                    break;
                    default:
                    System.out.println("Не знаю такой кнопки");
                }
            }
        }

    }





    private void visualizeObject(Request request){
        if (request instanceof FemaleRequest) { // проверяем является ли request femaleRequest
            // тогда делаем что-то для femaleRequest
            System.out.println("Создана заявка в женский зал");
            System.out.println(request.getStatistics());

        }
        else if (request instanceof MaleRequest) {
            // Тогда делаем что-то для maleRequest
            System.out.println("Создана заявка в мужской зал");
            System.out.println(request.getStatistics());
        }
        else {
            System.out.println("Неизвестная заявка была создана");
            System.out.println(request.getStatistics());
        }
        System.out.println("Уникальный id: " + Request.getIdCounter());
        System.out.println("Координаты: (" + request.getX() + ", " + request.getY() + ")");
    }

    public void stopSimulation(){
        // код для остановки симуляции
        if (simulationRunning){
            simulationRunning = false;
            stopTimer();
            System.out.println("Симуляция остановлена");
            // clear collections
            birthTimeMap.clear();
            uniqueIds.clear();
            requestsFemale.clear();
            requestsMale.clear();

        }
    }


    private void startTimer(){
        if (simulationTimer == null){
            simulationTimer = new Timer();
            simulationTimer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    long currentTime = System.currentTimeMillis();  // текущее время берется с системного
                    long elapsedTime = currentTime - simulationStartTime;   // прошедшее время = текущее - время старта симуляции
                    update(elapsedTime);    // вызываем основной метод симуляции - Update

                }
            }, 0, 1000); // Здесь 1000 миллисекунд (1 секунда) - интервал таймера

        }
    }

    // метод остановки таймера
    private void stopTimer(){
        if (simulationTimer != null){
            simulationTimer.cancel();
            simulationTimer = null;
        }
    }

    public void displayInfo(){
        // вывод информации о количестве и типе сгенерированных объектов
        // а также время симуляции в поле визуала
    }

    // вывод финальной статистики
    public void printFinalStatistics(){

        System.out.println("Печатаю итоговую статистику");

    }
}
