package X;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4IG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IG implements C4IH {
    public static final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final java.util.Set A00;

    public C4IG(String str) {
        HashSet hashSet = new HashSet();
        if (str.length() > 0) {
            for (String str2 : new C11L(";").A03(str)) {
                if (str2.length() > 0) {
                    hashSet.add(str2);
                }
            }
        }
        this.A00 = hashSet;
    }
}
