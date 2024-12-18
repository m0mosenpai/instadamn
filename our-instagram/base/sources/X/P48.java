package X;

/* loaded from: classes9.dex */
public final class P48 implements InterfaceC65530Tm0 {
    public final /* synthetic */ N5U A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    @Override // X.InterfaceC65530Tm0
    public final void onFailure(Throwable th) {
    }

    public P48(N5U n5u, boolean z, boolean z2) {
        this.A00 = n5u;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // X.InterfaceC65530Tm0
    public final void DqB(Integer num) {
        N5U n5u = this.A00;
        if (n5u.getContext() != null && num != null) {
            N5U.A09(n5u, this.A01, this.A02);
        }
    }
}
