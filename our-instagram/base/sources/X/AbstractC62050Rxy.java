package X;

/* renamed from: X.Rxy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62050Rxy {
    public static String A00(int i) {
        if (i == 13) {
            return "NETWORK_PERF_REQUEST_CAP_BANDWIDTH_CALCULATION";
        }
        switch (i) {
            case 1:
                return "NETWORK_PERF_HTTP_RESPONSE_BODY_READ";
            case 2:
                return "NETWORK_PERF_HTTP_FLOW_TOP";
            case 3:
                return "NETWORK_PERF_HTTP_REQUEST_STAGED";
            case 4:
                return "NETWORK_PERF_HTTP_REQUEST_EXCHANGE";
            case 5:
                return "NETWORK_PERF_HTTP_DNS_RESOLUTION";
            case 6:
                return "NETWORK_PERF_HTTP_TLS_SETUP";
            case 7:
                return "NETWORK_PERF_HTTP_TCP_CONNECT";
            case 8:
                return "NETWORK_PERF_CDN_IMAGE_LOAD";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
