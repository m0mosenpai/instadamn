package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178017va {
    public final Map A00;

    public static void A01(C178017va c178017va, Object obj, Object obj2, Object obj3) {
        c178017va.A02(InterfaceC178107vj.A01, false);
        c178017va.A02(InterfaceC178107vj.A0F, obj);
        c178017va.A02(InterfaceC178107vj.A03, obj2);
        c178017va.A02(InterfaceC178107vj.A02, obj3);
    }

    public final void A02(C178037vc c178037vc, Object obj) {
        this.A00.put(c178037vc, obj);
    }

    public C178017va(C178027vb c178027vb) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        hashMap.putAll(c178027vb.A00);
    }

    public static void A00(C178017va c178017va, C178037vc c178037vc, boolean z) {
        c178017va.A02(c178037vc, Boolean.valueOf(z));
    }

    public C178017va(String str) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        hashMap.put(C178027vb.A02, str);
    }
}
