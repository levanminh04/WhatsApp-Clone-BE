package levanminh.Whatsapp_Clone_BE.wire.postgresql.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"levanminh.Whatsapp_Clone_BE"})
@EnableJpaAuditing
public class DatabaseConfiguration {

}
