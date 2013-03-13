-- Database: "BPMN2"
-- DROP DATABASE "BPMN2";
CREATE DATABASE "BPMN2"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese, Brazil'
       LC_CTYPE = 'Portuguese, Brazil'
       CONNECTION LIMIT = -1;
	   
-- Table: workflowprocess
-- DROP TABLE workflowprocess;
CREATE TABLE workflowprocess
(
  id bigint NOT NULL,
  idworkflowprocess character varying(255),
  name character varying(255),
  CONSTRAINT workflowprocess_pkey PRIMARY KEY (id )
)
WITH (
  OIDS=FALSE
);
ALTER TABLE workflowprocess
  OWNER TO postgres;
  
-- Table: pool
-- DROP TABLE pool;
CREATE TABLE pool
(
  id bigint NOT NULL,
  boundaryvisible boolean,
  idpool character varying(255),
  name character varying(255),
  process_id bigint,
  CONSTRAINT pool_pkey PRIMARY KEY (id ),
  CONSTRAINT fk260c3c30d3bb89 FOREIGN KEY (process_id)
      REFERENCES workflowprocess (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE pool
  OWNER TO postgres;
  
-- Table: lane
-- DROP TABLE lane;
CREATE TABLE lane
(
  id bigint NOT NULL,
  idlane character varying(255),
  name character varying(255),
  parentpool_id bigint,
  CONSTRAINT lane_pkey PRIMARY KEY (id ),
  CONSTRAINT fk24060c84660022 FOREIGN KEY (parentpool_id)
      REFERENCES pool (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE lane
  OWNER TO postgres;
  
-- Table: activity
-- DROP TABLE activity;
CREATE TABLE activity
(
  id bigint NOT NULL,
  idactivity character varying(255),
  name character varying(255),
  type integer,
  process_id bigint,
  CONSTRAINT activity_pkey PRIMARY KEY (id ),
  CONSTRAINT fka126572f30d3bb89 FOREIGN KEY (process_id)
      REFERENCES workflowprocess (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE activity
  OWNER TO postgres;
  
-- Table: transition
-- DROP TABLE transition;
CREATE TABLE transition
(
  id bigint NOT NULL,
  idtransition character varying(255),
  type integer,
  from_id bigint,
  process_id bigint,
  to_id bigint,
  CONSTRAINT transition_pkey PRIMARY KEY (id ),
  CONSTRAINT fk100d497530d3bb89 FOREIGN KEY (process_id)
      REFERENCES workflowprocess (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk100d4975d52a0bb1 FOREIGN KEY (from_id)
      REFERENCES activity (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk100d4975ff2d5740 FOREIGN KEY (to_id)
      REFERENCES activity (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE transition
  OWNER TO postgres;