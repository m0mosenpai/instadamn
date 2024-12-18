package X;

/* loaded from: classes9.dex */
public final class P46 implements InterfaceC65530Tm0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ N5U A01;

    @Override // X.InterfaceC65530Tm0
    public final void onFailure(Throwable th) {
    }

    public P46(N5U n5u, int i) {
        this.A01 = n5u;
        this.A00 = i;
    }

    @Override // X.InterfaceC65530Tm0
    public final void DqB(Integer num) {
        N5U n5u = this.A01;
        if (n5u.getContext() != null && num != null) {
            N5U.A06(n5u, AbstractC167007dF.A1Q(num.intValue(), this.A00));
        }
    }
}
