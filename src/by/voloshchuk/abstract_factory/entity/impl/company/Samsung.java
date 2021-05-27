package by.voloshchuk.abstract_factory.entity.impl.company;

import by.voloshchuk.abstract_factory.entity.Phone;
import by.voloshchuk.abstract_factory.entity.Tablet;
import by.voloshchuk.abstract_factory.entity.TechHardwareCompany;
import by.voloshchuk.abstract_factory.entity.Notebook;
import by.voloshchuk.abstract_factory.entity.impl.product.SamsungNotebook;
import by.voloshchuk.abstract_factory.entity.impl.product.SamsungPhone;
import by.voloshchuk.abstract_factory.entity.impl.product.SamsungTablet;

public class Samsung implements TechHardwareCompany {

    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Tablet createTablet() {
        return new SamsungTablet();
    }

    @Override
    public Notebook createNotebook() {
        return new SamsungNotebook();
    }

}
