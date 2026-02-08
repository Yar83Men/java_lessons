package ru.lessons.lesson5.step0;

public class PostgreqlConnectorImpl extends AbstractDBConnector {

    public PostgreqlConnectorImpl(String username, String password, String host, int port, String database) {
        super(username, password, host, port, database);
    }
}
