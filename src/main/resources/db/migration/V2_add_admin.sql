
INSERT INTO public.users(
    id, archive, email, name, password, role)
VALUES (2, false, 'mail@mail.ru', 'admin', '$2a$10$wfG9yAa0hEOJAZPHPIswN.ha1sn47Ar7t15Idphaa7xEq5wyzPDJ6', 'ADMIN');


ALTER SEQUENCE user_seq RESTART WITH 2;