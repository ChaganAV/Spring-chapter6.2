import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Hello world");
        comment.setAutor("Alex Ben");

        service.publishComment(comment);
    }
}
