DROP TABLE IF EXISTS "user";

CREATE TABLE "user" (
  id uuid NOT NULL,
  first_name VARCHAR(250) NOT NULL,

  CONSTRAINT pk_user PRIMARY KEY (id)
);