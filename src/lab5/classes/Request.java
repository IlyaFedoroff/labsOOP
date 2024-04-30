package lab5.classes;
import lab5.IBehaviour;
public abstract class Request implements IBehaviour {

    private static int idCounter = 0;
    protected int id;
    protected long birthTime;
    private int x;
    private int y;

    public Request() {
        id = idCounter++;
        birthTime = System.currentTimeMillis();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static long getIdCounter(){
        return idCounter;
    }

    @Override
    public int hashCode(){
        long result = 17;
        result = 31 * result + birthTime;
        result = 31 * result + idCounter;
        return (int) (result ^ (result >>> 32));
    }

    // // генерация заявки
    // public abstract void generateRequest();

    // // обработка заявки
    // public abstract void processRequest();

    // вывод статистики
    public String getStatistics(){

        String stat = "Счетчик idCounter: " + Integer.toString(idCounter) + " id: " + Integer.toString(id) + " x: "
         + Integer.toString(x) + " y: " + Integer.toString(y) + " birthTime: " + Long.toString(birthTime);
         return stat;
    }
}
