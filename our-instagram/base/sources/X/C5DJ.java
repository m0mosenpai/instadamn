package X;

import java.util.Map;

/* renamed from: X.5DJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DJ {
    public int[] A00 = C5DK.A00;
    public Object[] A01 = C5DK.A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5DJ)) {
                if (obj instanceof Map) {
                    if (0 != ((Map) obj).size()) {
                        return false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }
}
