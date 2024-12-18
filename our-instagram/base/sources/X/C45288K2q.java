package X;

/* renamed from: X.K2q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45288K2q extends C0T6 implements MNW {
    public final C5Hc A00;
    public final C5Hc A01;
    public final boolean A02;

    public C45288K2q(C5Hc c5Hc, C5Hc c5Hc2, boolean z) {
        C14360o3.A0B(c5Hc, 1);
        this.A00 = c5Hc;
        this.A02 = z;
        this.A01 = c5Hc2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45288K2q) {
                C45288K2q c45288K2q = (C45288K2q) obj;
                if (!C14360o3.A0K(this.A00, c45288K2q.A00) || this.A02 != c45288K2q.A02 || !C14360o3.A0K(this.A01, c45288K2q.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45288K2q() {
        /*
            r2 = this;
            X.5HZ r1 = X.C5HZ.A01
            r0 = 0
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45288K2q.<init>():void");
    }
}
