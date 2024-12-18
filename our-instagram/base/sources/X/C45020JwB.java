package X;

/* renamed from: X.JwB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45020JwB extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45020JwB) {
                C45020JwB c45020JwB = (C45020JwB) obj;
                if (this.A00 != c45020JwB.A00 || this.A01 != c45020JwB.A01 || this.A02 != c45020JwB.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + AbstractC25228BEl.A03(this.A02);
    }

    public C45020JwB(int i, int i2, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }
}
