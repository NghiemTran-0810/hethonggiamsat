package com.company.hethonggiamsat.web.screens.timerange;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.TimeRange;

@UiController("hethonggiamsat_TimeRange.browse")
@UiDescriptor("time-range-browse.xml")
@LookupComponent("timeRangesTable")
@LoadDataBeforeShow
public class TimeRangeBrowse extends StandardLookup<TimeRange> {
}