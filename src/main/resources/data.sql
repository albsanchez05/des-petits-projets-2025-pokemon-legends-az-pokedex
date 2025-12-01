-- 1. TYPE (Types Elementaires)
INSERT INTO type (id, name) VALUES (1, 'Fighting');
INSERT INTO type (id, name) VALUES (2, 'Fire');
INSERT INTO type (id, name) VALUES (3, 'Grass');
INSERT INTO type (id, name) VALUES (4, 'Water');

-- 2. ABILITY (Habilites)
INSERT INTO ability (id, name, description) VALUES (1, '''Overgrow'']', 'Description for ''Overgrow'']');
INSERT INTO ability (id, name, description) VALUES (2, '''Reckless'']', 'Description for ''Reckless'']');
INSERT INTO ability (id, name, description) VALUES (3, '''Thick Fat'']', 'Description for ''Thick Fat'']');
INSERT INTO ability (id, name, description) VALUES (4, '''Torrent'']', 'Description for ''Torrent'']');
INSERT INTO ability (id, name, description) VALUES (5, '[''Blaze'']', 'Description for [''Blaze'']');
INSERT INTO ability (id, name, description) VALUES (6, '[''Leaf Guard'']', 'Description for [''Leaf Guard'']');
INSERT INTO ability (id, name, description) VALUES (7, '[''Sheer Force'']', 'Description for [''Sheer Force'']');

-- 3. STAT_BLOCK (Blocs de Statistiques)
INSERT INTO stat_block (id, hp, attack, defense, special_attack, special_defense, speed) VALUES (001, 45, 49, 65, 49, 65, 45);
INSERT INTO stat_block (id, hp, attack, defense, special_attack, special_defense, speed) VALUES (002, 60, 62, 80, 63, 80, 60);
INSERT INTO stat_block (id, hp, attack, defense, special_attack, special_defense, speed) VALUES (003, 80, 82, 100, 83, 100, 80);
INSERT INTO stat_block (id, hp, attack, defense, special_attack, special_defense, speed) VALUES (004, 50, 65, 64, 44, 48, 43);
INSERT INTO stat_block (id, hp, attack, defense, special_attack, special_defense, speed) VALUES (005, 65, 80, 80, 59, 63, 58);
INSERT INTO stat_block (id, hp, attack, defense, special_attack, special_defense, speed) VALUES (006, 85, 105, 100, 79, 83, 78);
INSERT INTO stat_block (id, hp, attack, defense, special_attack, special_defense, speed) VALUES (007, 50, 65, 64, 44, 48, 43);
INSERT INTO stat_block (id, hp, attack, defense, special_attack, special_defense, speed) VALUES (008, 65, 80, 80, 59, 63, 58);
INSERT INTO stat_block (id, hp, attack, defense, special_attack, special_defense, speed) VALUES (009, 85, 105, 100, 79, 83, 78);

-- 4. POKEMON (Entites Principales)
INSERT INTO pokemon (id, name, number, catch_rate, generation, is_legendary, stat_id, image_path, is_registered) VALUES (001, 'Chikorita', 001, 45, 2, FALSE, 001, '/images/pokemon/001.png', FALSE);
INSERT INTO pokemon (id, name, number, catch_rate, generation, is_legendary, stat_id, image_path, is_registered) VALUES (002, 'Bayleef', 002, 45, 2, FALSE, 002, '/images/pokemon/002.png', FALSE);
INSERT INTO pokemon (id, name, number, catch_rate, generation, is_legendary, stat_id, image_path, is_registered) VALUES (003, 'Meganium', 003, 45, 2, FALSE, 003, '/images/pokemon/003.png', FALSE);
INSERT INTO pokemon (id, name, number, catch_rate, generation, is_legendary, stat_id, image_path, is_registered) VALUES (004, 'Totodile', 004, 45, 2, FALSE, 004, '/images/pokemon/004.png', FALSE);
INSERT INTO pokemon (id, name, number, catch_rate, generation, is_legendary, stat_id, image_path, is_registered) VALUES (005, 'Croconaw', 005, 45, 2, FALSE, 005, '/images/pokemon/005.png', FALSE);
INSERT INTO pokemon (id, name, number, catch_rate, generation, is_legendary, stat_id, image_path, is_registered) VALUES (006, 'Feraligatr', 006, 45, 2, FALSE, 006, '/images/pokemon/006.png', FALSE);
INSERT INTO pokemon (id, name, number, catch_rate, generation, is_legendary, stat_id, image_path, is_registered) VALUES (007, 'Tepig', 007, 45, 5, FALSE, 007, '/images/pokemon/007.png', FALSE);
INSERT INTO pokemon (id, name, number, catch_rate, generation, is_legendary, stat_id, image_path, is_registered) VALUES (008, 'Pignite', 008, 45, 5, FALSE, 008, '/images/pokemon/008.png', FALSE);
INSERT INTO pokemon (id, name, number, catch_rate, generation, is_legendary, stat_id, image_path, is_registered) VALUES (009, 'Emboar', 009, 45, 5, FALSE, 009, '/images/pokemon/009.png', FALSE);

-- 5. LIAISONS M:N (Pokemon -> Types)
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (001, 3);
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (002, 3);
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (003, 3);
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (004, 4);
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (005, 4);
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (006, 4);
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (007, 2);
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (008, 2);
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (008, 1);
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (009, 2);
INSERT INTO pokemon_types (pokemon_id, type_id) VALUES (009, 1);

-- 6. LIAISONS M:N (Pokemon -> Habilites)
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (001, 6);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (001, 1);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (002, 6);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (002, 1);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (003, 6);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (003, 1);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (004, 7);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (004, 4);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (005, 7);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (005, 4);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (006, 7);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (006, 4);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (007, 5);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (007, 3);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (008, 5);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (008, 3);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (009, 5);
INSERT INTO pokemon_abilities (pokemon_id, ability_id) VALUES (009, 2);