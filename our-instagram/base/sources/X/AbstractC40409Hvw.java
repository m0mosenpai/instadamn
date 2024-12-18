package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hvw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40409Hvw {
    public static Map A00(JLB jlb) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlb.getAttributionAppId() != null) {
            A1I.put("attribution_app_id", jlb.getAttributionAppId());
        }
        if (jlb.getAttributionAppName() != null) {
            A1I.put("attribution_app_name", jlb.getAttributionAppName());
        }
        if (jlb.AdO() != null) {
            A1I.put("attribution_url", jlb.AdO());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
