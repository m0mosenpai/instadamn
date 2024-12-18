package X;

/* loaded from: classes7.dex */
public final class HLC extends AbstractC154286wd {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ J1L A02;

    public HLC(J1L j1l, boolean z, boolean z2) {
        this.A02 = j1l;
        this.A00 = z;
        this.A01 = z2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1795616787);
        J1L j1l = this.A02;
        j1l.A00 = C05F.A01;
        j1l.A02.Dlr(abstractC115105If, this.A00);
        C0f9.A0A(-1663184689, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        C0f9.A0A(1301473624, C0f9.A03(-503756726));
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1077356137);
        this.A02.A02.Dls();
        C0f9.A0A(-224485703, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1679446473);
        InterfaceC74303Vl interfaceC74303Vl = (InterfaceC74303Vl) obj;
        int A0N = AbstractC167017dG.A0N(interfaceC74303Vl, 907386811);
        J1L j1l = this.A02;
        j1l.A00 = C05F.A0C;
        j1l.A02.Dlt(interfaceC74303Vl, this.A00, this.A01);
        C0f9.A0A(-579817962, A0N);
        C0f9.A0A(1583739031, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(110326807);
        C0f9.A0A(1820023169, C0f9.A03(-769826958));
        C0f9.A0A(1733970637, A03);
    }
}
