package com.learninglogs.entity;

import java.sql.Timestamp;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║       Topic Entity                                   ║
 * ║                                                      ║
 * ║   This file is PROVIDED. No changes needed!          ║
 * ║   You completed this in the tutorial — study it.     ║
 * ╚══════════════════════════════════════════════════════╝
 *
 * A Topic represents a subject you are learning about.
 * This class maps to the `topics` table in your database:
 *
 *   ┌─────────────────────────────────────────────┐
 *   │  topics table                                │
 *   ├────────────┬────────────────────────────────┤
 *   │ id         │ INT, AUTO_INCREMENT, PRIMARY KEY│
 *   │ name       │ VARCHAR(100), NOT NULL          │
 *   │ created_at │ TIMESTAMP                       │
 *   │ updated_at │ TIMESTAMP                       │
 *   └────────────┴────────────────────────────────┘
 *
 * Database Column → Java Field:
 *   id         → int id
 *   name       → String name
 *   created_at → Timestamp createdAt
 *   updated_at → Timestamp updatedAt
 *
 * Use this as a REFERENCE when building Entry.java!
 * Entry follows the exact same pattern.
 */
public class Topic {

    private int id;
    private String name;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    /**
     * Simple constructor for INSERT operations.
     * The database generates id and timestamps automatically.
     */
    public Topic(String name) {
        this.name = name;
    }

    /**
     * Full constructor for reading from the database.
     * Used when you have all column values from a ResultSet.
     */
    public Topic(int id, String name, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + name + " (Created: " + createdAt + ")";
    }
}
