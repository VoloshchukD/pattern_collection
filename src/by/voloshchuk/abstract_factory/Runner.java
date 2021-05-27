package by.voloshchuk.abstract_factory;

import by.voloshchuk.abstract_factory.entity.Notebook;
import by.voloshchuk.abstract_factory.entity.Phone;
import by.voloshchuk.abstract_factory.entity.Tablet;
import by.voloshchuk.abstract_factory.entity.TechHardwareCompany;
import by.voloshchuk.abstract_factory.entity.impl.company.Apple;
import by.voloshchuk.abstract_factory.entity.impl.company.Samsung;
import by.voloshchuk.abstract_factory.entity.impl.company.Sony;

public class Runner {
    public static void main(String[] args) {
        TechHardwareCompany appleInc = new Apple();
        TechHardwareCompany sonyCorp = new Sony();
        TechHardwareCompany samsungElectronics = new Samsung();

        Phone phone = appleInc.createPhone();
        Tablet tablet = appleInc.createTablet();
        Notebook notebook = appleInc.createNotebook();
        System.out.println(phone.getClass());
        System.out.println(tablet.getClass());
        System.out.println(notebook.getClass());

        phone = sonyCorp.createPhone();
        tablet = sonyCorp.createTablet();
        notebook = sonyCorp.createNotebook();
        System.out.println(phone.getClass());
        System.out.println(tablet.getClass());
        System.out.println(notebook.getClass());

        phone = samsungElectronics.createPhone();
        tablet = samsungElectronics.createTablet();
        notebook = samsungElectronics.createNotebook();
        System.out.println(phone.getClass());
        System.out.println(tablet.getClass());
        System.out.println(notebook.getClass());
    }
}
