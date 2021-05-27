package by.voloshchuk.abstract_factory.entity;

import by.voloshchuk.abstract_factory.entity.Notebook;
import by.voloshchuk.abstract_factory.entity.Phone;
import by.voloshchuk.abstract_factory.entity.Tablet;

public interface TechHardwareCompany {

    Phone createPhone();

    Tablet createTablet();

    Notebook createNotebook();

}
