package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.8Px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186808Px {
    public final HashMap A01 = new HashMap();
    public final HashMap A00 = new HashMap();

    public final List A00(String str) {
        C14360o3.A0B(str, 0);
        return (List) this.A01.get(str);
    }

    public final void A01(String str, List list) {
        C14360o3.A0B(str, 0);
        this.A01.put(str, list);
    }
}
