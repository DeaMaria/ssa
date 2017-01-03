package es.gorka.edu.connection;

import java.sql.Connection;

public interface ConnectionManager {

	Connection open();

	void close(Connection conn);

}
