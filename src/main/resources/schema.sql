CREATE TABLE position (
id uuid PRIMARY KEY,
name VARCHAR(255) NULL,
salary INTEGER NULL
);
CREATE TABLE stuff (
id uuid PRIMARY KEY,
surname VARCHAR(255) NULL,
name VARCHAR(255) NULL,
patronymic VARCHAR(255) NULL,
sex BOOLEAN NULL,
birth_date DATE NULL,
salary_multiplier DOUBLE NULL,
position_id uuid NOT NULL,
FOREIGN KEY (position_id) REFERENCES position(id)
);
CREATE TABLE office (
id uuid PRIMARY KEY,
name VARCHAR(255) NULL,
address VARCHAR(255) NULL,
law_address VARCHAR(255) NULL,
cabinets_count INTEGER NULL
);
CREATE TABLE client (
id UUID PRIMARY KEY,
surname VARCHAR(225),
name VARCHAR(255),
patronymic VARCHAR(255),
sex BOOLEAN,
birth_date DATE,
inn VARCHAR(255),
passport_serial VARCHAR(255),
phone VARCHAR
);
CREATE TABLE offer (
id uuid PRIMARY KEY,
serial_numbers VARCHAR(225) NULL,
sign_date Date NULL,
ending_date Date NULL,
start_date Date NULL,
stuff_id uuid NOT NULL,
client_id uuid NOT NULL,
office_id uuid NOT NULL,
FOREIGN KEY (stuff_id) REFERENCES stuff(id),
FOREIGN KEY (client_id) REFERENCES client(id),
FOREIGN KEY (office_id) REFERENCES office(id)
);