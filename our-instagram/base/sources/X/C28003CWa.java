package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CWa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28003CWa {
    public final Map A00;

    public final float A00(Object obj) {
        Number number = (Number) this.A00.get(obj);
        if (number != null) {
            return number.floatValue();
        }
        return Float.NaN;
    }

    public final Object A01(float f) {
        Object next;
        Iterator A15 = AbstractC166997dE.A15(this.A00);
        if (!A15.hasNext()) {
            next = null;
        } else {
            next = A15.next();
            if (A15.hasNext()) {
                float A01 = AbstractC166987dD.A01(f, AbstractC166987dD.A09(((Map.Entry) next).getValue()));
                do {
                    Object next2 = A15.next();
                    float A012 = AbstractC166987dD.A01(f, AbstractC166987dD.A09(((Map.Entry) next2).getValue()));
                    if (Float.compare(A01, A012) > 0) {
                        next = next2;
                        A01 = A012;
                    }
                } while (A15.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public final Object A02(float f, boolean z) {
        Object next;
        float f2;
        float f3;
        Iterator A15 = AbstractC166997dE.A15(this.A00);
        if (!A15.hasNext()) {
            next = null;
        } else {
            next = A15.next();
            if (A15.hasNext()) {
                float A09 = AbstractC166987dD.A09(((Map.Entry) next).getValue());
                if (z) {
                    f2 = A09 - f;
                } else {
                    f2 = f - A09;
                }
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = A15.next();
                    float A092 = AbstractC166987dD.A09(((Map.Entry) next2).getValue());
                    if (z) {
                        f3 = A092 - f;
                    } else {
                        f3 = f - A092;
                    }
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (A15.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28003CWa)) {
            return false;
        }
        return C14360o3.A0K(this.A00, ((C28003CWa) obj).A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00);
    }

    public C28003CWa(Map map) {
        this.A00 = map;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MapDraggableAnchors(");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
