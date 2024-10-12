package lk.ijse.notecollectorspringboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Value("${secure.username}") // use value injection
    private String username;
    @Value("${secure.password}")
    private String password;
    @Value("${secure.role}")
    private String role;

    @Bean
    SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests()
                .anyRequest().authenticated() // ena hama request ekakama check karanava (user ta me sysytem eka athule wada karanna puluvanda kiyala balanava)
                .and()
                .httpBasic(); // security handle karanne "Basic Auth" mechanism eken
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails principleUser = User.withDefaultPasswordEncoder()
                .username(username)
                .password(password)
                .roles(role).build(); // user kenekva hada gannava
        return new InMemoryUserDetailsManager(principleUser);
    }

}

// java and springboot use karala Basic Auth use karapu hati thama me class eken karanne