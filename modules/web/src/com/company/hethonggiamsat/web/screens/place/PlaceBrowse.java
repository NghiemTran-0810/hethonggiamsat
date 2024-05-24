package com.company.hethonggiamsat.web.screens.place;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.Place;

@UiController("hethonggiamsat_Place.browse")
@UiDescriptor("place-browse.xml")
@LookupComponent("placesTable")
@LoadDataBeforeShow
public class PlaceBrowse extends StandardLookup<Place> {
}