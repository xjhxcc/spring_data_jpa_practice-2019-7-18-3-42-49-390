alter table Prosecutor add constraint  CK_age check (age>18);
alter table Prosecutor add constraint  CK_sex check (sex in('男','女'));
alter table Prosecutor add constraint  CK_Experience check (experience > 0);