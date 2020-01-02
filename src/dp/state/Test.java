package dp.state;

public class Test {
    public static void main(String[] args){
        Work work=new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(19);
        work.writeProgram();
        work.setFinish(true);
        work.writeProgram();
    }
}
