package com.company.hethonggiamsat.web.screens.source;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.Source;

@UiController("hethonggiamsat_Source.browse")
@UiDescriptor("source-browse.xml")
@LookupComponent("sourcesTable")
@LoadDataBeforeShow
public class SourceBrowse extends StandardLookup<Source> {
}