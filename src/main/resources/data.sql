INSERT INTO position (id, name, salary)
VALUES (x'fffffffffffffffffffffffffffffffd', 'position1', 2);
INSERT INTO position (id, name, salary)
VALUES (x'ffffffffffffffffffffffffffffffff', 'position2', 10);

INSERT INTO stuff (id, surname, name, patronymic, sex, birth_date, salary_multiplier,position_id)
VALUES (x'ddddddddddddddddddddddddddddddde', 'surname2', 'name2', 'patronymic2',TRUE,now(),1.1,x'fffffffffffffffffffffffffffffffd');
INSERT INTO stuff (id, surname, name, patronymic, sex, birth_date, salary_multiplier, position_id)
VALUES (x'dddddddddddddddddddddddddddddddf', 'surname2', 'name2', 'patronymic2',TRUE,now(),1.1, x'ffffffffffffffffffffffffffffffff');

INSERT INTO office (id,name,address, law_address,cabinets_count)
VALUES (x'0000000000000000000000000000000e','name1', 'address1', 'lawAddress1', 101);
INSERT INTO office (id,name,address, law_address,cabinets_count)
VALUES (x'0000000000000000000000000000000f','name2', 'address2', 'lawAddress2', 111);

INSERT INTO client (id,surname,name,patronymic,sex,birth_date,inn,passport_serial,phone)
VALUES (x'5555555555555555555555555555555e', 'surname1', 'name1', 'patronymic1', TRUE,now(), '11111111','1212 211212','890099099009');
INSERT INTO client (id,surname,name,patronymic,sex,birth_date,inn,passport_serial,phone)
VALUES (x'5555555555555555555555555555555f', 'surname2', 'name2', 'patronymic2', TRUE,now(), '11111111','1212 211212','890099099009');

INSERT INTO offer (id, serial_numbers, sign_date, ending_date, start_date, stuff_id, client_id, office_id)
VALUES (x'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaae', '2122213', now(), now(),now(),x'ddddddddddddddddddddddddddddddde',x'5555555555555555555555555555555e',x'0000000000000000000000000000000e');
INSERT INTO offer (id, serial_numbers, sign_date, ending_date, start_date, stuff_id, client_id, office_id)
VALUES (x'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaf', '2122213', now(), now(),now(),x'dddddddddddddddddddddddddddddddf',x'5555555555555555555555555555555f',x'0000000000000000000000000000000f');