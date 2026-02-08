package ru.lessons.lesson5.step0;

public class MySQLConnectorImpl extends AbstractDBConnector {

    public MySQLConnectorImpl(String username, String password, String host, int port, String database) {
        super(username, password, host, port, database);
    }
}
