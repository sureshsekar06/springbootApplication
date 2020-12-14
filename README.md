-- public.userdata definition

-- Drop table

-- DROP TABLE public.userdata;

CREATE TABLE public.userdata (
	user_name varchar(50) NOT NULL,
	user_id varchar(50) NOT NULL,
	user_role varchar(50) NOT NULL,
	task_id varchar(50) NOT NULL,
	user_task varchar(5000) NULL
);
CREATE INDEX userdata_user_id_idx ON public.userdata USING btree (user_id, user_role);
