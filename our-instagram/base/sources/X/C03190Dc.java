package X;

import android.content.Context;
import android.os.Binder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Dc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03190Dc {
    public final Map A00;
    public final java.util.Set A01;

    public final boolean A03(C0LG c0lg, boolean z) {
        Object A04;
        if (c0lg != null && c0lg.A04() != null && (A04 = c0lg.A04()) != null) {
            for (C0B5 c0b5 : this.A01) {
                if (A04.equals(c0b5) || (z && C0B8.A00.A00(c0b5).contains(A04))) {
                    return true;
                }
            }
            Map map = this.A00;
            for (C0B5 c0b52 : map.keySet()) {
                if (A04.equals(c0b52) || (z && C0B8.A00.A00(c0b52).contains(A04))) {
                    Iterator it = c0lg.A03.iterator();
                    while (it.hasNext()) {
                        if (((java.util.Set) map.get(c0b52)).contains(it.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C03190Dc)) {
            return false;
        }
        C03190Dc c03190Dc = (C03190Dc) obj;
        java.util.Set set = c03190Dc.A01;
        java.util.Set set2 = this.A01;
        if (set != null) {
            z = set.equals(set2);
        } else {
            z = false;
            if (set2 == null) {
                z = true;
            }
        }
        Map map = c03190Dc.A00;
        Map map2 = this.A00;
        if (map != null) {
            z2 = map.equals(map2);
        } else {
            z2 = false;
            if (map2 == null) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public C03190Dc(Map map) {
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            java.util.Set set = (java.util.Set) entry.getValue();
            if (set != null && set.contains("*|all_packages|*")) {
                hashSet.add(key);
            } else {
                if (!hashMap.containsKey(key)) {
                    hashMap.put(key, new HashSet());
                }
                ((java.util.Set) hashMap.get(key)).addAll(set);
            }
        }
        this.A01 = Collections.unmodifiableSet(hashSet);
        this.A00 = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public static C0LG A00(Context context, int i) {
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList(AbstractC08450c9.A05(context, i)));
        return new C0LG(null, null, unmodifiableList, Collections.singletonList(AbstractC08450c9.A01(context, (String) unmodifiableList.get(0))), i);
    }

    public static boolean A01(Context context) {
        try {
            return AbstractC08450c9.A03(context, context.getApplicationInfo().uid, Binder.getCallingUid());
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Deprecated
    public final boolean A02(Context context, int i) {
        return A03(A00(context, i), AbstractC08450c9.A02(context));
    }
}
