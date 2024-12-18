package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VOI {
    public static Map A00(XGB xgb) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xgb.AwO() != null) {
            linkedHashMap.put("default_selected_donation_value", xgb.AwO());
        }
        if (xgb.Ays() != null) {
            linkedHashMap.put("donation_amount_selector_values", xgb.Ays());
        }
        if (xgb.BQF() != null) {
            linkedHashMap.put("maximum_donation_amount", xgb.BQF());
        }
        if (xgb.BU9() != null) {
            linkedHashMap.put("minimum_donation_amount", xgb.BU9());
        }
        if (xgb.Bfb() != null) {
            linkedHashMap.put("prefill_amount", xgb.Bfb());
        }
        if (xgb.CDp() != null) {
            linkedHashMap.put("user_currency", xgb.CDp());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
