package X;

import java.util.Map;

/* renamed from: X.Gpv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38128Gpv {
    public final Map A00 = AbstractC166987dD.A1G();

    public final java.util.Set A00(String str, String str2) {
        C14360o3.A0B(str, 0);
        String A0p = AbstractC37301Gc2.A0p(str, str2);
        Map map = this.A00;
        Object obj = map.get(A0p);
        if (obj == null) {
            obj = AbstractC166987dD.A1H();
            map.put(A0p, obj);
        }
        return (java.util.Set) obj;
    }
}
