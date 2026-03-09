package com.learninglogs.dao;

import com.learninglogs.entity.Entry;

import java.util.ArrayList;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║       Entry DAO Interface                            ║
 * ║                                                      ║
 * ║   This file is PROVIDED for you. No changes needed!  ║
 * ║   Study it — then implement it in EntryDaoImpl.      ║
 * ╚══════════════════════════════════════════════════════╝
 *
 * This interface defines WHAT operations are available for entries.
 * You implement HOW they work in EntryDaoImpl.java.
 *
 * Compare this with TopicDao.java — same pattern, different entity.
 */
public interface EntryDao {

    /**
     * Insert a new entry into the database.
     *
     * @param entry The Entry object to insert
     * @return true if inserted successfully, false otherwise
     */
    boolean insertEntry(Entry entry);

    /**
     * Fetch all entries from the database.
     *
     * @return ArrayList of all Entry objects
     */
    ArrayList<Entry> fetchAllEntries();

    /**
     * Fetch entries that belong to a specific topic.
     *
     * @param topicId The ID of the topic to filter by
     * @return ArrayList of Entry objects for that topic
     */
    ArrayList<Entry> fetchEntriesByTopicId(int topicId);
}
