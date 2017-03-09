package hello;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(final long idGreeting, final String contentGreeting) {
        this.id = idGreeting;
        this.content = contentGreeting;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
