package X;

import java.util.AbstractCollection;
import java.util.HashMap;

/* renamed from: X.LDp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47895LDp {
    public static final HashMap A01 = AbstractC166987dD.A1G();
    public static final HashMap A00 = AbstractC166987dD.A1G();

    public static final void A00(String str, String str2) {
        HashMap hashMap = A00;
        if (!hashMap.containsKey(str2)) {
            hashMap.put(str2, AbstractC16830sb.A05(str));
            return;
        }
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str2);
        if (abstractCollection == null) {
            return;
        }
        abstractCollection.add(str);
    }
}
