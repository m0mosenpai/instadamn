package X;

import androidx.compose.runtime.Recomposer;

/* renamed from: X.9Hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC207909Hw {
    public static final void A00(C57U c57u) {
        C05A c05a;
        C57K c57k;
        C57J c57j;
        int i;
        do {
            c05a = Recomposer.A0N;
            c57k = (C57K) c05a.getValue();
            c57j = (C57J) c57k;
            C57M c57m = c57j.A00;
            C1127257c c1127257c = (C1127257c) c57m.get(c57u);
            if (c1127257c != null) {
                C57O c57o = c57m.A00;
                if (c57u != null) {
                    i = c57u.hashCode();
                } else {
                    i = 0;
                }
                C57O A0I = c57o.A0I(c57u, i, 0);
                if (c57o != A0I) {
                    if (A0I == null) {
                        c57m = C57M.A02;
                        C14360o3.A0C(c57m, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
                    } else {
                        c57m = new C57M(A0I, c57m.size() - 1);
                    }
                }
                Object obj = c1127257c.A01;
                C57L c57l = C57L.A00;
                boolean z = false;
                if (obj != c57l) {
                    z = true;
                    Object obj2 = c57m.get(obj);
                    C14360o3.A0A(obj2);
                    c57m = c57m.A04(obj, new C1127257c(((C1127257c) obj2).A01, c1127257c.A00));
                }
                Object obj3 = c1127257c.A00;
                boolean z2 = false;
                if (obj3 != c57l) {
                    z2 = true;
                    Object obj4 = c57m.get(obj3);
                    C14360o3.A0A(obj4);
                    c57m = c57m.A04(obj3, new C1127257c(obj, ((C1127257c) obj4).A00));
                }
                if (z) {
                    obj3 = c57j.A01;
                }
                if (z2) {
                    obj = c57j.A02;
                }
                c57j = new C57J(c57m, obj3, obj);
            }
            if (c57k == c57j) {
                return;
            }
        } while (!c05a.AIi(c57k, c57j));
    }
}
