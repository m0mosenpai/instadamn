package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.RQm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60759RQm extends RQv<String, List<String>> {
    public final Map A00;

    @Override // X.AbstractC451425u
    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00;
    }

    @Override // X.RQv, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && super.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override // X.RQv, java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if ((obj instanceof Map) && entrySet().equals(((Map) obj).entrySet())) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.RQv, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.get(obj);
    }

    public C60759RQm(Map map) {
        this.A00 = map;
    }

    @Override // X.RQv, java.util.Map
    public final java.util.Set entrySet() {
        return AbstractC103614ld.A04(new C64286T7v(1), super.entrySet());
    }

    @Override // X.RQv, java.util.Map
    public final int hashCode() {
        return AbstractC103614ld.A00(entrySet());
    }

    @Override // X.RQv, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty() || (super.size() == 1 && super.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override // X.RQv, java.util.Map
    public final java.util.Set keySet() {
        return AbstractC103614ld.A04(new C64286T7v(0), super.keySet());
    }

    @Override // X.RQv, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
