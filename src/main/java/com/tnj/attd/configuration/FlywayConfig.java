package com.tnj.attd.configuration;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class FlywayConfig {
    @Bean(name = "flyway")
    @Profile("!test")
    Flyway flyway(DataSource dataSource) {
        Flyway flywayConfig = Flyway.configure()
                .dataSource(dataSource)
                .locations("classpath:/db/auto") // где лежат файлы с миграциями
                .sqlMigrationPrefix("V") // имя файла миграции имеет шаблон "V<номер>__<название>.sql"
                .validateOnMigrate(false)
                .outOfOrder(true)
                .table("migration_schema") // в какой таблице будет храниться история миграций
                .baselineOnMigrate(true)
                .load();
        flywayConfig.repair();
        flywayConfig.migrate();
        return flywayConfig;
    }
}
