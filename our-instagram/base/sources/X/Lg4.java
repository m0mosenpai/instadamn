package X;

/* loaded from: classes8.dex */
public final class Lg4 implements InterfaceC31037Dkb {
    public final /* synthetic */ LF0 A00;

    public Lg4(LF0 lf0) {
        this.A00 = lf0;
    }

    @Override // X.InterfaceC31037Dkb
    public final void DVx() {
        LF0 lf0 = this.A00;
        JQn.A00(lf0.A00, (C41761wQ) AbstractC166987dD.A17(lf0.A07), lf0, 5);
    }

    @Override // X.InterfaceC31037Dkb
    public final void onFailure() {
        LF0 lf0 = this.A00;
        JQn.A00(lf0.A00, (C41761wQ) AbstractC166987dD.A17(lf0.A07), lf0, 5);
    }

    @Override // X.InterfaceC31037Dkb
    public final void onSuccess() {
        LF0 lf0 = this.A00;
        ((C48519LdH) lf0.A05.getValue()).A05(C05F.A00);
        LKa.A02(lf0.A01, C05F.A0C, false);
        AbstractC167007dF.A17(lf0.A04.A00.ARD(), "EB_BLOCK_RELEASE_IMPRESSION");
    }
}
