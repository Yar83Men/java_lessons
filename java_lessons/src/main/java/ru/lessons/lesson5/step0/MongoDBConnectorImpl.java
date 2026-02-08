package ru.lessons.lesson5.step0;

public class MongoDBConnectorImpl extends AbstractDBConnector {

    public MongoDBConnectorImpl(String username, String password, String host, int port, String database) {
        super(username, password, host, port, database);
    }
}
