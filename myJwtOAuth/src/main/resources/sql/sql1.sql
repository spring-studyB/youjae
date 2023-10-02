USE myOAuthP;

CREATE TABLE member (
	member_id int NOT NULL auto_increment,
    email varchar(100),
    password varchar(100),
    nickname varchar(100),
    image_url varchar(100),
    age int,
    city varchar(100),
    role varchar(10),
    social_type varchar(10),
    social_id varchar(100),
    refresh_token varchar(100),
    
    primary key(member_id)
);