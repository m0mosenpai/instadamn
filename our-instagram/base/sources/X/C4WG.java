package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4WG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WG {
    public static final C4WG A01 = new C4WG(new ArrayList());
    public final List A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((C4WG) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C4WG(List list) {
        this.A00 = C4VT.A00(list.toArray(new C4WH[0]));
    }
}
