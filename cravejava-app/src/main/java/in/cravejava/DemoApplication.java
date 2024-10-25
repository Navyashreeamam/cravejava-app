@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args); }

    @Bean
    CommandLineRunner initDatabase(AuthorRepository authorRepository, BookRepository bookRepository) {
        return args -> {
            // Add authors and books here
        };
    }
}
