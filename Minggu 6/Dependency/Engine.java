package Dependency;

public class Engine {
    public int status = 0;
    public void StartEngine(){
        System.out.println("Engine has started");
        status = 1;
    }

    public void StopEngine(){
        System.out.println("Engine has stopped");
        status = 0;

    }
}
