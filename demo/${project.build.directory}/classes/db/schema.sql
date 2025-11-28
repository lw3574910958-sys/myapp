-- 修改 src/main/resources/db/schema.sql
CREATE TABLE IF NOT EXISTS tb_user (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(100)
);