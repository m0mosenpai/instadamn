package X;

import java.io.Serializable;

/* renamed from: X.1wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41991wp implements Serializable {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C41991wp) {
            C41991wp c41991wp = (C41991wp) obj;
            if (this.A00 == c41991wp.A00 && this.A01 == c41991wp.A01) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C41991wp(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
