package courses.exc;

/**
 * Created by chenxi on 2017-03-04.
 */
public class DaoException extends Exception {
  private final Exception originalException;

  public DaoException(Exception originalException, String msg) {
    super(msg);
    this.originalException = originalException;
  }
}
