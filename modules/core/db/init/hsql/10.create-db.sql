-- begin HETHONGGIAMSAT_DATA_VALUE
create table HETHONGGIAMSAT_DATA_VALUE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ date not null,
    VALUE_ integer not null,
    --
    primary key (ID)
)^
-- end HETHONGGIAMSAT_DATA_VALUE

-- begin HETHONGGIAMSAT_CONFIG_STORAGES
create table HETHONGGIAMSAT_CONFIG_STORAGES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOPIC_NAME varchar(255),
    KEYWORK varchar(255),
    EXCLUSION varchar(255),
    NUM_OF_RECORDS integer,
    LANGUAGE_ID varchar(36),
    SOURCE_ID varchar(36),
    TIME_RANGE_ID varchar(36),
    PLACE_ID varchar(36),
    --
    primary key (ID)
)^
-- end HETHONGGIAMSAT_CONFIG_STORAGES
-- begin HETHONGGIAMSAT_LANGUAGE
create table HETHONGGIAMSAT_LANGUAGE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME_LANGUAGE varchar(255),
    --
    primary key (ID)
)^
-- end HETHONGGIAMSAT_LANGUAGE
-- begin HETHONGGIAMSAT_SOURCE
create table HETHONGGIAMSAT_SOURCE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME_SOURCE varchar(255),
    --
    primary key (ID)
)^
-- end HETHONGGIAMSAT_SOURCE
-- begin HETHONGGIAMSAT_PLACE
create table HETHONGGIAMSAT_PLACE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME_PLACE varchar(255),
    --
    primary key (ID)
)^
-- end HETHONGGIAMSAT_PLACE
-- begin HETHONGGIAMSAT_TIME_RANGE
create table HETHONGGIAMSAT_TIME_RANGE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIME_RANGE varchar(255),
    --
    primary key (ID)
)^
-- end HETHONGGIAMSAT_TIME_RANGE
