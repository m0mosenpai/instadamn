package X;

import java.util.Iterator;

/* renamed from: X.RNf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60703RNf extends AbstractC64896TYw implements java.util.Set {
    public transient AbstractC60708RNk A00;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AbstractC25235BEs.A06(it.next());
        }
        return i;
    }
}
