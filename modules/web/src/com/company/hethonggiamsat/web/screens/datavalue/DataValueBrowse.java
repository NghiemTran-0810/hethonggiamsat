package com.company.hethonggiamsat.web.screens.datavalue;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.DataValue;

@UiController("hethonggiamsat_DataValue.browse")
@UiDescriptor("data-value-browse.xml")
@LookupComponent("dataValuesTable")
@LoadDataBeforeShow
public class DataValueBrowse extends StandardLookup<DataValue> {
}