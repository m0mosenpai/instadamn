package X;

/* renamed from: X.KNo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45761KNo extends AbstractC46410KgW {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45761KNo) {
                C45761KNo c45761KNo = (C45761KNo) obj;
                if (this.A01 != c45761KNo.A01 || this.A00 != c45761KNo.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C45761KNo(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
