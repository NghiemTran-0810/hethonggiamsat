package com.company.hethonggiamsat.web.screens.language;

import com.haulmont.cuba.gui.screen.*;
import com.company.hethonggiamsat.entity.Language;

@UiController("hethonggiamsat_Language.edit")
@UiDescriptor("language-edit.xml")
@EditedEntityContainer("languageDc")
@LoadDataBeforeShow
public class LanguageEdit extends StandardEditor<Language> {
}