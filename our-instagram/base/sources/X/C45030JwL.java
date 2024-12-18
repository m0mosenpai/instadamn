package X;

/* renamed from: X.JwL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45030JwL extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45030JwL) {
                C45030JwL c45030JwL = (C45030JwL) obj;
                if (this.A00 != c45030JwL.A00 || this.A01 != c45030JwL.A01 || this.A02 != c45030JwL.A02 || this.A03 != c45030JwL.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }

    public C45030JwL(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }
}
