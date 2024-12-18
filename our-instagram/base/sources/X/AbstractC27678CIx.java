package X;

import android.util.LruCache;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CIx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27678CIx {
    public static void A00(C57352kA c57352kA, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L0A l0a = (L0A) it.next();
            String str = l0a.A00;
            String str2 = l0a.A01;
            LruCache lruCache = c57352kA.A05;
            if (str2 == null) {
                str2 = "";
            }
            lruCache.put(str, str2);
        }
    }
}
