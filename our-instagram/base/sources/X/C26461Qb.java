package X;

/* renamed from: X.1Qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26461Qb {
    public C1U1 A00;
    public boolean A01;
    public final C1QW A02;
    public final C1QY A03;

    public C26461Qb(C1QW c1qw, C1QY c1qy) {
        C14360o3.A0B(c1qw, 1);
        C14360o3.A0B(c1qy, 2);
        this.A02 = c1qw;
        this.A03 = c1qy;
    }

    public final synchronized void A00() {
        C1U1 c1u1 = this.A00;
        if (c1u1 != null) {
            c1u1.A74();
        }
        this.A01 = true;
    }

    public final synchronized void A01(C1U1 c1u1) {
        this.A00 = c1u1;
        if (this.A01) {
            c1u1.A74();
        }
    }
}
