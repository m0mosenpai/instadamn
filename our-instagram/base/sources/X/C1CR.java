package X;

/* renamed from: X.1CR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CR implements C1CQ {
    public final boolean A00;

    public C1CR(boolean z) {
        this.A00 = z;
    }

    @Override // X.C1CQ
    public final C09530e4 AIp(C1QW c1qw, C1QY c1qy) {
        int i;
        if (c1qy.A00() == C1Ef.OnScreen) {
            i = 2;
        } else {
            i = 4;
            if (c1qy.A00() == C1Ef.OffScreen) {
                i = 3;
            }
        }
        return new C09530e4(Integer.valueOf(i), Boolean.valueOf(this.A00));
    }

    public C1CR() {
        this(true);
    }
}
