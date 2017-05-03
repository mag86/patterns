package Prototype;

import java.util.Hashtable;

/**
 * Created by admin on 03.05.2017.
 */
public class ArmyDepartmentCache {
    private static Hashtable<String, ArmyDepartment> armyDepartmentMap = new Hashtable<String, ArmyDepartment>();

    public static ArmyDepartment getArmyDepartment(String ArmyDepartmentId) {
        ArmyDepartment cachedArmyDepartment = armyDepartmentMap.get(ArmyDepartmentId);
        return (ArmyDepartment) cachedArmyDepartment.clone();
    }

    // for each shape run database query and create shape
    // armyDepartmentMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Department department = new Department();
        department.setId("1");
        armyDepartmentMap.put(department.getId(),department);

        Vzvod vzvod = new Vzvod();
        vzvod.setId("2");
        armyDepartmentMap.put(vzvod.getId(),vzvod);

        Rota rota = new Rota();
        rota.setId("3");
        armyDepartmentMap.put(rota.getId(), rota);

        Batalion batalion = new Batalion();
        batalion.setId("3");
        armyDepartmentMap.put(batalion.getId(), batalion);

        Polk polk = new Polk();
        polk.setId("3");
        armyDepartmentMap.put(polk.getId(), polk);

        Division division = new Division();
        division.setId("3");
        armyDepartmentMap.put(division.getId(), division);


    }
}
