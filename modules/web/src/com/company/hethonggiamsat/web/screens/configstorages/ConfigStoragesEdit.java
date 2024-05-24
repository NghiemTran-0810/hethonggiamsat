package com.company.hethonggiamsat.web.screens.configstorages;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.ConfigStorages;

@UiController("hethonggiamsat_ConfigStorages.edit")
@UiDescriptor("config-storages-edit.xml")
@EditedEntityContainer("configStoragesDc")
@LoadDataBeforeShow
public class ConfigStoragesEdit extends StandardEditor<ConfigStorages> {

}