//task4-InterfaceSegregation
interface Vehicle
{
    void setPrice(double price);
}

interface Movable
{
    void start();
    void stop();
}

interface Flyable
{
    void fly();
}

class Car implements Vehicle,Movable
{
    double price;

    @Override
    public void setPrice(double price)
    {
        this.price = price;
        System.out.println("Car's Price: " +price);
    }

    @Override
    public void start()
    {
        System.out.println("Car's Start Time: 12:00 am");
    }

    @Override
    public void stop()
    {
        System.out.println("Car's Stop Time:1:00 pm");
    }
}


class Aeroplane implements Vehicle, Movable, Flyable
{
    double price;

    @Override
    public void setPrice(double price)
    {
        this.price = price;
        System.out.println("Aeroplane's Price: " +price);
    }

    @Override
    public void start()
    {
        System.out.println("Aeroplane's Start Time: 10.00 pm");
    }

    @Override
    public void stop()
    {
        System.out.println("Aeroplane's Stop Time: 12.00 am");
    }

    @Override
    public void fly()
    {
        System.out.println("Aeroplane's Fly Time: 10.30 pm");
    }
}

 class VehicleBuilder
{
    public static Car builderCar()
    {

        Car car =new Car();
        //car.setPrice(15.00);
        //car.start();
        return car;
    }

    public static Aeroplane buildAeroPlane()
    {
        Aeroplane aeroplane = new Aeroplane();
        //aeroplane.setPrice(25.00);
        //aeroplane.start();
        //aeroplane.fly();
        return aeroplane;
    }
}

public class InterfaceSegregation
{
    public static void main(String[] args)
    {
        Car car = VehicleBuilder.builderCar();
        car.setPrice(15.00);
        car.start();
        car.stop();


        Aeroplane aeroplane = VehicleBuilder.buildAeroPlane();
        aeroplane.setPrice(25.00);
        aeroplane.start();
        aeroplane.stop();
        aeroplane.fly();

        
        

    }
}

   
//Output
// Car's Price: 15.0
// Car's Start Time: 12:00 am
// Car's Stop Time:1:00 pm
// Aeroplane's Price: 25.0
// Aeroplane's Start Time: 10.00 pm
// Aeroplane's Stop Time: 12.00 am
// Aeroplane's Fly Time: 10.30 pm
