alter table HETHONGGIAMSAT_CONFIG_STORAGES add constraint FK_HETHONGGIAMSAT_CONFIG_STORAGES_ON_TIME_RANGE foreign key (TIME_RANGE_ID) references HETHONGGIAMSAT_TIME_RANGE(ID);