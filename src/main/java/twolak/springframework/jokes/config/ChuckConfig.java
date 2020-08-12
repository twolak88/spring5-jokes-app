package twolak.springframework.jokes.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class ChuckConfig {
    
//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
	return new ChuckNorrisQuotes();
    }

}
