package com.company.hethonggiamsat.web.screens.place;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.Place;

@UiController("hethonggiamsat_Place.edit")
@UiDescriptor("place-edit.xml")
@EditedEntityContainer("placeDc")
@LoadDataBeforeShow
public class PlaceEdit extends StandardEditor<Place> {
}