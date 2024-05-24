package com.company.hethonggiamsat.web.screens.configstorages;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.ConfigStorages;

@UiController("hethonggiamsat_ConfigStorages.browse")
@UiDescriptor("config-storages-browse.xml")
@LookupComponent("configStoragesesTable")
@LoadDataBeforeShow
public class ConfigStoragesBrowse extends StandardLookup<ConfigStorages> {
}