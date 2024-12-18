package X;

/* loaded from: classes10.dex */
public final class TFJ implements InterfaceC27191Tt {
    public final SUA A00;
    public final C1QW A01;
    public final C1QY A02;
    public final InterfaceC65528Tlx A03;
    public final SQ7 A04;
    public final boolean A05;

    public TFJ(SUA sua, C1QW c1qw, C1QY c1qy, InterfaceC65528Tlx interfaceC65528Tlx, SQ7 sq7, boolean z) {
        C14360o3.A0B(sq7, 5);
        this.A03 = interfaceC65528Tlx;
        this.A01 = c1qw;
        this.A02 = c1qy;
        this.A05 = z;
        this.A04 = sq7;
        this.A00 = sua;
    }

    @Override // X.InterfaceC27201Tu
    public final void FAL(C1Ef c1Ef) {
        C14360o3.A0B(c1Ef, 0);
        C1QY c1qy = this.A02;
        c1qy.A01(c1Ef);
        C09530e4 AIp = C1CP.A03.AIp(this.A01, c1qy);
        int A0H = AbstractC166987dD.A0H(AIp.A00);
        boolean A1a = AbstractC166987dD.A1a(AIp.A01);
        Integer valueOf = Integer.valueOf(A0H);
        boolean z = !A1a;
        Boolean valueOf2 = Boolean.valueOf(z);
        InterfaceC65528Tlx interfaceC65528Tlx = this.A03;
        C14360o3.A0A(valueOf);
        C14360o3.A0A(valueOf2);
        interfaceC65528Tlx.AGv(A0H, z);
    }

    @Override // X.InterfaceC27201Tu
    public final void cancel() {
        this.A04.A00(this.A01, "cancellation_initiated");
        if (this.A05) {
            this.A03.cancel();
        }
    }

    @Override // X.InterfaceC27201Tu
    public final int getRequestId() {
        return this.A01.A04;
    }
}
