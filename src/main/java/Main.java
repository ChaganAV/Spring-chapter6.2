import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Hello world");
        comment.setAutor("Alex Ben");

        String value = service.publishComment(comment);

        logger.info(value);
    }
}
