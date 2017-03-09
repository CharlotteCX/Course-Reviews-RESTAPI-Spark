package testing;

/**
 * Created by chenxi on 2017-03-05.
 */
public class ApiResponse {
  private final int status;
  private final String body;

  public ApiResponse(int status, String body) {
    this.status = status;
    this.body = body;
  }

  public int getStatus() {
    return status;
  }

  public String getBody() {
    return body;
  }
}
