package dp.state;

public class AfternoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()<17){
            System.out.println("当前时间："+work.getHour()+"点 下午状态还不错哟，继续努力");
        }else{
            work.setCurrent(new EveningState());
            work.writeProgram();
        }
    }
}
