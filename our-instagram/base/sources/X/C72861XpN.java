package X;

import android.util.SparseBooleanArray;

/* renamed from: X.XpN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72861XpN {
    public final SparseBooleanArray A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72861XpN)) {
            return false;
        }
        return this.A00.equals(((C72861XpN) obj).A00);
    }

    public final int A00(int i) {
        SparseBooleanArray sparseBooleanArray = this.A00;
        int size = sparseBooleanArray.size();
        if (i >= 0 && i < size) {
            return sparseBooleanArray.keyAt(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C72861XpN(SparseBooleanArray sparseBooleanArray) {
        this.A00 = sparseBooleanArray;
    }
}
