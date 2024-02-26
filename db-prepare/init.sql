CREATE TABLE lottery (
    ticket_id varchar(6) PRIMARY KEY NOT NULL,
    price INT NOT NULL,
    amount INT NOT NULL
);

CREATE TABLE role (
    id SERIAL PRIMARY KEY,
    role_name VARCHAR(255) NOT NULL
);

CREATE TABLE profile (
    id varchar(10) PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role_id INT,
    CONSTRAINT fk_role FOREIGN KEY(role_id) REFERENCES role(id)
);

CREATE TABLE userticket(
    id SERIAL PRIMARY KEY NOT NULL,
    user_id INT NOT NULL,
    ticket_id VARCHAR(6) NOT NULL,
    total_price INT,
    CONSTRAINT fk_user FOREIGN KEY(user_id) REFERENCES profile(id),
    CONSTRAINT fk_ticket FOREIGN KEY(ticket_id) REFERENCES lottery(ticket_id)
);