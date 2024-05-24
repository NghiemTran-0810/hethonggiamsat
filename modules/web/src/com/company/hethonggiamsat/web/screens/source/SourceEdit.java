package com.company.hethonggiamsat.web.screens.source;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.Source;

@UiController("hethonggiamsat_Source.edit")
@UiDescriptor("source-edit.xml")
@EditedEntityContainer("sourceDc")
@LoadDataBeforeShow
public class SourceEdit extends StandardEditor<Source> {
}