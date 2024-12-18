package X;

/* renamed from: X.9n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219569n4 extends AbstractC219589n6 {
    public final int A00;
    public final int A01;

    public C219569n4(int i, int i2) {
        this.A01 = -1;
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C219569n4) {
                C219569n4 c219569n4 = (C219569n4) obj;
                if (this.A01 != c219569n4.A01 || this.A00 != c219569n4.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C219569n4() {
        this(-1, -1);
    }
}
