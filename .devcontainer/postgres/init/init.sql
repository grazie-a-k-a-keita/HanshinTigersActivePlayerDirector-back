-- Project Name : noname
-- Date/Time    : 2024/06/16 14:03:07
-- Author       : ono keita
-- RDBMS Type   : Oracle Database
-- Application  : A5:SQL Mk-2

/*
  << 注意！！ >>
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
  この機能は A5:SQL Mk-2でのみ有効であることに注意してください。
*/

-- active_player
-- * RestoreFromTempTable
create table active_player (
  id serial not null
  , age integer not null
  , back_number character varying(255)
  , birthday character varying(255)
  , name character varying(255)
  , constraint active_player_PKC primary key (id)
) ;

comment on table active_player is 'active_player';
comment on column active_player.id is 'id';
comment on column active_player.age is 'age';
comment on column active_player.back_number is 'back_number';
comment on column active_player.birthday is 'birthday';
comment on column active_player.name is 'name';

insert into public.active_player(age,back_number,birthday,name) values 
    (30,'17','1993-12-11','青柳 晃洋')
  , (33,'21','1991-04-26','秋山 拓巳')
  , (31,'33','1992-11-11','糸原 健斗');
