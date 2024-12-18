package X;

import java.util.Map;

/* renamed from: X.3hY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79833hY {
    public final Map A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Map map = this.A00;
            Map map2 = ((C79833hY) obj).A00;
            if (map != map2 && (map == null || !map.equals(map2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Map map = this.A00;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public C79833hY(Map map) {
        this.A00 = map;
    }
}
