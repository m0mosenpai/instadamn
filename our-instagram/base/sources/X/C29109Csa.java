package X;

/* renamed from: X.Csa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29109Csa implements InterfaceC116905Qw {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC116905Qw
    public final void D5F() {
    }

    public C29109Csa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        AbstractC153666vb abstractC153666vb;
        int i = this.A00;
        C14360o3.A0B(c37818GkY, 0);
        Object obj = this.A01;
        switch (i) {
            case 0:
                abstractC153666vb = ((C27940CSz) obj).A00;
                break;
            case 1:
                abstractC153666vb = ((CTC) obj).A00;
                break;
            default:
                abstractC153666vb = ((CTD) obj).A01;
                break;
        }
        abstractC153666vb.A02(((C124275jh) c37818GkY.A01).BbA());
    }

    @Override // X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
    }
}
