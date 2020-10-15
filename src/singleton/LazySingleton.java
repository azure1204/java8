package singleton;

public class LazySingleton {
    private  LazySingleton(){

    }
    private static   volatile LazySingleton lazySingleton;

    public  static  LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                   lazySingleton = new LazySingleton();                // return  new LazySingleton();
                }
            }
        }
        return  lazySingleton;
    }
}
