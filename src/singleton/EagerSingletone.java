package singleton;

public class EagerSingletone {

    private  EagerSingletone(){

    }
    private  static  EagerSingletone eagerSingletone = new EagerSingletone();

    public  static EagerSingletone getInstance(){
        return  eagerSingletone;
    }
}
