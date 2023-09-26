CREATE TABLE cambio (
    id SERIAL,
    from_currency VARCHAR(3) NOT NULL,
    to_currency VARCHAR(3) NOT NULL,
    conversion_factor NUMERIC(65,2) NOT NULL,
	PRIMARY KEY (id)
);