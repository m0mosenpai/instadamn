package X;

import android.util.SparseBooleanArray;

/* renamed from: X.4WO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WO {
    public final SparseBooleanArray A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4WO)) {
            return false;
        }
        return this.A00.equals(((C4WO) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C4WO(SparseBooleanArray sparseBooleanArray) {
        this.A00 = sparseBooleanArray;
    }
}
