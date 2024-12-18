package X;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W1m {
    public final XC1 A00;
    public final Map A01;

    public W1m(XC1 xc1, String str, String str2, Map map) {
        C14360o3.A0B(str2, 3);
        this.A00 = xc1;
        HashMap hashMap = new HashMap();
        this.A01 = hashMap;
        hashMap.put("composer_session_id", str);
        hashMap.put(MSV.A00(248), str2);
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static final void A00(W1m w1m, String str, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(w1m.A01);
        if (map != null) {
            hashMap.putAll(map);
        }
        HashMap hashMap2 = new HashMap();
        if (hashMap.containsKey("debug_message")) {
            hashMap2.put("debug_message", hashMap.get("debug_message"));
        }
        if (hashMap.containsKey("media_composition_hash")) {
            hashMap2.put("media_composition_hash", hashMap.get("media_composition_hash"));
        }
        if (hashMap.containsKey("reason")) {
            hashMap2.put("reason", hashMap.get("reason"));
        }
        if (hashMap.containsKey("retry_attempt_number")) {
            hashMap2.put("retry_attempt_number", hashMap.get("retry_attempt_number"));
        }
        if (hashMap.containsKey("decoder_debug_info")) {
            hashMap2.put("decoder_debug_info", hashMap.get("decoder_debug_info"));
        }
        hashMap.put("debug_info", hashMap2.toString());
        XC1 xc1 = w1m.A00;
        if (xc1 != null) {
            xc1.logEvent(str, hashMap);
        }
    }
}
