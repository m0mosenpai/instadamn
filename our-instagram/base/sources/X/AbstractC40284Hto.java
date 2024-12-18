package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hto, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40284Hto {
    public static Map A00(JKV jkv) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        jkv.C5G();
        A1I.put("tap_state", Integer.valueOf(jkv.C5G()));
        if (jkv.C5L() != null) {
            A1I.put("tap_state_str_id", jkv.C5L());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
