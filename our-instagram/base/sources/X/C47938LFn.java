package X;

import java.util.Map;

/* renamed from: X.LFn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47938LFn {
    public static final C47938LFn A01 = new C47938LFn();
    public final Map A00 = AbstractC166987dD.A1G();

    public final void A00(C55942hf c55942hf, String str) {
        if (str != null) {
            Map map = this.A00;
            if (!map.containsKey(c55942hf)) {
                map.put(c55942hf, str);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12("configName is required");
    }

    public C47938LFn() {
        A00(C55942hf.A02, "default config");
    }
}
