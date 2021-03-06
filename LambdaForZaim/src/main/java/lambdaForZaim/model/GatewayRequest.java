package lambdaForZaim.model;

import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class GatewayRequest {
  private String httpMethod;
  private String body;
  private String resource;
  private RequestContext requestContext;
  private QueryStringParameters queryStringParameters;
  private Map<String, List<String>> multiValueQueryStringParameters;
  private Map<String, String> headers;
  private Map<String, List<String>> multiValueHeaders;
  private String pathParameters;
  private String stageVariables;
  private String path;
  private Boolean isBase64Encoded;

  @Data
  public static class RequestContext {
    private String resourceId;
    private String apiId;
    private String httpMethod;
    private String requestId;
    private String accountId;
    private String stage;
    private Map<String, String> identity;
  }

  @Data
  public static class QueryStringParameters {
    private int n;
    private boolean amountOnly;
    private String period;
  }
}
