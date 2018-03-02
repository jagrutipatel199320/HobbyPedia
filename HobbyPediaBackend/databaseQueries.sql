CREATE TABLE category (
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	is_active BOOLEAN,
	CONSTRAINT pk_category_id PRIMARY KEY (id) 

);

INSERT INTO category (name, description,is_active) VALUES ('Cooking', 'Cooking Description',true);
INSERT INTO category (name, description,is_active) VALUES ('Sports', 'Sports Description',true);
INSERT INTO category (name, description,is_active) VALUES ('Fashion', 'Fashion Description',true);


CREATE TABLE user_detail (
	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(60),
	email VARCHAR(100),
	contact_number VARCHAR(15),	
	CONSTRAINT pk_user_id PRIMARY KEY(id)
);
