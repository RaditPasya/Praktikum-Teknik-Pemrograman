package Dependency;

public class Plane {
    public void fly(Engine mesin){
        mesin.StartEngine();
        if(mesin.status == 1){
            System.out.println("This plane is taking off");
        }else{
            System.out.println("This plane's engine has not started");
        }
    }
}
