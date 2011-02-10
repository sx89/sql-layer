/**
 * Copyright (C) 2011 Akiban Technologies Inc.
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses.
 */

package com.akiban.ais.loader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionUtils
{
    private static Logger logger = LoggerFactory.getLogger(ConnectionUtils.class.getName());
    

    public static boolean executeMultiQuery(Connection connection, String multiQuery) throws SQLException
    {
        String[] queries = multiQuery.split(";");
        boolean result = true;
        for(String query : queries)
        {
            query = query.trim();
            if(query == null || query.isEmpty()) {
                continue;
            }
            Statement statement = connection.createStatement();
            result &= statement.execute(query);
        }
        return result;
    }
    
    public static boolean execute(Connection connection, String query) throws SQLException
    {
        Statement statement = connection.createStatement();
        boolean result = statement.execute(query);
        return result;
    }
    
    public static int executeUpdate(Connection connection, String query) throws SQLException
    {
        PreparedStatement statement = connection.prepareStatement(query);
        int result = statement.executeUpdate();
        return result;
    }
    
    public static ResultSet executeQuery(Connection connection, String query) throws SQLException
    {
        ResultSet rs = null;
        PreparedStatement statement = connection.prepareStatement(query);
        rs = statement.executeQuery();
        return rs;
    }
    
    public static Connection connect(String host, String port, String dbName, String userName, String password)
    {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
        return connect(url, userName, password);
    }
    
    public static Connection connect(String host, String port, String userName, String password)
    {
        String url = "jdbc:mysql://" + host + ":" + port + "/";
        return connect(url, userName, password);
    }

    private static Connection connect(String url, String userName, String password)
    {
        Connection connection = null;

        try
        {
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            logger.info("Creating connection to URL '" + url + "' with u=" + userName + " and p=" + password);
            connection = DriverManager.getConnection (url, userName, password);
            logger.info("Database connection established");
        }
        catch (Exception e)
        {
            throw new RuntimeException("Cannot connect to database server: " + url, e);
        }
        return connection;
    }
    
    public static void disconnect(Connection connection)
    {
        if(connection == null)
        {
            return;
        }
        
        try
        {
            connection.close ();
            logger.info("Database connection closed");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
