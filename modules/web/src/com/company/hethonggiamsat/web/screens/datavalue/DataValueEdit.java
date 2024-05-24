package com.company.hethonggiamsat.web.screens.datavalue;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.DataValue;

@UiController("hethonggiamsat_DataValue.edit")
@UiDescriptor("data-value-edit.xml")
@EditedEntityContainer("dataValueDc")
@LoadDataBeforeShow
public class DataValueEdit extends StandardEditor<DataValue> {
}