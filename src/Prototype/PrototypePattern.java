package Prototype;

/**
 * Created by admin on 03.05.2017.
 */
public class PrototypePattern {
    public static void main(String[] args) {
        ArmyDepartmentCache.loadCache();

        ArmyDepartment clonedArmyDepartment = (ArmyDepartment) ArmyDepartmentCache.getArmyDepartment("1");
        System.out.println("ArmyDepartment : " + clonedArmyDepartment.getType());

        ArmyDepartment clonedArmyDepartment2 = (ArmyDepartment) ArmyDepartmentCache.getArmyDepartment("2");
        System.out.println("ArmyDepartment : " + clonedArmyDepartment2.getType());

        ArmyDepartment clonedArmyDepartment3 = (ArmyDepartment) ArmyDepartmentCache.getArmyDepartment("3");
        System.out.println("ArmyDepartment : " + clonedArmyDepartment3.getType());
    }
}
