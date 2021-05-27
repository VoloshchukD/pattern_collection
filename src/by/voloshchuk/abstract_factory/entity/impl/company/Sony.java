package by.voloshchuk.abstract_factory.entity.impl.company;

import by.voloshchuk.abstract_factory.entity.Phone;
import by.voloshchuk.abstract_factory.entity.Tablet;
import by.voloshchuk.abstract_factory.entity.TechHardwareCompany;
import by.voloshchuk.abstract_factory.entity.Notebook;
import by.voloshchuk.abstract_factory.entity.impl.product.SonyPhone;
import by.voloshchuk.abstract_factory.entity.impl.product.SonyTablet;
import by.voloshchuk.abstract_factory.entity.impl.product.Vaio;

public class Sony implements TechHardwareCompany {

    @Override
    public Phone createPhone() {
        return new SonyPhone();
    }

    @Override
    public Tablet createTablet() {
        return new SonyTablet();
    }

    @Override
    public Notebook createNotebook() {
        return new Vaio();
    }

}
