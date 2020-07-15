package postapp.exception;

import javax.servlet.ServletException;

public class DataEmptyException extends ServletException {
    public DataEmptyException() {
        super("受け取ったデータがありません。");
    }
}
