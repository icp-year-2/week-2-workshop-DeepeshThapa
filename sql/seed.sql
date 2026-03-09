-- ============================================================
-- Learning Logs Database — Sample Entries
-- ============================================================
-- Your database and topics already exist from the tutorial.
-- This file adds 10 sample entries (2 per topic) for testing.
--
-- Requires: 5 topics with IDs 1-5 from tutorial seed.sql
-- ============================================================

USE learning_logs;

-- Sample entries (2 per topic, references topic IDs 1-5)
INSERT INTO entries (topic_id, text) VALUES
(1, 'Python is a versatile language used for automation and web apps.'),
(1, 'Learning about list comprehensions makes code much cleaner.'),
(2, 'HTML, CSS, and JS are the holy trinity of front-end development.'),
(2, 'React is a powerful library for building interactive user interfaces.'),
(3, 'Data visualization is key to communicating complex insights.'),
(3, 'Pandas is the go-to library for data manipulation in Python.'),
(4, 'Supervised learning requires labeled datasets for training.'),
(4, 'Neural networks are inspired by the structure of the human brain.'),
(5, 'Encryption is essential for protecting sensitive user data.'),
(5, 'Always keep your software updated to patch known vulnerabilities.');
