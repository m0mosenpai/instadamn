package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Twc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65931Twc {
    public static Map A00(C44G c44g) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c44g.AwO() != null) {
            linkedHashMap.put("default_selected_donation_value", c44g.AwO());
        }
        if (c44g.Ays() != null) {
            linkedHashMap.put("donation_amount_selector_values", c44g.Ays());
        }
        if (c44g.BQF() != null) {
            linkedHashMap.put("maximum_donation_amount", c44g.BQF());
        }
        if (c44g.BU9() != null) {
            linkedHashMap.put("minimum_donation_amount", c44g.BU9());
        }
        if (c44g.Bfb() != null) {
            linkedHashMap.put("prefill_amount", c44g.Bfb());
        }
        if (c44g.CDp() != null) {
            linkedHashMap.put("user_currency", c44g.CDp());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
