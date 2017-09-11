// environment specific settings
environments {
    development {

        grails {
            mongo {
                host = "localhost"
                port = 27107
                username = "user-dev"
                password = "user-dev"
                databaseName = "inventory-manager-dev"
            }
        }
        /*
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
        }*/
    }
    test {
        grails {
            mongo {
                host = "localhost"
                port = 27107
                username = "user-test"
                password = "user-test"
                databaseName = "inventory-manager-test"
            }
        }
        /*
        dataSource {
            dbCreate = "update"
        }*/
    }
    production {
        grails {
            mongo {
                host = "localhost"
                port = 27107
                username = "user-prod"
                password = "user-prod"
                databaseName = "inventory-manager-prod"
            }
        }
        /*
        dataSource {
            dbCreate = "update"
            properties {
                // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
                jmxEnabled = true
                initialSize = 5
                maxActive = 50
                minIdle = 5
                maxIdle = 25
                maxWait = 10000
                maxAge = 10 * 60000
                timeBetweenEvictionRunsMillis = 5000
                minEvictableIdleTimeMillis = 60000
                validationQuery = "SELECT 1"
                validationQueryTimeout = 3
                validationInterval = 15000
                testOnBorrow = true
                testWhileIdle = true
                testOnReturn = false
                jdbcInterceptors = "ConnectionState"
                defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            }
        }*/
    }
}
