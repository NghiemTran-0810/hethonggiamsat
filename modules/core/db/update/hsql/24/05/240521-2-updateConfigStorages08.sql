alter table HETHONGGIAMSAT_CONFIG_STORAGES add constraint FK_HETHONGGIAMSAT_CONFIG_STORAGES_ON_PLACE foreign key (PLACE_ID) references HETHONGGIAMSAT_PLACE(ID);
