package by.voloshchuk.abstract_factory.entity.impl.company;

import by.voloshchuk.abstract_factory.entity.Phone;
import by.voloshchuk.abstract_factory.entity.Tablet;
import by.voloshchuk.abstract_factory.entity.TechHardwareCompany;
import by.voloshchuk.abstract_factory.entity.Notebook;
import by.voloshchuk.abstract_factory.entity.impl.product.Imac;
import by.voloshchuk.abstract_factory.entity.impl.product.Ipad;
import by.voloshchuk.abstract_factory.entity.impl.product.Iphone;

public class Apple implements TechHardwareCompany {

    @Override
    public Phone createPhone() {
        return new Iphone();
    }

    @Override
    public Tablet createTablet() {
        return new Ipad();
    }

    @Override
    public Notebook createNotebook() {
        return new Imac();
    }

}
