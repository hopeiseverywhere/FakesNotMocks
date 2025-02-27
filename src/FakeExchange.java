import java.util.HashMap;
import java.util.Map;

public class FakeExchange implements Exchange {
    private Map<String, Float> rates;
    private String accessKey;

    public FakeExchange(String accessKey) {
        this.accessKey = accessKey;
        rates = Map.of(
                "USD_Euro", 0.95f,
                "Euro_USD", 1.05f,
                "USD_JPY", 149.2f,
                "JPY_USD", 0.0067f);

    }

    @Override
    public float rate(String origin, String target) {
        String key = origin + "_" + target;
        return rates.get(key);
    }

}
