package singleton;

public class SingletonIODH {
    private  SingletonIODH(){

    }
    private  static class  Singleton {
      public  static    SingletonIODH singletonIODH = new SingletonIODH();
    }
    public  static SingletonIODH getInstance(){
        return  Singleton.singletonIODH;;
    }
}
