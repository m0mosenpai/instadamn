package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.63l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1340363l {
    public Integer A00;
    public final C69I A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final java.util.Set A05;
    public final java.util.Set A06;

    public C1340363l(C69I c69i, String str, String str2, Map map, java.util.Set set) {
        java.util.Set unmodifiableSet = Collections.unmodifiableSet(set);
        this.A05 = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.A04 = map;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = c69i == null ? C69I.A00 : c69i;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("zaa");
        }
        this.A06 = Collections.unmodifiableSet(hashSet);
    }
}
