package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63622uj {
    public final Map A00 = new HashMap();

    public final C59062n7 A00(String str) {
        C14360o3.A0B(str, 0);
        C59062n7 c59062n7 = (C59062n7) this.A00.get(str);
        if (c59062n7 == null) {
            C59062n7 c59062n72 = C59062n7.A07;
            C14360o3.A08(c59062n72);
            return c59062n72;
        }
        return c59062n7;
    }

    public final void A01(C59062n7 c59062n7, String str) {
        C14360o3.A0B(str, 0);
        this.A00.put(str, c59062n7);
    }
}
