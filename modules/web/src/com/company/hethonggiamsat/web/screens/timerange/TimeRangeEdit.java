package com.company.hethonggiamsat.web.screens.timerange;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.TimeRange;

@UiController("hethonggiamsat_TimeRange.edit")
@UiDescriptor("time-range-edit.xml")
@EditedEntityContainer("timeRangeDc")
@LoadDataBeforeShow
public class TimeRangeEdit extends StandardEditor<TimeRange> {
}