package X;

import java.util.Arrays;

/* renamed from: X.4Yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97324Yr {
    public int A00;
    public final int A01;
    public final C4WE[] A02;

    public final C4WE[] A00() {
        return (C4WE[]) this.A02.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.A02, ((C97324Yr) obj).A02);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = 527 + Arrays.hashCode(this.A02);
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    public C97324Yr(C4WE... c4weArr) {
        this.A02 = c4weArr;
        this.A01 = c4weArr.length;
    }
}
