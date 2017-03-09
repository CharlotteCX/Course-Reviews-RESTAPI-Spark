package courses.exc;

/**
 * Created by chenxi on 2017-03-06.
 */
public class ApiError extends RuntimeException {
  private final int status;

  public ApiError(int status, String msg) {
    super(msg);
    this.status = status;
  }

  public int getStatus() {
    return status;
  }
}
