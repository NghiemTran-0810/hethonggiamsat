package com.company.hethonggiamsat.web.screens.language;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.Language;

@UiController("hethonggiamsat_Language.browse")
@UiDescriptor("language-browse.xml")
@LookupComponent("languagesTable")
@LoadDataBeforeShow
public class LanguageBrowse extends StandardLookup<Language> {
}