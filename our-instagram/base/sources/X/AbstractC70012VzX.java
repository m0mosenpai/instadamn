package X;

import com.google.common.collect.HashBiMap;
import java.util.HashMap;

/* renamed from: X.VzX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70012VzX {
    public static final HashMap A00 = new HashMap();

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.VMa] */
    public static final WD7 A00(String str) {
        WD7 wd7;
        C14360o3.A0B(str, 0);
        HashMap hashMap = A00;
        synchronized (hashMap) {
            wd7 = (WD7) hashMap.get(str);
            if (wd7 == null) {
                HashBiMap hashBiMap = WD7.A09;
                wd7 = new WD7(new Object(), str);
                hashMap.put(str, wd7);
            }
        }
        return wd7;
    }
}
