create table CriminalElements(
    id varchar primary key,
    subElement varchar not null,
    objElement varchar not null
);

create table CriminalCase(
    id varchar primary key,
    name varchar not null,
    caseTime long not null
);

create table Procuratorate(
    id varchar primary key,
    name varchar(50) not null unique
);

create table Prosecutor(
    id varchar primary key,
    name varchar not null
);