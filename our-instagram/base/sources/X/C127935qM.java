package X;

/* renamed from: X.5qM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127935qM extends AbstractC127945qN implements InterfaceC127965qP, InterfaceC127985qR {
    public long A00;
    public final C130535uy A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C127935qM(C130535uy c130535uy, C127915qK c127915qK, boolean z) {
        super(c127915qK, c130535uy.A0A);
        C14360o3.A0B(c130535uy, 2);
        this.A01 = c130535uy;
        this.A02 = z;
        this.A00 = -1L;
    }

    @Override // X.InterfaceC127975qQ
    public final C38321qM BQN() {
        C38321qM c38321qM = this.A01.A00().A02;
        if (c38321qM != null) {
            return c38321qM;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC127985qR
    public final long Bb4() {
        return this.A00;
    }

    @Override // X.InterfaceC127965qP
    public final boolean CQJ() {
        return this.A02;
    }

    @Override // X.InterfaceC127965qP
    public final String getId() {
        return this.A01.A0A;
    }

    @Override // X.InterfaceC127985qR
    public final void EaT(long j) {
        this.A00 = j;
    }
}
