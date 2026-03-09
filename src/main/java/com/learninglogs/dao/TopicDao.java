package com.learninglogs.dao;

import com.learninglogs.entity.Topic;

import java.util.ArrayList;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║       Topic DAO Interface                            ║
 * ║                                                      ║
 * ║   This file is PROVIDED for you. No changes needed!  ║
 * ║   It extends the tutorial with a new method.         ║
 * ╚══════════════════════════════════════════════════════╝
 *
 * What is a DAO?
 *   DAO = Data Access Object
 *   It separates database logic from business logic.
 *
 * New in this workshop: findTopicByName()
 *   - Searches for a topic by name (case-insensitive)
 *   - Needed for preventing duplicate topic names (bonus)
 *   - Teaches the WHERE clause — a new SQL concept!
 *
 * Compare this with EntryDao.java — same pattern, different entity.
 */
public interface TopicDao {

    /**
     * Insert a new topic into the database.
     *
     * @param topic The Topic object to insert
     * @return true if inserted successfully, false otherwise
     */
    boolean insertTopic(Topic topic);

    /**
     * Fetch all topics from the database.
     *
     * @return ArrayList of all Topic objects
     */
    ArrayList<Topic> fetchAllTopics();

    /**
     * Find a topic by its name (case-insensitive).
     * Returns the Topic if found, or null if not found.
     *
     * @param name The topic name to search for
     * @return The matching Topic, or null if not found
     */
    Topic findTopicByName(String name);
}
