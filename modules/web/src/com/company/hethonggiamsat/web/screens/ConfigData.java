package com.company.hethonggiamsat.web.screens;

import com.company.hethonggiamsat.entity.*;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.*;
import com.haulmont.cuba.gui.app.core.inputdialog.DialogActions;
import com.haulmont.cuba.gui.app.core.inputdialog.InputDialog;
import com.haulmont.cuba.gui.app.core.inputdialog.InputParameter;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.core.global.PersistenceHelper;
import com.haulmont.cuba.gui.screen.ScreenOptions;
import javax.inject.Inject;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.company.hethonggiamsat.entity.Language;
import com.haulmont.cuba.gui.components.TokenList;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.components.data.options.ContainerOptions;

import java.util.Collection;

@UiController("hethonggiamsat_ConfigData")
@UiDescriptor("config-data.xml")
@LoadDataBeforeShow
public class ConfigData extends Screen {
    @Inject
    private UiComponents uiComponents;
    @Inject
    private Dialogs dialogs;
    @Inject
    private Notifications notifications;
    @Inject
    private MetadataTools metadataTools;
    @Inject
    private DataManager dataManager;
    @Inject
    private Metadata metadata;
    @Inject
    private CollectionLoader<ConfigStorages> configStoragesesDl;
    @Inject
    private CollectionContainer<ConfigStorages> configStoragesesDc;
    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private CollectionContainer<Language> languagesDc;
    @Inject
    private TokenList<Language> languagesList;

    @Subscribe
    private void onInit(InitEvent event) {
        configStoragesesDl.load();
    }

public Component generatorThaoTac(ConfigStorages configStorages) {
    HBoxLayout hBoxLayout = uiComponents.create(HBoxLayout.class);
    hBoxLayout.setSpacing(true);

    LinkButton btnDelete = uiComponents.create(LinkButton.class);
    btnDelete.setAlignment(Component.Alignment.MIDDLE_CENTER);
    btnDelete.setIcon("font-icon:TRASH");
    btnDelete.setStyleName("iconBtnDelete");
    btnDelete.addClickListener(clickEvent -> {
        dialogs.createOptionDialog()
                .withCaption("Confirm deletion")
                .withMessage("Are you sure you want to delete this item?")
                .withActions(
                        new DialogAction(DialogAction.Type.YES).withHandler(e -> {
                            dataManager.remove(configStorages);
                            configStoragesesDc.getMutableItems().remove(configStorages);
                        }),
                        new DialogAction(DialogAction.Type.NO)
                )
                .show();
    });

    LinkButton btnEdit = uiComponents.create(LinkButton.class);
    btnEdit.setAlignment(Component.Alignment.MIDDLE_CENTER);
    btnEdit.setIcon("font-icon:EDIT");
    btnEdit.setStyleName("iconBtnEdit");
    btnEdit.addClickListener(clickEvent -> openEditScreen(configStorages));

    hBoxLayout.setAlignment(Component.Alignment.MIDDLE_CENTER);
    hBoxLayout.add(btnDelete);
    hBoxLayout.add(btnEdit);
    return hBoxLayout;
}

    private void openEditScreen(ConfigStorages configStorages) {
        Screen editorScreen = screenBuilders.editor(ConfigStorages.class, this)
                .editEntity(configStorages)
                .withScreenId("hethonggiamsat_ConfigStorages.edit")
                .build();

        editorScreen.addAfterCloseListener(afterCloseEvent -> {
            if (afterCloseEvent.closedWith(StandardOutcome.COMMIT)) {
                configStoragesesDl.load();
            }
        });

        editorScreen.show();
    }

    @Install(to = "configStoragesesTable.stt", subject = "columnGenerator")
    private Component generateSTT(ConfigStorages configStorages) {
        Label<String> sttLabel = uiComponents.create(Label.TYPE_STRING);
        sttLabel.setValue(String.valueOf(configStoragesesDc.getItems().indexOf(configStorages) + 1));

        // Ensure the entity is managed before accessing the source attribute
        if (!PersistenceHelper.isNew(configStorages) && !PersistenceHelper.isDetached(configStorages)) {
            // Reload the ConfigStorages entity with the source attribute
            ConfigStorages managedConfigStorages = dataManager.load(ConfigStorages.class)
                    .id(configStorages.getId())
                    .view("configStorages-view") // Ensure the view includes the source attribute
                    .one();

            // Access the source attribute from the managed entity
            String sourceName = managedConfigStorages.getSource() != null ? managedConfigStorages.getSource().getNameSource() : "";

            // Update the label value with the source name
            sttLabel.setValue(sourceName);
        }

        return sttLabel;
    }

    @Subscribe("showDialogBtn")
    private void onCustomParameterBtnClick(Button.ClickEvent event) {
        dialogs.createInputDialog(this)
                .withCaption("Enter values")
                .withParameters(
                        InputParameter.stringParameter("topic").withCaption("Chủ đề"),
                        InputParameter.stringParameter("keyword").withCaption("Từ khóa"),
                        InputParameter.stringParameter("exclusion").withCaption("Loại trừ"),
                        //InputParameter.intParameter("numOfRecords").withCaption("Số lượng bản ghi"),
                        InputParameter.parameter("language")
                                .withField(() -> {
                                    LookupField<Language> field = uiComponents.create(LookupField.of(Language.class));
                                    field.setOptionsList(dataManager.load(Language.class).list());
                                    field.setOptionCaptionProvider(Language::getNameLanguage);
                                    field.setCaption("Ngôn ngữ");
                                    field.setWidthFull();
                                    return field;
                                }),
                        InputParameter.parameter("source")
                                .withField(() -> {
                                    LookupField<Source> field = uiComponents.create(LookupField.of(Source.class));
                                    field.setOptionsList(dataManager.load(Source.class).list());
                                    field.setOptionCaptionProvider(Source::getNameSource);
                                    field.setCaption("Nguồn");
                                    field.setWidthFull();
                                    return field;
                                }),
                        InputParameter.parameter("timeRange")
                                .withField(() -> {
                                    LookupField<TimeRange> field = uiComponents.create(LookupField.of(TimeRange.class));
                                    field.setOptionsList(dataManager.load(TimeRange.class).list());
                                    field.setOptionCaptionProvider(TimeRange::getTimeRange);
                                    field.setCaption("Khoảng thời gian");
                                    field.setWidthFull();
                                    return field;
                                }),
                        InputParameter.parameter("place")
                                .withField(() -> {
                                    LookupField<Place> field = uiComponents.create(LookupField.of(Place.class));
                                    field.setOptionsList(dataManager.load(Place.class).list());
                                    field.setOptionCaptionProvider(Place::getNamePlace);
                                    field.setCaption("Địa điểm");
                                    field.setWidthFull();
                                    return field;
                                })
                )
                .withActions(DialogActions.OK_CANCEL)
                .withCloseListener(closeEvent -> {
                    if (closeEvent.getCloseAction().equals(InputDialog.INPUT_DIALOG_OK_ACTION)) {
                        String topic = closeEvent.getValue("topic");
                        String keyword = closeEvent.getValue("keyword");
                        String exclusion = closeEvent.getValue("exclusion");
                        Integer numOfRecords = closeEvent.getValue("numOfRecords");
                        Language selectedLanguage = closeEvent.getValue("language");
                        Source selectedSource = closeEvent.getValue("source");
                        TimeRange selectedTimeRange = closeEvent.getValue("timeRange");
                        Place selectedPlace = closeEvent.getValue("place");

                        //Reload entities to ensure they are managed and attached
                        Language language = dataManager.reload(selectedLanguage, "language-view");
                        Source source = dataManager.reload(selectedSource, "source-view");
                        TimeRange timeRange = dataManager.reload(selectedTimeRange, "timeRange-view");
                        Place place = dataManager.reload(selectedPlace, "place-view");

                        // Create and save the new ConfigStorages entity
                        ConfigStorages configStorages = metadata.create(ConfigStorages.class);
                        configStorages.setTopicName(topic);
                        configStorages.setKeyword(keyword);
                        configStorages.setExclusion(exclusion);
                        //configStorages.setNumOfRecords(numOfRecords);
                        configStorages.setNumOfRecords(0); // Fixed value set to 0
                        configStorages.setLanguage(language);
                        configStorages.setSource(source);
                        configStorages.setTimeRange(timeRange);
                        configStorages.setPlace(place);
                        dataManager.commit(configStorages);

                        // Refresh the table to include the new entity
                        configStoragesesDl.load();
                    }
                })
                .show();
    }

    @Subscribe("languagesList")
    public void onLanguagesListValueChange(HasValue.ValueChangeEvent<Collection<Language>> event) {
        System.out.println(languagesList.getValue());
    }

}
