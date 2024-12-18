package X;

import java.util.Map;

/* loaded from: classes10.dex */
public abstract class T6D implements InterfaceC65261Tgr {
    public transient Map A00;
    public transient java.util.Set A01;

    public static Map A00(T6D t6d) {
        Map map = t6d.A00;
        if (map == null) {
            AbstractC60698RNa abstractC60698RNa = (AbstractC60698RNa) t6d;
            TZG tzg = new TZG(abstractC60698RNa, abstractC60698RNa.A01);
            t6d.A00 = tzg;
            return tzg;
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC65261Tgr)) {
            return false;
        }
        return A00(this).equals(A00((T6D) ((InterfaceC65261Tgr) obj)));
    }

    public final int hashCode() {
        return A00(this).hashCode();
    }

    public final String toString() {
        return ((TZG) A00(this)).A02.toString();
    }
}
