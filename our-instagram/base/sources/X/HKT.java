package X;

/* loaded from: classes7.dex */
public final class HKT extends AbstractC127945qN {
    public final C132835z6 A00;
    public final boolean A01;
    public final boolean A02;

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        if (abstractC127945qN instanceof HKT) {
            HKT hkt = (HKT) abstractC127945qN;
            if (hkt.A02 == this.A02 && hkt.A01 == this.A01) {
                return true;
            }
        }
        return false;
    }

    public HKT(C127915qK c127915qK, C132835z6 c132835z6, boolean z, boolean z2) {
        super(c127915qK, c132835z6.A03);
        this.A00 = c132835z6;
        this.A02 = z;
        this.A01 = z2;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 29L;
    }
}
