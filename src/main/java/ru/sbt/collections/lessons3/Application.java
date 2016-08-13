package ru.sbt.collections.lessons3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LL on 13.08.2016.
 */
public class Application {
    private Map<Long, Truck> truckRegistry = new HashMap<>();
    // вынести в отдельный класс: TruckRegistryByType
    private Map<String, List<Truck>> truckRegistryByType = new HashMap<>();


    public Application(TruckDao truckDao) {
        List<Truck> list = truckDao.list();
        for (Truck truck : list) {
            Truck previouseValue = truckRegistry.put(truck.getId(), truck);
            if (null != previouseValue) {
                throw new IllegalStateException("Two trucks with same id");
            }
        }

    }

    void viewTruckRegistry() {
        System.out.println(truckRegistry);
    }

    public Truck getTruckbyId(long truckId) {
        Truck truck = truckRegistry.get(truckId);
        if (truck == null) {
            throw new IllegalArgumentException("Not found truck with id=" + truckId);
        }
        return truck;
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            printHelp();
            System.exit(-1);
        }
        TruckDao truckDao = new TruckDaoMemotyImpl();
        Application application = new Application(truckDao);
        long truckId = Long.parseLong(args[0]);
        Truck truckbyId = application.getTruckbyId(truckId);
        System.out.println(truckbyId.getCapacity());
    }

    private static void printHelp() {
        System.out.println("User first argument sa truck ID");
    }
}
