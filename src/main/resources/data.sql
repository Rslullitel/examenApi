INSERT INTO `usuarios` (`id`, `username`, `password`)
VALUES ('1', 'rama', '12345')ON DUPLICATE KEY UPDATE id = VALUES(id);