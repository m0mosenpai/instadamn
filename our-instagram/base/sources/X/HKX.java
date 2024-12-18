package X;

/* loaded from: classes7.dex */
public final class HKX extends AbstractC127945qN implements InterfaceC127985qR {
    public long A00;
    public boolean A01;
    public final C132835z6 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HKX(C127915qK c127915qK, C132835z6 c132835z6) {
        super(c127915qK, c132835z6.A03);
        C14360o3.A0B(c132835z6, 1);
        this.A02 = c132835z6;
        this.A01 = true;
        this.A00 = -1L;
    }

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        if ((abstractC127945qN instanceof HKX) && ((HKX) abstractC127945qN).A01 == this.A01) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 28L;
    }

    @Override // X.InterfaceC127985qR
    public final long Bb4() {
        return this.A00;
    }

    @Override // X.InterfaceC127985qR
    public final void EaT(long j) {
        this.A00 = j;
    }
}
