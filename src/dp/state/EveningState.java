package dp.state;

public class EveningState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.isFinish()){
            work.setCurrent(new SleepingState() );
            work.writeProgram();
        }else {
            if(work.getHour()<21){
                System.out.println("当前时间："+work.getHour()+"点 加班哦，疲惫至极");
            }else{
                work.setCurrent(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
