package Logistics;

import Location.Location;
import Order.Order;
import User.User;
import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogisticsSystem {

    private List<Order> orders;
    private List<Vehicle> vehicles;
    private List<String> users;
    Scanner nUser = new Scanner(System.in);

    public LogisticsSystem()
    {
        this.orders = new ArrayList<Order>();
        this.vehicles = new ArrayList<Vehicle>();
        this.users = new ArrayList<String>();
    }

    public void takeAnOrder(Order order)
    {
        //Aqui devemos colocar um Scanner
        System.out.println("Novo pedido: ");
        orders.add(order);
    }

    public void processOrder(Order order)
    {
        System.out.println("Processing an order of the system");
    }

    public Location trackOrder(int orderId)
    {
        System.out.println("Tracking an order of the system");
        Location location = null;
        // location = findLocationOfGivenOrder();
        return location;
    }

    public void cacelOrder(Order order)
    {
        System.out.println("Going to cancell an order of the system");
    }

    public void registerNewUser(User user)
    {
        //adicionado um Scanner para registro de novo usuário
        System.out.println("Registre o novo usuário: ");
        users.add(nUser.nextLine());
    }

    public List<Order> getOrders()
    {
        return orders;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }

    public List<Vehicle> getVehicles()
    {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles)
    {
        this.vehicles = vehicles;
    }

    public List<String> getUsers()
    {
        return users;
    }

    public void setUsers(List<String> users)
    {
        this.users = users;
    }
}
