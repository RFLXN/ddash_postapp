package postapp.exception;
import javax.servlet.ServletException;

public class EmptyInputtedException extends ServletException {
    public EmptyInputtedException() {
        super("データを入力されていません。");
    }
}
