package X;

import java.util.HashMap;

/* renamed from: X.87G, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87G extends AbstractC52922bZ {
    public final HashMap A01 = new HashMap();
    public final HashMap A00 = new HashMap();

    public final C87H A00(String str) {
        HashMap hashMap = this.A01;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new C87H());
        }
        Object obj = hashMap.get(str);
        if (obj != null) {
            return (C87H) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C183298Bb A01(String str) {
        HashMap hashMap = this.A00;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new C183298Bb());
        }
        Object obj = hashMap.get(str);
        if (obj != null) {
            return (C183298Bb) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
